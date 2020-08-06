package rentsells.login.component;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import rentsells.login.controller.LoginController;

@Component
public class RequestFilter extends OncePerRequestFilter{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LoginController.class);

	/*@Autowired
    RestTemplate restTemplate;*/
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		
		final String requestTokenHeader = request.getHeader("Authorization");
		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {	
			LOGGER.info("Request start to process for existing user");
			// here we call security module to validate each request and authenticate user
		}else {
			LOGGER.info("Request start to process for new user");
			//for below api token not required
			//1. /getOTP, 2./register
			//Token missing only when new user register so here we call create token request
		}

		
		chain.doFilter(request, response);
	}
}
