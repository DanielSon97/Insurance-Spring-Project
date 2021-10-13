<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insurance Center</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
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
      <a href="#companies" class="w3-bar-item w3-button">Companies</a>
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="/contact" class="w3-bar-item w3-button">Check Status</a>
    </div>
  </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="https://www.capgemini.com/wp-content/uploads/2019/03/Insurance-Website_1775x462px_Option-2-e1606901611756.jpg" alt="Architecture" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Insurance</b></span> <span class="w3-hide-small w3-text-light-grey">Center</span></h1>
    <br/>
    <button type="button" class="btn btn-primary btn-lg" id="getStartedBtn">Get A Quote in 5 Minutes!</button>
  </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">

   <!-- Companies Section -->
  <div class="w3-container w3-padding-32" id="companies">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Our Insurance Companies</h3>
  </div>

  <div class="w3-row-padding w3-grayscale">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <img src="http://firststateupdate.com/wp-content/uploads/2020/04/img_5e8e2481eecd9-735x400.png" alt="GeicoPortrait" width="250" height="150">
      <h3>Geico</h3>
      <p>The Government Employees Insurance Company is an American auto insurance company with headquarters in Chevy Chase, Maryland. It is the second largest auto insurer in the United States, after State Farm.</p>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <img src="https://media.socastsrm.com/wordpress/wp-content/blogs.dir/2133/files/2018/09/STATE-FARM-200-200.png" alt="StateFarmPortrait" width="150" height="150">
      <h3>State Farm</h3>
      <p>State Farm Insurance is a large group of insurance companies throughout the United States with corporate headquarters in Bloomington, Illinois.</p>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <img src="https://1000logos.net/wp-content/uploads/2017/08/progressive-insurance-logo.jpg" alt="ProgressivePortrait" width="150" height="150">
      <h3>Progressive</h3>
      <p>The Progressive Corporation is an American insurance company, the third largest insurance carrier and the No. 1 commercial auto insurer in the United States.</p>
    </div>
  </div>

  <!-- About Section -->
  <div class="w3-container w3-padding-32" id="about">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About</h3>
    <p>Insurance Center gives you the best services at the best prices. Our automobile insurance partnerships rank among the best and most affordable insurance providers in the United States. We offer you the most optomized auto insurance plans from three major companies: Geico, State Farm, and Progressive.
    Within just 5 minutes of your time, we can gurantee you will have a quote that you won't leave without. Get started with us today and find yourself a plan that fits you. Click the button above to get started right now. 
    </p>
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
