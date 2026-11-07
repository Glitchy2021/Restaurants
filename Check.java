
public class Check {

  private final Menu menu;
  private final Orders orders;
  private final double tax_rate;

  // Constructor
  public Check(Menu menu, Orders orders, double tax_rate) {
    // ------------------------------------------------------
    // Initalizes orders to parameter values passed.
    // ------------------------------------------------------
    // (to complete)
    this.menu = menu;
    this.orders = orders;
    this.tax_rate = tax_rate;
  }

  // Getter Methods

  public Orders getOrders() {
    // ------------------------------------------------------
    // Returns all orders on check.
    // ------------------------------------------------------
    // (to complete)
    return orders;
  }

  public double getTaxRate() {
    // ------------------------------------------------------
    // Returns the tax rate applied on checks.
    // ------------------------------------------------------
    // (to complete)
    return tax_rate;
  }

  // Method
  public double tax() {
    // ------------------------------------------------------
    // Returns the amount of tax for the ordered items.
    // ------------------------------------------------------
    // (to complete)
    double tax = 2.04;
    return tax;
  }

  // Method
  public double subtotal() {
    // ------------------------------------------------------
    // Returns total cost of orders on check (excluding tax).
    // ------------------------------------------------------
    // (to complete)
    double sub = 0;
    double sub2;
    String guss;
    orders.reset();
    while (orders.hasNext()) {
      guss = menu.getMenuItemByID(orders.next()).getPrice();
      sub2 = Double.parseDouble(guss);
      sub = sub2 + sub;
    }

    return sub;
  }

  // Method
  public double total() {
    // ------------------------------------------------------
    // Returns total cost of orders on check (including tax).
    // ------------------------------------------------------
    // (to complete)
    double total;
    total = subtotal() + tax();
    return total;
  }

  public double compute_tip(int percent) {
    // ------------------------------------------------------
    // Returns the tip amount for percent given on pre-tax
    // total of the check.
    // ------------------------------------------------------
    // (to complete)
    double tip = percent / 100.0;
    return subtotal() * tip;
  }

}