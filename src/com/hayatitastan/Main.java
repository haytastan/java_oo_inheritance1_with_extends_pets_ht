/*
•	Interfaces are a way to enforce certain fields or methods on a class
•	Interfaces do not enforce exactly how these methods should be implemented—-just that you must have them
•	Interfaces are the definition of a behavior
•	When used, they force classes and objects to have certain properties without forcing their implementation
 */

import java.util.Random;
public class Main {
   public static void main(String[] args) {
      Dog d = new Dog();
      Cat c = new Cat ();
      
      if (c instanceof Pet) {
         c.play();
      }
      if (d instanceof Pet) {
         d. play ();
      }
      System.out.println("========== Which pet ? ============");
      // First declare the object (instance) p from super-class Pet (p has not created yet)
      Pet p;
      Random rand = new Random();
     int n = rand.nextInt(2); //0 or 1
      if (n == 0) {
         // Now create the object (instance) p from sub-class Dog:
         p = new Dog();
      } else {
         // Now create the object (instance) p from sub-class Dog:
         p = new Cat();
      }
      p.play();
   }
}
