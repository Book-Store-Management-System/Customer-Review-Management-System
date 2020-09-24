package com.capgemini.bookstore;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan(basePackageClasses = {BookstoreApplication.class })
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
// Swagger Configuration / 
	
@Bean
  public Docket SwaggerCongiguration()
	  {
		//here we need to create instance of docket to user swagger2 documentation
		
	return new Docket(DocumentationType.SWAGGER_2)
				.select()
			.paths(PathSelectors.any())
			.apis(RequestHandlerSelectors.basePackage("com.capgemini.bookstore"))
			.build()
			.apiInfo(apiDetails());
	  
        }
	private ApiInfo apiDetails()
	{
		return new ApiInfo(
		"Book Information System ",
		"Api for Book Info System of Book Management System",
		"1.0",
		"Api end points for crud operation",
		new springfox.documentation.service.Contact("Sourav bhuyan","souravbhuyan2@gmail.com","www.google.com"),
		"Capgemini BootCamp Training",
		"using swagger for documentation",
		Collections.emptyList());
	}


}

