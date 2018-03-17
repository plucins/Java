<%@ page import="Pojo.Installment" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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

<nav class="navbar navbar-light bg-light">
    <div class="mx-auto">
        <img src="http://icons.iconarchive.com/icons/martin-berube/square-animal/256/Duck-icon.png" width="80"
             height="80" alt="">
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col">

            <p class="h3 text-warning mt-3">Harmonogram rat kredytu</p>

            <%
                List<Installment> installmentList = new ArrayList<>();
                    installmentList = (List<Installment>) request.getAttribute("schedule");

            %>

            <table class="table mt-4">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Kwota kapitału</th>
                    <th scope="col">Kwota odsetek</th>
                    <th scope="col">Opłaty stałe</th>
                    <th scope="col">Całkowita kwota raty</th>
                </tr>
                </thead>


                <tbody>
                    <% for(Installment i: installmentList) {%>
                    <tr>
                    <th scope="row">
                        <%= i.getNumber()%>
                    </th>
                    <td>
                        <%= i.getCapital()%>
                    </td>
                    <td>
                        <%= i.getInterest()%>
                    </td>
                    <td>
                        <%= i.getFixedFees()%>
                    </td>
                    <td>
                        <%= i.getTotalAmount()%>
                    </td>

                </tr>
                    <%}%>
                </tbody>
            </table>

            <form action="/pdf" method="get">
            <button type="submit" class="btn btn-warning btn-lg btn-block mt-5">generuj PDF</button>
            </form>
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
