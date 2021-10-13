<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insurance Center</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="./js/start.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style>
</style>

</head>

<!-- Navbar (sit on top) -->
<div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="home" class="w3-bar-item w3-button"><b>Insurance</b> Center</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
      <a href="home#companies" class="w3-bar-item w3-button">Companies</a>
      <a href="home#about" class="w3-bar-item w3-button">About</a>
      <a href="/contact" class="w3-bar-item w3-button">Check Status</a>
    </div>
  </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="https://www.capgemini.com/wp-content/uploads/2019/03/Insurance-Website_1775x462px_Option-2-e1606901611756.jpg" alt="Architecture" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Insurance</b></span> <span class="w3-hide-small w3-text-light-grey">Center</span></h1>
  </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">
  <!-- Person information-->
  <h3 style="text-align: center;">These are the plans that we can offer you.</h3>

  <div class="w3-container w3-padding-32" id="companies">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Plans</h3>
  </div>

 
  
<!-- End page content -->
</div>


<!-- Footer -->
<footer class="w3-center w3-black w3-padding-16">
  <p>
    <h4>Insurance Center</h4>
    <h4>123-456-7890</h4>
  </p>
</footer>

<!-- Scripts -->
<script>
  $(document).ready(function() {
    $("#getStartedBtn").click(function(){
      window.location.href = "start";
    });
  });
</script>

</body>
</html>
