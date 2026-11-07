public class MenuItem {

  private final String item_name;
  private final String item_ID;
  private final String num_calories;
  private final String price;
  private final boolean heart_healthy;

  // Constructor
  public MenuItem(String item_name, String item_ID,
      String num_calories, String price,
      boolean heart_healthy) {
    // ------------------------------------------------------
    // Initializes instance vars to parameter values passed.
    // ------------------------------------------------------
    // (to complete)
    this.item_name = item_name;
    this.item_ID = item_ID;
    this.num_calories = num_calories;
    this.price = price;
    this.heart_healthy = heart_healthy;
  }

  // Getters
  public String getItemName() {
    // ------------------------------------------------------
    // Returns value of instance var item_name.
    // ------------------------------------------------------
    // (to complete)

    return item_name;
  }

  public String getItemID() {
    // ------------------------------------------------------
    // Returns value of instance var item_ID.
    // ------------------------------------------------------
    // (to complete)
    return item_ID;
  }

  public String getPrice() {
    // ------------------------------------------------------
    // Returns value of instance var price.
    // ------------------------------------------------------
    // (to complete)
    return price;
  }

  public boolean isHeartHealthy() {
    // ------------------------------------------------------
    // Returns value of instance var heart_healthy.
    // ------------------------------------------------------
    // (to complete)
    return heart_healthy;
  }

  public String getBasicDescription() {
    // ------------------------------------------------------
    // Returns description containing only the item name
    // and the price, e.g., "Baked Salmon $23.50".
    // ------------------------------------------------------
    // (to complete)
    return item_name + " $" + price;
  }

  // toString method

  @Override
  public String toString() {
    // ------------------------------------------------------
    // Returns string of the form:
    //
    // "Braised Short Ribs (450 cal.) $26.00"
    // "Baked Salmon (260 cal.) $23.50 (Heart Healthy)"
    //
    // Note that item_ID NOT part of the returned string.
    // (It is only used internally)
    // ------------------------------------------------------
    // (to complete)
    if (heart_healthy) {
      return item_name + " (" + num_calories + " cal.) " + " $" + price + " (Heart Healthy)";
    } else {
      return item_name + " (" + num_calories + " cal.) " + " $" + price;
    }
  }

}
