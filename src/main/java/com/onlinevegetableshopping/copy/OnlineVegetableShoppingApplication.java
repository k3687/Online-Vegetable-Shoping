package com.onlinevegetableshopping.copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.onlinevegetableshopping")
public class OnlineVegetableShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineVegetableShoppingApplication.class, args);
		System.out.println("Online_Vegetable_Shopping is Successfully created");
	}

}
