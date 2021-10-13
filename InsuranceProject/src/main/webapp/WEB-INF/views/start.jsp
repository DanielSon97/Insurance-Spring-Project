<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insurance Center</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="./js/start.js"></script>
<script src="./js/plans.js"></script>
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
<div class="w3-content w3-padding" style="max-width:1564px" id="pageContent">
  <!-- Person information-->
  <h3 style="text-align: center;">Fill out a 5 minute form and get a plan that matches exactly what you need.</h3>

  <div class="form-group">
    <label>First Name</label>
    <input type="text" class="form-control" id="inputFirstName" placeholder="First Name">  
  </div>

  <div class="form-group">
    <label>Last Name</label>
    <input type="text" class="form-control" id="inputLastName" placeholder="Last Name">
  </div>

  <div class="form-group">
    <label>Date of Birth</label>
    <input type="date" class="form-control" id="inputDateOfBirth">
  </div>

  <div class="form-group">
    <label>Phone Number</label>
    <input type="tel" class="form-control" id="inputPhoneNumber" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" placeholder="000-000-0000">
  </div>

  <div class="form-group">
    <label>Email</label>
    <input type="email" class="form-control" id="inputEmail" placeholder="JaneDoe@email.com">
  </div>

  <div class="form-group">
    <label>Address Line 1</label>
    <input type="text" class="form-control" id="inputAddressLine1" placeholder="Address Line 1">
  </div>

  <div class="form-group">
    <label>Address Line 2</label>
    <input type="text" class="form-control" id="inputAddressLine2" placeholder="Address Line 2">
  </div>

  <div class="form-group">
    <label>City</label>
    <input type="text" class="form-control" id="inputCity" placeholder="City">
  </div>

  <div class="form-group">
    <label>State</label>
    <input type="text" class="form-control" id="inputState" placeholder="State">
  </div>

  <div class="form-group">
    <label>Zip Code</label>
    <input type="number" class="form-control" id="inputZipCode" placeholder="00000">
  </div>

  <div class="form-group">
    <label>Country</label>
    <input type="text" class="form-control" id="inputCountry" placeholder="Country">
  </div>

  <!--Vehicle Information-->
  <hr/>
  <h3 style="text-align: center;">Fill in your vehicle form.</h3>
  
  <div class="form-group">
    <label>Model</label>
    <input type="text" class="form-control" id="inputModel" placeholder="Model">  
  </div>

  <div class="form-group">
    <label>Make</label>
    <input type="text" class="form-control" id="inputMake" placeholder="Make">
  </div>

  <div class="form-group">
    <label>Year</label>
    <input type="number" class="form-control" id="inputYear" placeholder="0000">
  </div>

  <div class="form-group">
    <label>Mileage</label>
    <input type="number" class="form-control" id="inputMileage" placeholder="0">
  </div>

  <div class="form-group">
    <label>Estimated Annual Mileage</label>
    <input type="number" class="form-control" id="inputEstimatedAnnualMileage" placeholder="0">
  </div>

  <div class="form-group">
    <label>Purpose</label>
    <select class="form-control" id="inputPurpose">
      <option value=0>Select</option>
      <option value=1>Personal</option>
      <option value=2>Commute</option>
      <option value=3>Company</option>
    </select>
  </div>

  <div class="form-group">
    <label>Ownership</label>
    <select class="form-control" id="inputOwnership">
      <option value=0>Select</option>
      <option value=1>New</option>
      <option value=2>Used</option>
      <option value=3>Rented</option>
    </select>
  </div>

  <button type="submit" id="startSubmit" class="btn btn-primary">Submit</button>

  <br/>
  <small id="confidentialStatement" class="form-text text-muted">We'll never share your information with anyone else.</small>
  
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
