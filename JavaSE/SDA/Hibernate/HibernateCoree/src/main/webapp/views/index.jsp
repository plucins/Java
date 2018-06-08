<%@ page import="model.House" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.HouseDAO" %>
<!doctype html>
<html lang="en">
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-xs-12 offset-md-12 mt-5 p-5 rounded" style="background-color: #F0F0F0">

            <form action="/dodajeMieszkanca" method="post">
                <p>Tu dodaje mieszkanca</p>
                <div class="form-group">
                    <label for="name">Imie</label>
                    <input type="text" class="form-control" id="name">
                </div>
                <div class="form-group">
                    <label for="lastName">Nazwisko</label>
                    <input type="text" class="form-control" id="lastName">
                </div>

                <div class="form-group">
                    <label for="house">Wybierz Dom</label>
                    <select class="form-control" id="house">
                        <% List<House> houses = new HouseDAO().findAll();
                        for (House h: houses) {
                        %>
                        <option value="<%=h.getNumber()+","+h.getStreet() %>" ><%=h.getStreet() + " " + h.getNumber()%></option>
                        <% }%>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Dodaj</button>
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