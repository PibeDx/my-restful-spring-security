package com.jcuentas.app.restsec.mvc;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcuentas.app.restsec.AuthenticationService;
import com.jcuentas.app.restsec.TokenManager;



@RestController
public class DemoRestController {
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private TokenManager tokenManager;
	
	
	@PostConstruct
	public void init() {
		System.out.println(" *** MainRestController.init with: " + applicationContext);
	}
	
//	@RolesAllowed("ADMIN")
//	@RequestMapping(value = "/demo")
	//@RolesAllowed("ADMIN")
	@Secured({"ROLE_SPECIAL", "ADMIN"})
	@RequestMapping("/admin")
	public String demo(){
		System.out.println(" ***DemoRestController.demo");
		return "Demo";
	}
	
	

}
