package Abstraction;

interface Animal
	{
	   void eat();
	   void sleep();
	}



	class Cat implements Animal {
	   public void eat() {
	      System.out.println("Cat is eating");
	   }

	   public void sleep() {
	      System.out.println("Cat is sleeping");
	   }
	}

	class Dog implements Animal {
	   public void eat() {
	      System.out.println("Dog is eating");
	   }

	   public void sleep() {
	      System.out.println("Dog is sleeping");
	   }
	}

	class AnimalAbstraction {
	   public static void main(String[] args) {
	      Animal catobj = new Cat();
	      Animal dogobj = new Dog();
	      catobj.eat(); // Output: Cat is eating
	      catobj.sleep(); 
	      dogobj.sleep(); // Output: Dog is sleeping
	      dogobj.eat();
	   }
	}

