package com.example.LatestSpringSecurityBasic.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig{

    /*
    * myAccount -> Secured
    * myCard -> Secured
    * myBalance -> Secured
    * HomeController -> Not Secured
    * Contact -> Not Secured
    * Notice -> Not Secured
    */

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        /*
         * Default configurations which will secure all the requests
         */
		/*
		* ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)http.authorizeRequests().anyRequest()).
		* authenticated();
		* http.formLogin();
		* http.httpBasic();
		* return (SecurityFilterChain)http.build();
		*/

        /*
         * Custom configurations as per our requirement
         */
        http.authorizeRequests((auth)->auth.antMatchers("/account","/card","/balance").authenticated()
                .antMatchers("/home","/contact","notice").permitAll())
                .httpBasic(Customizer.withDefaults());
        return http.build();


        /*
         * Configuration to deny all the requests
         */
		/*http.authorizeHttpRequests( (auth)->auth
				.anyRequest().denyAll())
				.httpBasic(Customizer.withDefaults());
		return http.build();*/

        /*
         * Configuration to permit all the requests
         */
		/*http.authorizeHttpRequests( (auth)->auth
						.anyRequest().permitAll())
				.httpBasic(Customizer.withDefaults());
		return http.build();*/
    }

}
