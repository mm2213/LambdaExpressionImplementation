package com.practice.builtinfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		List<Car> cars= Arrays.asList(
				new Car("Honda","Accord","Red", 22000),
				new Car("Honda","Alto","Pink", 21000),
				new Car("Toyota","Creta","Blue", 32000),
				new Car("Maruti","Zen","Purple", 52000)
				);
		
		
		Function<Car,String> priceAndColor= (c) ->{
			return "price = " + c.getPrice() + " color = " + c.getColor();
		};
		
		String res=priceAndColor.apply(cars.get(0));
		
		System.out.println(res);
		
	}
	
	
	
	
}
