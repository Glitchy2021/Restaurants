
public class tester {
  public static void main(String[] args) {

    // TODO document why this method is empty
    Menu menu = new Menu();
    final boolean HEART_HEALTHY = true;
    final boolean NOT_HEART_HEALTHY = false;

    menu.add(new MenuItem("Braised Short Ribs",
        "#101", "450",
        "26.00", NOT_HEART_HEALTHY));

    menu.add(new MenuItem("Baked Salmon",
        "#205", "260",
        "23.50", HEART_HEALTHY));

    menu.add(new MenuItem("Scallop Risotto", "#180", "340",
        "25.50", NOT_HEART_HEALTHY));

    menu.add(new MenuItem("Herb Chicken", "#310", "280",
        "22.50", HEART_HEALTHY));
    int i = 1;
    System.out.println("Number of orders: " + menu.numItems());
    while (menu.hasNext()) {
      System.out.println(i + " - " + menu.next());
      i = i + 1;
    }

  }
}
