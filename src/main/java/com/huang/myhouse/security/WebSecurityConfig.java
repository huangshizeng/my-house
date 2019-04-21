package com.huang.myhouse.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hsz
 */

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//                .authorizeRequests()
//                // 管理员登录入口
//                .antMatchers("/admin/login").permitAll()
//                // 静态资源
//                .antMatchers("/css/**", "/fonts/**", "/images/**", "/js/**", "/lib/**").permitAll()
//                // 用户登录入口
//                .antMatchers("/user/login").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/api/user/**").hasAnyRole("ADMIN", "USER")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/admin/loginPage")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/logout/page")
//                .permitAll();
        http.headers().frameOptions().sameOrigin();
    }

    /**
     * 在内存中配置一个用户，拥有USER角色
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("123456")
                .roles("ADMIN");
    }
}
