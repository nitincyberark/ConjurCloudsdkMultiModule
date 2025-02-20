package com.cyberark.conjur.plugintest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cyberark.conjur.springboot.annotations.ConjurPropertySource;

@SpringBootApplication
@ConjurPropertySource(value={"jenkins-app"})
public class ConjurSpringPluginTest implements CommandLineRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(ConjurSpringPluginTest.class);

	
	@Value("${dbUserName}")
	private byte[] pass1;

	@Value("${dbPassword}")
	private byte[] pass2;

	@Value("${dbUrl}")
	private byte[] pass3;

	
	@Autowired
	ApplicationContext appContext;
	
    public static void main(String[] args) {
    	
        SpringApplication.run(ConjurSpringPluginTest.class, args);
    }

    
	public void run(String... args) throws Exception {
		
		LOGGER.info("By Using Standard Spring annotation -->  " + new String(pass1) + "  " );
		LOGGER.info("By Using Standard Spring annotation -->  " + new String(pass2) + "  " );
		LOGGER.info("By Using Standard Spring annotation -->  " + new String(pass3) + "  " );
	
	}

	
}
