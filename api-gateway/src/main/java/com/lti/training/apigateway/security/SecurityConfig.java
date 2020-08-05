package com.lti.training.apigateway.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	
	// to configure the credential repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// database : pre-defined schema
		auth.jdbcAuthentication().dataSource(dataSource);
		
		// in-memory credentials
		/*
		UserBuilder builder = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(builder.username("First").password("abc").roles("EMPLOYEE"))
			.withUser(builder.username("Second").password("abc").roles("MANAGER"))
			.withUser(builder.username("Third").password("abc").roles("ADMIN"));
			*/
		/*auth.inMemoryAuthentication()
			.withUser(User.withUsername("First").password("abc").roles("EMPLOYEE"))
			.withUser(User.withUsername("Second").password("abc").roles("MANAGER"))
			.withUser(User.withUsername("Third").password("abc").roles("ADMIN"));
			*/
	}
	
	// rules to access the resource 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
	}
	
	// rules additional security ( JWT / OAuth )
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}
}
