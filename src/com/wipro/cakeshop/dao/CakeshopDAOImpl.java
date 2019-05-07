package com.wipro.cakeshop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import oracle.jdbc.util.Login;

public class CakeshopDAOImpl {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
 
    public Login dologin(String username, String Password) {
    	sessionFactory.getCurrentSession(cakeshopservice.getusername,cakeshopservice.getpassword);
    	return login;
    }
    @Transactional
    public void doRegister(Login login) {
    	return sessionfactory.getCurrentSession(cakeshopservice.getUsername,cakeshopservice.getPassword,cakeshopservice.getAddress,cakeshopservice.getLocation,)

    }
}
