//*****************************************************************
//  MonetaryCoin.java (Coin Project) Created by: Jaden Mathew
//
// This MonetaryCoin class is a subclass of the Coin class and adds extra functionality for coins with a monetary value, such as setting and getting the value and the name of the coin. This class will be useful for creating coins with specific values and names.
//  
//*****************************************************************

public class MonetaryCoin extends Coin {
  private float value;
  private String name;

  // Sets up the coin by flipping it initially.
  public MonetaryCoin(float aValue, String aName) {
    super();
    value = aValue;
    name = aName;
  }

  // Returns the current value of the coin.
  public float getValue() {
    return value;
  }

  // Returns the current name of the coin.
  public String getName() {
    return name;
  }

  // Sets the value of the coin.
  public void setValue(float aValue) {
    value = aValue;
  }

  // Sets the name of the coin.
  public void setName(String aName) {
    name = aName;
  }

  // Returns the current face of the coin as a string.
  public String toString() {
    String faceName;
    if (super.isHeads())
      faceName = "Heads";
    else
      faceName = "Tails";
    return faceName + " " + name + " " + value;
  }

  // Compares two coins to see if they have the same value and name.
  public boolean equals(MonetaryCoin otherCoin) {
    return (value == otherCoin.value && name == otherCoin.name);
  }
}