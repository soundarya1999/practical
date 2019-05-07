package com.wipro.cakeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.cakeshop.dao.CakeshopDAO;

import oracle.jdbc.util.Login;

@Service
public class CakeshpServiceIpl implements CakeshopService{
@Autowired
 private CakeshopService cakeshopservice;
@Transactional
@Override
public Login dologin(String username, String Password) {
	return cakeshopdao(loginbean.getUsername,loginbean.getPassword);
	
}
@Transactional
@Override
public void doRegister(Login login) {
	

}
}