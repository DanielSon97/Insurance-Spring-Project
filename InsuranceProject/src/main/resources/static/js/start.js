$(document).ready(function() {
	//declaring variables
	var url = "http://localhost:8080";

	//submitting form
	$('#startSubmit').click(function(event) {
		
		var firstName = $("#inputFirstName").val();
		var lastName = $("#inputLastName").val();
		var dateOfBirth = $("#inputDateOfBirth").val();
		var phoneNumber = $("#inputPhoneNumber").val();
		var email = $("#inputEmail").val();
		var addressLine1 = $("#inputAddressLine1").val();
		var addressLine2 = $("#inputAddressLine2").val();
		var city = $("#inputCity").val();
		var state = $("#inputState").val();
		var zipCode = $("#inputZipCode").val();
		var country = $("#inputCountry").val();
		
		var model = $("#inputModel").val();
		var make = $("#inputMake").val();
		var year = $("#inputYear").val();
		var mileage = $("#inputMileage").val();
		var estimatedAnnualMileage = $("#inputEstimatedAnnualMileage").val();
		var purpose = $("#inputPurpose").find("option:selected").text();
		var ownership = $("#inputOwnership").find("option:selected").text();
				
		const vehicle = {
			model: model,
			make: make,
			year: year,
			mileage: mileage,
			estimatedAnnualMileage: estimatedAnnualMileage,
			purpose: purpose,
			ownership: ownership
		}
		
		var vehicles = [];
		vehicles.push(vehicle);
		
		const customer = {
			"firstName": firstName,
			"lastName": lastName,
			"dateOfBirth": dateOfBirth,
			"phoneNumber": phoneNumber,
			"email": email,
			"addressLine1": addressLine1,
			"addressLine2": addressLine2,
			"city": city,
			"state": state,
			"zipCode": zipCode,
			"country": country,
			"vehicles": vehicles
		}
		
		//var savedCustomer = ajaxSaveCustomer(customer);
		
		//switching views
		switchToPlans();
		
		getPlans(customer);
	});
	
	
	
	//--------------------------AJAX CALLS-------------------------------------------//
	function ajaxSaveCustomer(customer) {
		$.ajax({
			url: url + "/saveCustomer",
			type: "POST",
			data: JSON.stringify(customer),
			dataType: "json",
			contentType: 'application/json',
			success: function(customer) {
				console.log(customer);
			},
			error: function(xhr, status, error) {
				alert(xhr.responseText);
			}						
		});					
	};
	
	function ajaxGetGeicoPlans(customer) {
		$.ajax({
			url: url + "/getGeicoPlans",
			type: "POST",
			data: JSON.stringify(customer),
			dataType: "json",
			contentType: 'application/json',
			success: function(plans) {
				return plans;
			},
			error: function(xhr, status, error) {
				alert("HERE " + xhr.responseText);
				console.log(xhr.responseText);
			}						
		});					
	};
	
	//-----------------------------FUNCTIONS---------------------------------------//
	function switchToPlans() {
		$("#pageContent").html("");
		
		var html = '<h3 style="text-align: center;">These are the plans that we can offer you.</h3>';
			html += '<div class="w3-container w3-padding-32" id="companies">';
			html += '<h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Plans</h3>';
			html += '</div>';
			
			html += '<div class="w3-row-padding">';
			
			html += '<div class="w3-col l3 m6 w3-margin-bottom" id="geicoDiv">';
			html += '<img src="http://firststateupdate.com/wp-content/uploads/2020/04/img_5e8e2481eecd9-735x400.png" alt="GeicoPortrait" width="250" height="150">';
			html += '<h3>Geico</h3>';
			html += '</div>';
			
			html += '<div class="w3-col l3 m6 w3-margin-bottom" id="stateFarmDiv">';
			html += '<img src="https://media.socastsrm.com/wordpress/wp-content/blogs.dir/2133/files/2018/09/STATE-FARM-200-200.png" alt="StateFarmPortrait" width="150" height="150">';
			html += '<h3>State Farm</h3>';
			html += '</div>';
			
			html += '<div class="w3-col l3 m6 w3-margin-bottom" id="progressiveDiv">';
			html += '<img src="https://1000logos.net/wp-content/uploads/2017/08/progressive-insurance-logo.jpg" alt="ProgressivePortrait" width="150" height="150">';
			html += '<h3>Progressive</h3>';
			html += '</div>';
			
			html += '</div>';
			
		$("#pageContent").append(html);
	};
	
	function getPlans(customer) {
		$.ajax({
			url: url + "/getGeicoPlans",
			type: "POST",
			data: JSON.stringify(customer),
			dataType: "json",
			contentType: 'application/json',
			success: function(plans) {
				showPlans("geico", plans);
			},
			error: function(xhr, status, error) {
				alert("HERE " + xhr.responseText);
				console.log(xhr.responseText);
			}						
		});	
		
		$.ajax({
			url: url + "/getStateFarmPlans",
			type: "POST",
			data: JSON.stringify(customer),
			dataType: "json",
			contentType: 'application/json',
			success: function(plans) {
				showPlans("stateFarm", plans);
			},
			error: function(xhr, status, error) {
				alert("HERE " + xhr.responseText);
				console.log(xhr.responseText);
			}						
		});	
		
		$.ajax({
			url: url + "/getProgressivePlans",
			type: "POST",
			data: JSON.stringify(customer),
			dataType: "json",
			contentType: 'application/json',
			success: function(plans) {
				showPlans("progressive", plans);
			},
			error: function(xhr, status, error) {
				alert("HERE " + xhr.responseText);
				console.log(xhr.responseText);
			}						
		});	
	};
	
	function showPlans(company, plans) {
		var divId = company + "Div";
		var html;
		for (var plan of plans) {
			html = '<p>';
			html += '<b>';
			html += plan.name;
			html += '<br/>';
			html += '$' + plan.pricePerMonth + '<br/>';
			html += '</b>';
			
			for (var benefit of plan.benefits) {
				html += "<b>-</b>";
				html += benefit;
				html += '<br/>';
			}
			html += '<br/><button type="button" text-align="center" class="btn btn-primary btn-lg" id=' + company + plan.name + '">Choose Plan</button>';
			$("#" + divId).append(html);
		}
	}
});