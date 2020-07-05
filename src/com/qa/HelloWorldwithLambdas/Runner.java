package com.qa.HelloWorldwithLambdas;

public class Runner implements GreetingService{

	public static void main(String[] args) {
		
		 Greetings greetService1 = message ->
	     System.out.println(message);
	     
	     Greetings greetService2 = (message) ->
	     System.out.println("Hello World.. " + message);
	      
	     greetService1.sayMessage("Hello World!");
	     
	     greetService2.sayMessage(" :)");
		 
	    

	}


}
