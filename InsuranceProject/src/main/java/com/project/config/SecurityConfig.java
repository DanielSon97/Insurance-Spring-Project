package com.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	BCryptPasswordEncoder bCryptpeasswordEncoder;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptpeasswordEncoder);
		
	}
	
	protected void configure(HttpSecurity hts) throws Exception {
		
		hts
	      .csrf().disable()
	      .authorizeRequests()
	      .antMatchers("/").permitAll()
	      .antMatchers("/home").permitAll()
	      .antMatchers("/start").permitAll()
	      .antMatchers("/saveCustomer").permitAll()
	      .antMatchers("/getGeicoPlans").permitAll()
	      .antMatchers("/getStateFarmPlans").permitAll()
	      .antMatchers("/getProgressivePlans").permitAll()
	      .antMatchers("/plans").permitAll()
	      .antMatchers("/adminpage").hasRole("ADMIN")
	      .anyRequest().authenticated()
	      .and()
	      .formLogin()
	      .loginPage("/login").permitAll()
	      .defaultSuccessUrl("/home", true)
	      .and()
	      .logout()
	      .logoutUrl("/logout")
	      .logoutSuccessUrl("/home")
	      .and()
	      .csrf().disable();
	      
	}
	
	public void configure(WebSecurity webs) {
		webs.ignoring().antMatchers("/images/*","/css/*", "/js/*");
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptpeasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}