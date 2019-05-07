package com.wipro.cakeshop.service;

import oracle.jdbc.util.Login;

public interface CakeshopService {
	Login dologin(String username,String Password);
    void doRegister(Login login);
    
    
}
