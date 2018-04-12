<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
<body style="background-color:#595959;background-image: url('https://www.transparenttextures.com/patterns/food.png')">
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="/index">
        <img src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" width="30" height="30" alt="">
    </a>

</nav>

<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3 mt-5 p-5 rounded" style="background-color: #B09B74">

            <form action="/dodaj" method="post">
                <div class="form-group">
                    <label for="url">Tu plik</label>
                    <input type="text" class="form-control" id="url" name="url" placeholder="sciezka do pliku">
                </div>
                <button type="submit" class="btn btn-primary">wyslij</button>

            </form>


            <table class="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nazwa pliku</th>
                    <th scope="col">Plik</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${allFiles}" var="file">
                <tr>
                    <td>${file.id}</td>
                    <td>${file.fileName}</td>
                    <td>
                        <a href="/download?fileId=${file.id}"> <img style="width: 20px; height: 20px" src="http://icons.iconarchive.com/icons/dtafalonso/android-lollipop/512/Downloads-icon.png"></a>
                        <a href="/delete?fileId=${file.id}"> <img style="width: 15px; height: 15px" src="http://files.softicons.com/download/toolbar-icons/flatastic-icons-part-1-by-custom-icon-design/png/512x512/delete.png"></a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
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
