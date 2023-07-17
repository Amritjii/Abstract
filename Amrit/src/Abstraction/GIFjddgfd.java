package Abstraction;

abstract class Calculator {
	   public abstract int add(int a, int b);	   
	   public abstract int subtract(int a, int b);
	   public abstract int multiply(int a, int b);
	   public abstract int divide(int a, int b);
	}



	class BasicCalculator extends Calculator {
	   public int add(int a, int b) 
	   {
	      return a + b;
	   }

	   public int subtract(int a, int b) 
	   {
	      return a - b;
	   }

	   public int multiply(int a, int b)
	   {
	      return a * b;
	   }

	   public int divide(int a, int b) 
	   {
	      return a / b;
	   }
	}
	
	

	class GIFjddgfd {
	   public static void main(String[] args) {
	      Calculator calculator = new BasicCalculator();
	      int result = calculator.add(75, 8);
	      System.out.println(result); // Output: 15
	      result = calculator.subtract(10, 5);
	      System.out.println(result); // Output: 5
	      result = calculator.multiply(5, 10);
	      System.out.println(result); // Output: 50
	      result = calculator.divide(10, 5);
	      System.out.println(result); // Output: 2
	   }
	}

