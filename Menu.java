public class Menu {

  private final MenuItem[] menu_items;

  private int iterator_index = 0; // to only be used by
                                  // iterator methods below
  private int count2 = 0;

  // Constructor
  public Menu() {
    // -----------------------------------------------------------
    // Creates and initializes menu_items array to size 10 with
    // all nulls.
    // -----------------------------------------------------------
    // (to complete)
    menu_items = new MenuItem[10];
    for (int k = 0; k < menu_items.length; k++) {
      menu_items[k] = null;
    }
  }

  // Method
  public int numItems() {
    // -----------------------------------------------------------
    // Returns the current number of items in the menu.
    // -----------------------------------------------------------
    // (to complete)
    return count2;
  }

  // Method
  public void add(MenuItem menu_item)
      throws NumberMenuItemsExceededException {
    // -----------------------------------------------------------
    // Adds menu item to next available space in array menu_items.
    //
    // Throws NumberMenuItemsExceededException if menu_items array
    // is full.
    // -----------------------------------------------------------
    // (to complete)
    if (count2 > menu_items.length) {
      throw new NumberMenuItemsExceededException();
    }

    menu_items[count2] = menu_item;
    count2++;
  }

  // Method
  public MenuItem getMenuItemByListing(int n)
      throws MenuItemNotFoundException {
    // -----------------------------------------------------------
    // Returns nth MenuItem (object) from the listed menu items.
    //
    // Throws MenuItemNotFoundException if n is outside the
    // range of 1..numItems().
    // -----------------------------------------------------------
    // (to complete)
    if (n < 1 || n > numItems()) {
      throw new MenuItemNotFoundException();
    } else {
      return menu_items[n - 1];
    }
  }

  // Method
  public MenuItem getMenuItemByID(String item_ID)
      throws MenuItemNotFoundException {
    // -----------------------------------------------------------
    // Returns MenuItem (object) for given item_ID.
    //
    // Throws MenuItemNotFoundException if menu item with item_ID
    // not found.
    // -----------------------------------------------------------
    // (to complete)

    for (int k = 0; k < numItems(); k++) {
      if (menu_items[k].getItemID().equals(item_ID)) {
        return menu_items[k];
      }
    }
    throw new MenuItemNotFoundException();

  }

  // -----------------------------------------------------------
  // Iterator Methods
  // -----------------------------------------------------------
  // These methods are used to iterate over the menu items.
  // Items may be iterated over multiple times by calling reset
  // to begin at the first menu item again.
  //
  // NOTE: These methods use instance variable iterator_index
  // which no other methods should use.
  // -----------------------------------------------------------

  public void reset() {
    // -----------------------------------------------------------
    // Resets to first order of list of menu items.
    // -----------------------------------------------------------
    // (to complete)
    iterator_index = 0;
  }

  public boolean hasNext() {
      // -----------------------------------------------------------
      // Returns true if there exists another menu item to retrieve.
      // Otherwise, returns false.
      // -----------------------------------------------------------
      // (to complete)
      return iterator_index < numItems();

  }

  public MenuItem next() {
    // -----------------------------------------------------------
    // Returns next menu item in list of menu items.
    // (Must only be called when hasNext() is true.)
    // -----------------------------------------------------------
    // (to complete)
    if (hasNext()) {
      return menu_items[iterator_index++];
    } else {
      return null;
    }

  }

}
