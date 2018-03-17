<%@ page import="DataBase.DBController" %>
<%@ page import="java.util.List" %>
<%@ page import="Pojo.Policy" %>
<%@ page import="Pojo.Agent" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Formularz</title>
</head>
<body>


<nav class="navbar navbar-light bg-light mx-auto">
    <a class="navbar-brand mx-auto" href="/">
        <h4 class="text-primary">Raportowaczka Sprzedażowa</h4>
    </a>
</nav>
<div class="col-md-6 offset-md-3">
    <form action="add" method="post">
        <div class="form-group">
            <div class="form-group form-inline">
                <p class="font-weight-bold pt-4">Rejestracja sprzedaży jako ${agentObj}</p>
                <a class="pt-2 pl-4 text-muted text-right" href="/clearCookie">
                    <small>>>zmien<<</small>
                </a>
            </div>
            <select required class="form-control" id="brand" name="brand">
                <option disabled selected>Marka</option>
                <option>MTU</option>
                <option>MTU24</option>
                <option>YCD</option>
                <option>EH</option>
            </select>
            <label></label>
            <input type="text" class="form-control" pattern="[0-9]{11,}" required id="policyNumber" name="policyNumber"
                   placeholder="Numer Polisy">
            <label></label>
            <input type="text" class="form-control" required id="callerPhoneNumber" name="callerPhoneNumber"
                   placeholder="Numer dzwoniącego">
            <label></label>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text">PLN</span>
                </div>
                <input type="text" name="policyValue" placeholder="Składka" pattern="[0-9]{2,}" class="form-control" aria-label="Amount (to the nearest dollar)">
                <div class="input-group-append">
                    <span class="input-group-text">.00</span>
                </div>
            </div>
            <select class="form-control" required id="sourceIncome" name="sourceIncome">
                <option disabled selected>Kolejka</option>
                <option>pg_BS_leady_oferta_mieszkanie</option>
                <option>pg_BS_leady_oferta_pojazd</option>
                <option>pg_BS_leady_zbywca_MTU</option>
                <option>pg_cb_sprzedaz_porzucone_MTU</option>
                <option>pg_dialer_Byli_Klienci</option>
                <option>pg_EH_K_oferta</option>
                <option>pg_mail_YCD_leadyshortcake</option>
                <option>pg_mtu_dialer_OCN</option>
                <option>pg_mtu_dialer_rankomat</option>
                <option>pg_mtu_nieodebrane</option>
                <option>pg_MTU_sprzedaz</option>
                <option>pg_MTU_zawarcie_nowej_polisy</option>
                <option>pg_mtu24_baner</option>
                <option>pg_mtu24_dialer_3krok</option>
                <option>pg_mtu24_dialer_3krok_2i3</option>
                <option>pg_mtu24_oferta</option>
                <option>pg_ycd_dialer_3krok</option>
                <option>pg_ycd_dialer_mfind</option>
                <option>pg_ycd_dialer_rankomat</option>
                <option>pg_ycd_nieodebrane</option>
                <option>pg_YCD_oferta</option>
                <option>pg_YCD_zawarcie_umowy</option>
                <option>pracownik</option>
                <option>ręczne odnowienie</option>
                <option>ręczne odnowienie - YCD/MTU24.pl</option>
                <option>ręczne odnowienie - zadania iHestia</option>
                <option>zadania iHestia</option>
                <option>źródło własne</option>
            </select>
            <label></label>
            <div class="form-group">
                <textarea class="form-control" id="extraInfo" name="extraInfo" rows="2"
                          placeholder="Dodatkowe informacje"></textarea>
            </div>

            <div>
                <label for="agencyClient">Czy klient agencyjny</label>
            </div>
            <div class="form-check form-check-inline" id="agencyClient">
                <input class="form-check-input" type="radio" name="agencyClient" id="inlineRadio1" value="Nie"
                       checked="checked">
                <label class="form-check-label" for="inlineRadio1">Nie</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="agencyClient" id="inlineRadio2" value="Tak">
                <label class="form-check-label" for="inlineRadio2">Tak</label>
            </div>

        </div>

        <button type="submit" class="btn btn-primary btn-lg btn-block">Dodaj >></button>
    </form>
    <nav>
        <div class="nav nav-tabs mt-5" id="nav-tab" role="tablist">
            <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab"
               aria-controls="nav-home" aria-selected="true">Dziś</a>
            <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab"
               aria-controls="nav-profile" aria-selected="false">7 dni</a>
            <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab"
               aria-controls="nav-contact" aria-selected="false">30 dni</a>
        </div>
    </nav>
    <div class="tab-content" id="nav-tabContent">
        <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
            <table class="table">
                <%
                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 1);
                %>
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Brand</th>
                    <th scope="col">Numer Polisy</th>
                    <th scope="col">Składka</th>
                    <th scope="col">Kolejka</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int counter = 0;
                    for (Policy p : agentPolisiesList) {
                %>
                <tr>

                    <th scope="row"><%= ++counter%>
                    </th>
                    <td>
                        <%= p.getBrand()%>
                    </td>
                    <td>
                        <%= p.getPolicyNumber()%>
                    </td>
                    <td>
                        <%= p.getPolicyValue()%>
                    </td>
                    <td>
                        <%= p.getSourceIncome()%>
                    </td>

                </tr>
                <% }%>
                </tbody>
                <% } %>
            </table>
        </div>

        <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
            <table class="table">
                <%
                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 7);

                %>
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Brand</th>
                    <th scope="col">Numer Polisy</th>
                    <th scope="col">Składka</th>
                    <th scope="col">Kolejka</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int counter = 0;
                    for (Policy p : agentPolisiesList) {

                %>
                <tr>

                    <th scope="row"><%= ++counter%>
                    </th>
                    <td>
                        <%= p.getBrand()%>
                    </td>
                    <td>
                        <%= p.getPolicyNumber()%>
                    </td>
                    <td>
                        <%= p.getPolicyValue()%>
                    </td>
                    <td>
                        <%= p.getSourceIncome()%>
                    </td>

                </tr>
                <% }%>
                </tbody>
                <% } %>
            </table>
        </div>
        <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
            <table class="table">
                <%
                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 30);

                %>
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Brand</th>
                    <th scope="col">Numer Polisy</th>
                    <th scope="col">Składka</th>
                    <th scope="col">Kolejka</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int counter = 0;
                    for (Policy p : agentPolisiesList) {

                %>
                <tr>

                    <th scope="row"><%= ++counter%>
                    </th>
                    <td>
                        <%= p.getBrand()%>
                    </td>
                    <td>
                        <%= p.getPolicyNumber()%>
                    </td>
                    <td>
                        <%= p.getPolicyValue()%>
                    </td>
                    <td>
                        <%= p.getSourceIncome()%>
                    </td>
                </tr>
                <% }%>
                </tbody>
                <% } %>
            </table>
        </div>

    </div>
</div>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
