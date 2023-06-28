//*****************************************************************
//  Main.java (Coin Project)    Created by: Jaden Mathew
//
//  This Main class is a class that creates multiple MonetaryCoin objects with different values and names, and then calls various methods of the MonetaryCoin class to demonstrate their functionality. This class is useful for testing and demonstrating the MonetaryCoin class.
//*****************************************************************

public class Main {
  public static void main(String[] args) {
    // Create multiple MonetaryCoin objects with different attributes
    MonetaryCoin coin1 = new MonetaryCoin(0.01f, "Penny");
    MonetaryCoin coin2 = new MonetaryCoin(0.05f, "Nickel");
    MonetaryCoin coin3 = new MonetaryCoin(0.10f, "Dime");
    MonetaryCoin coin4 = new MonetaryCoin(0.25f, "Quarter");

    // Sum and output the values of these coins
    float sum = coin1.getValue() + coin2.getValue() + coin3.getValue() + coin4.getValue();
    System.out.println("The sum of the coins is: " + sum);

    // Call the equals method
    System.out.println("Are coin1 and coin2 are equal?: " + coin1.equals(coin2));
    System.out.println("Are coin2 and coin3 are equal?: " + coin2.equals(coin3));

    // Use each getter and setter
    System.out.println("coin1's name is: " + coin1.getName());
    System.out.println("coin3's name is: " + coin3.getName());
    coin3.setName("Ten Cents");
    System.out.println("coin3 is set as: " + coin3.getName());

    // Call the flip method
    coin4.flip();
    System.out.println("coin4 is now: " + coin4.toString());
  }
}