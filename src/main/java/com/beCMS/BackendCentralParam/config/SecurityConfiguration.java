package com.beCMS.BackendCentralParam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

import com.beCMS.BackendCentralParam.security.AuthenticationFilter;
import com.beCMS.BackendCentralParam.security.LoginFilter;
import com.beCMS.BackendCentralParam.services.UserService;




@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {



@Autowired
private ApplicationContext context;




@Order(1)
@Configuration
public class RestConfiguration extends WebSecurityConfigurerAdapter {
@Override

protected void configure(HttpSecurity http) throws Exception {
//     http.sessionManagement()
// .maximumSessions(1)
// .maxSessionsPreventsLogin(true).and()
// .disable();
http.antMatcher("/api/**").cors().and().csrf().disable().authorizeRequests()
.antMatchers(HttpMethod.POST, "/api/login/LDAP/").permitAll()
.antMatchers(HttpMethod.POST, "/api/login").permitAll().anyRequest().authenticated().and()
.addFilterBefore(new LoginFilter("/api/login", authenticationManager(),context),
UsernamePasswordAuthenticationFilter.class)
// Filter for other requests to check JWT in header
.addFilterBefore(new AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().logout().invalidateHttpSession(true)
.clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
}
}

// @Override
// public void configure(WebSecurity web) throws Exception {
// // web.ignoring().antMatchers(HttpMethod.GET, "/api/**");
// }



@Bean
public BCryptPasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}

// @Bean
// public DaoAuthenticationProvider authenticationProvider() {
// DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
// auth.setUserDetailsService(userService);
// auth.setPasswordEncoder(passwordEncoder());
// return auth;
// }

// @Override
// protected void configure(AuthenticationManagerBuilder auth) throws Exception {
// auth.authenticationProvider(authenticationProvider());
// }
}