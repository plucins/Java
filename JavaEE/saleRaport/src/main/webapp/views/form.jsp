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
    <a class="navbar-brand mx-auto" href="#">
        <h4 class="text-primary">Raportowaczka Sprzedażowa</h4>
    </a>
</nav>
<div class="col-md-6 offset-md-3">
    <form action="addCookie" method="post">
        <div class="container mt-5">
            <h5>Podaj swoje dane</h5>
            <div class="row mt-4">
                <div class="col-sm">
                    <input type="text" class="form-control" pattern="[A-Za-z]{3,}" required id="name" name="name" placeholder="Imię">
                </div>
                <div class="col-sm">
                    <input type="text" class="form-control" pattern="[A-Za-z]{3,}" required id="lastName" name="lastName" placeholder="Nazwisko">
                </div>
                <div class="col-sm">
                    <input type="text" class="form-control" pattern="[0-9A-Za-z]{3,}" required id="domainLogin" name="domainLogin" placeholder="Login">
                </div>
            </div>
            <button type="submit" href="/" class="btn btn-primary btn-lg btn-block mt-5">Dodaj >></button>
        </div>

    </form>
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
