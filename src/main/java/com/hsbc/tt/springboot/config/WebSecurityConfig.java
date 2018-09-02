package com.hsbc.tt.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security Interception rule
 *
 * @author Damon Chen
 * @date 2018/${MOUTH}/02
 */
@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final MyUserDetailsServiceImpl myUserDetailsServiceImpl;

    @Autowired
    public WebSecurityConfig(MyUserDetailsServiceImpl myUserDetailsServiceImpl) {
        this.myUserDetailsServiceImpl = myUserDetailsServiceImpl;
    }


    /**
     * Determine if you have logged in
     *
     * @param auth Landing user
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsServiceImpl);
    }

    /**
     * security Interception rule
     *
     * @param http request url
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/img/**", "/layui/**", "/ztree/**", "/user/addUser")
                .permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/index").permitAll().loginProcessingUrl("/user/login")
                .defaultSuccessUrl("/upload", true).permitAll()
                .failureUrl("/error").permitAll()
                .and().logout()
                .logoutSuccessUrl("/index").permitAll()
                .and().csrf().disable();
    }
}
