package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.app.filters.JWTRequestFilter;

@EnableWebSecurity //
@Configuration 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//dep : password encoder
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JWTRequestFilter filter;

	//configure auth provider builder to build in mem auth provider
	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
//	}
//	//configuration for role based authorization
//	/*
//	 * http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
//	 * 
//	 */
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.cors()
//		.and()
//		.csrf().disable().
//		authorizeRequests()	
//		.antMatchers("/api/admin/**").hasRole("ADMIN") 
//		.antMatchers("/api/appointment/**","/address/**","/users/**").hasAnyRole("USER")			
//		.antMatchers("/api/bloodbank/**",
//						"/api/auth/**","/api/events/**" ,"/users/**" ).permitAll() //enabling global access to all urls with /api/auth 
//		//only for JS clnts (react / angular)
//		.antMatchers(HttpMethod.OPTIONS).permitAll()
//		.antMatchers("/api/events/**").authenticated()
//		.antMatchers("/api/events/**").hasAnyRole("USER", "ADMIN")
//		.and()
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and()
//		.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
//	}
	
	protected void configure(HttpSecurity http) throws Exception {
	    http.cors()
	        .and()
	        .csrf().disable()
	        .authorizeRequests()
	        .antMatchers("/api/admin/**").hasRole("ADMIN") 
	        .antMatchers("/api/appointment/**", "/address/**", "/users/**").hasRole("USER")            
	        .antMatchers("/api/bloodbank/**", "/api/auth/**").permitAll() 
	        .antMatchers("/api/events/**").hasAnyRole("USER", "ADMIN") // Allow only authenticated users
	        .antMatchers(HttpMethod.OPTIONS).permitAll()
	        .and()
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	        .and()
	        .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
	}

	
	//configure auth mgr bean : to be used in Auth REST controller
	@Bean
	public AuthenticationManager authenticatonMgr() throws Exception
	{
		return authenticationManagerBean();
	}
	
	

	
}
