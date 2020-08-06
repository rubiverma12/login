package rentsells.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/login/v1")
public class LoginController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LoginController.class);
	
	
	/*@Autowired
	private UserRepository userRepository;*/
	
	/*@Autowired
	private CustomUserDetailsService customUserDetailsService;*/
	
	/*@Autowired
	private SequencesRepository sequencesRepository;*/
	
	
	/*@PostMapping("/createUser")
	public ResponseEntity<String> createUser(@Valid @RequestBody Login login) {
		Login userExists =null;
		if(login.getEmail()!= null) {
			userExists = userRepository.findByEmail(login.getEmail());
		}else {
			userExists = userRepository.findByMobile(login.getMobile());
		}
		 if (userExists != null) {
			 return ResponseEntity.status(HttpStatus.OK)
			            .body("There is already a user registered with provided data");
		    }else {
		    	Login newUser = null;  //customUserDetailsService.saveUser(login);
		    	if(newUser != null) {
		    		return ResponseEntity.status(HttpStatus.CREATED)
				            .body("User registerd successfully");
		    	}else {
		    		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				            .body("User not registerd. Try later");
				}
		    	
			}

	}*/

	@GetMapping("/getOTP")
	public Integer getOTP() {
		LOGGER.info("Generated OPT is {}",1234);
		return 1234;
	}
	
	@GetMapping("/login")
	public String login() {
	    return "Login called";
	}

}
