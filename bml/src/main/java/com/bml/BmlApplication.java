package com.bml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmlApplication.class, args);
		
		
		
	}
	
//	@Autowired
//	private PersonRepo p;
//	  
//	public void run(String... args) {
//
//	        p.save(new LoginDetailsVO("12345", "Peter Pan", "sx"));
//
//	        List<LoginDetailsVO> people = p.findAll();
//
//	        for (LoginDetailsVO person: people) {
//	            System.out.println(person);
//	        }
//	    }
	
//	 @Bean
//	    public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurerAdapter() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/login").allowedOrigins("http://localhost:4200");
//	            }
//	        };
//	    }
}
