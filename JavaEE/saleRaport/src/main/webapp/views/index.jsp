<%@ page import="DataBase.DBController" %>
<%@ page import="java.util.List" %>
<%@ page import="Pojo.Policy" %>
<%@ page import="Pojo.Agent" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="pl">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Formularz</title>

    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <script ctype='text/javascript'>
        function zerofill(i) {
            return (i < 10 ? '0' : '') + i;
        }

    $( function() {
        var now = new Date();
        var today = now.getFullYear() + '-' + zerofill(now.getMonth() + 1) + '-' + now.getDate();
        $( "input[id^='datepicker']" ).datepicker({
            dateFormat: "yy-mm-dd",
            maxDate: "+d",
            minDate: "-60",
            monthNames: [ "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Pańdziernik", "Listopad", "Grudzień" ]
        }).val(today);
    } );
</script>

</head>
<body>

<nav class="navbar navbar-light bg-light mx-auto">
    <a class="navbar-brand mx-auto" href="/">
        <h4 class="text-primary">Raportowaczka Sprzedażowa</h4>
    </a>
</nav>
<div class="col-md-6 offset-md-3">
    <div class="form-group form-inline">
        <p class="font-weight-bold pt-4">Rejestracja sprzedaży jako ${agentObj}</p>
        <a class="pt-2 pl-4 text-muted text-right" href="/clearCookie">
            <small>>>zmien<<</small>
        </a>
    </div>
    <%@ include file="raportGenerator.jspf" %>





<%@ include file="formItself.jspf" %>



<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
