package com.wipro.cakeshop.dao;



import oracle.jdbc.util.Login;


public interface CakeshopDAO {
    Login dologin(String username,String Password);
    void doRegister(Login login);
    
    
}
