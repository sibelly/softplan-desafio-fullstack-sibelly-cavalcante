package com.softplan.apigerenciarprocessos.shared.infra;

import com.softplan.apigerenciarprocessos.modules.usuarios.services.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
  
	@Autowired
	AuthenticationService authenticationService;

	// @Override
	// protected void configure(HttpSecurity httpSecurity) throws Exception {
	// 	httpSecurity.csrf().disable().authorizeRequests()
	// 		.antMatchers("/sessoes").permitAll()
	// 		.anyRequest().authenticated();
	// 		// .and()
			
	// 		// // filtra requisições de login
	// 		// .addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
	//     //             UsernamePasswordAuthenticationFilter.class)
			
	// 		// // filtra outras requisições para verificar a presença do JWT no header
	// 		// .addFilterBefore(new JWTAuthenticationFilter(),
	//     //             UsernamePasswordAuthenticationFilter.class);
	// }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.cors().and().csrf().disable().authorizeRequests().anyRequest().permitAll();
			http.headers().frameOptions().disable();
	}

	/* To allow Pre-flight [OPTIONS] request from browser */
	@Override
	public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authenticationService);
	}

  @Bean
  public PasswordEncoder encoder() {
    return new BCryptPasswordEncoder();
  }

}
