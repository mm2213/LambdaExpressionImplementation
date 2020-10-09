package com.practice.lambdaexpression;

public class App {
	
	public static void main(String [] args) {
		CalculateSum<Integer,Double> var= (a,b) -> a+b;
		System.out.println(var.compute(4,6.4));
		
		CalculateFactorial factorial=(num)->{
			int res=1;
			for(int i=2;i<=num;i++) {
				res*=i;
			}
			return res;
		};
		
		System.out.println(factorial.calFact(4));
		
		
		
	}
	
}
