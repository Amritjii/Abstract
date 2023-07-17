package Abstraction;
interface Ford {
   void drive();
}

interface BMW {
   void park();
}

abstract class Car {
   abstract void start();
}

class MyCar extends Car implements Ford, BMW {
   public void start() {
      System.out.println("Starting the car");
   }
   public void drive() {
      System.out.println("Driving the car");
   }
   public void park() {
      System.out.println("Parking the car");
   }
}

public class MethodStatic {
   public static void main(String[] args) {
      MyCar myCar = new MyCar();
      myCar.start();
      myCar.drive();
      myCar.park();
   }
}


