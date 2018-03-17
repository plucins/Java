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
        <div class="col-md-6 offset-md-3">


            <form action="schedule" method="post">

                <div class="input-group mt-3">
                    <input type="text" class="form-control" required placeholder="Kwota Kredytu" name="loanValue"
                           pattern="[0-9]{2,}">
                    <div class="input-group-append">
                        <span class="input-group-text">.00</span>
                        <span class="input-group-text">zł</span>
                    </div>
                </div>

                <div class="form-group mt-3">
                    <label for="numberOfInstallments">Liczba rat</label>
                    <select required multiple class="form-control" id="numberOfInstallments"
                            name="numberOfInstallments">
                        <option>12</option>
                        <option>18</option>
                        <option>24</option>
                        <option>30</option>
                        <option>36</option>
                        <option>42</option>
                        <option>48</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="interest">Oprocentowanie</label>
                    <select required class="form-control" id="interest" name="interest">
                        <option value="3">3%</option>
                        <option value="4">4%</option>
                        <option value="5">5%</option>
                        <option value="6">6%</option>
                        <option value="7">7%</option>
                        <option value="8">8%</option>
                        <option value="9">9%</option>
                        <option value="10">10%</option>
                    </select>
                </div>

                <div class="input-group mt-3">
                    <input type="text" class="form-control" required placeholder="Oplata stała" name="fixedFees"
                           pattern="[0-9]{2,}">
                    <div class="input-group-append">
                        <span class="input-group-text">.00</span>
                        <span class="input-group-text">zł</span>
                    </div>
                </div>

                <div class="mt-3">
                    <label>Rodzja rat</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" checked type="radio" name="installmentsType" id="installmentsType1"
                           value="constans">
                    <label class="form-check-label" for="installmentsType1">Stały</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="installmentsType" id="installmentsType2"
                           value="diminishing">
                    <label class="form-check-label" for="installmentsType2">Malejący</label>
                </div>

                <button type="submit" class="btn btn-warning btn-lg btn-block mt-5">Oblicz >></button>


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
