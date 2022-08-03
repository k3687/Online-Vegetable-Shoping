package com.onlinevegetableshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.online_vegetable_shopping")
public class OnlineVegetableShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineVegetableShoppingApplication.class, args);
		System.out.println("Online_Vegetable_Shopping is Successfully created");
	}

}
