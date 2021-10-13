package com.project.controller;

import java.nio.file.Paths;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import com.project.domain.Customer;

//publishable key : pk_test_51JhfO4JhzhPxR9mCycYk6yQ4oYE2My7idYLGNAGRFGK4n8S3XxRs1P9e1CwPqqvbdXufSw5l3dVE6sEznGivBGss00jIVxVQ8U
//secret key : sk_test_51JhfO4JhzhPxR9mCccXDv3qrfrOhrK6xmPJ3mnz9Yx7dJjfXIWwq1RYvVdgYLV4qAfbHeeOTHXg50CDX0f4mqHfY000QTol15R

@Controller
public class PaymentController {
	
	@RequestMapping(value="/create-checkout-session", method=RequestMethod.POST)
	public ResponseEntity<Object> payWithStripe(@RequestBody Object paymentDetails) {
		String YOUR_DOMAIN = "http://localhost:8080";
		SessionCreateParams params =
			SessionCreateParams.builder()
		    .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
		    .setMode(SessionCreateParams.Mode.PAYMENT)
		    .setSuccessUrl(YOUR_DOMAIN + "/success.html")
		    .setCancelUrl(YOUR_DOMAIN + "/cancel.html")
		    .addLineItem(
		    		SessionCreateParams.LineItem.builder()
		    		.setQuantity(1L)
		    		.setPrice("{{PRICE_ID}}")
		            .build())
		    	.build();
		Session session = Session.create(params);
		response.redirect(session.getUrl(), 303);
		
		return new ResponseEntity<Object>("success", HttpStatus.OK);
	}
