package com.bridgelabz.addressbookapp;

import ch.qos.logback.core.status.StatusUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@Slf4j
/**
 * Using Lombok for Logging, Using just @Slf4j is enough to start using
 * the Logger and add dependency lombok
 */
public class AddressBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppApplication.class, args);
		ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class,args);
		log.info("AddressBook App Started IN {} Environment!",context.getEnvironment().getProperty("Environment"));
		/**
		 * using - Logging the environment from appropriate application property line no 24,25
		 * add lombok dependency
		 *
		 */
	}


	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.bridgelabz.addressbookapp"))
				.build();

	}
	/**
	 * @Bean and Docket Using for call the Swagger server tool on Browser
	 */
}
