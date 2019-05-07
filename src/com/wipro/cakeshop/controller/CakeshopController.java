package com.wipro.cakeshop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class CakeshopController {
   @RequestMapping(value="/start",method="Requestmethod.POST")
   private String init(Model model){
	   model.addAttribute(msg,"Please enter the details");
   }
   @RequestMapping(value="/login",method="Requestmethod.POST")
   private Login doLogin(String username,String Password){
	   if(loginbean!="null" &&loginbean.getUsername()!="null" && loginbean.getPassword()!="null"){
	    return model.addAttribute(msg,"Login success");
	   }
	    else{
	    	return error;
	    }
	    }
   @RequestMapping(value="/register",method="Requestmethod.POST")
   private String doRegister(Model model,@ModelAttribute("Login")Login loginbean){
	   if(loginbean!="null" &&loginbean.getUsername()!="null" && loginbean.getPassword()!="null" && loginbean!="null" &&loginbean.getEmail()!="null" && loginbean.getAddress()!="null"){
		   model.addAttribute(msg,"Registered successfully");
	   }
	   else{
		   return error;
	   }
   }
   @RequestMapping(value="/show",method="Requestmethod.POST")
   private String add(Model model,@ModelAtrribute("Login")Login loginbean){
	   if(loginbean!="null" && loginbean.getUsername!="null" && loginbean.password!="null"){
		   model.addAttribute(msg,cakeshopservice.getQuantity());
		   model.addAtrribute(msg,cakeshopservice.getLocation());
	   }
   }
}
