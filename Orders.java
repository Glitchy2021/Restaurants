public class Orders {

  // Stores menu item IDs for all orders
  private final String[] ordered_items;

  // Only to be used by iterator methods
  private int iterator_index = 0;

  private int count =0;
  // Constructor
  public Orders(int max_num_orders) {
  // ------------------------------------------------------
  // Initalizes item_numbers array to size max_num_orders
  // and initializes to all nulls.
  // ------------------------------------------------------
// (to complete)
    ordered_items = new String[max_num_orders];
    for(int k=0; k <ordered_items.length; k++)
    {
      ordered_items[k] = null;
    }
  }

  // Method
  public int numOrders() {
  // ------------------------------------------------------
  // Returns the current number of ordered items.
  // ------------------------------------------------------
  // (to complete)
  return count;
  }

  // Method
  public void add(String item_number) 
                      throws NumberOrdersExceededException {
  // ------------------------------------------------------
  // Adds item_number to next available space in array 
  // ordered_items.
  //
  // Throws NumberOrdersExceededException if ordered_items
  // array is full.
  // ------------------------------------------------------
  // (to complete)
  
        if (count> ordered_items.length)
        {
          throw new NumberOrdersExceededException();
        }
        else{
          ordered_items[count] = item_number;
          count++;
          
        }
  }

  public void remove(int ItemNum)
  {
    
    int index = ItemNum -1;
    if (index<0|| index>=count)
    {
      return;
    }
    for (int k = index; k<count-1;k++){
      ordered_items[k] = ordered_items[k+1];
    }
    ordered_items[count-1]= null;
    count--;    
  }

  // ------------------------------------------------------
  // Iterator Methods
  // ------------------------------------------------------
  // These methods used to iterate over the ordered items.
  // Items may be iterated over multiple times by calling
  // reset to begin at the first menu item again.
  //
  // NOTE: These methods use instance variable iterator_index
  //       which no other methods should use.
  // ------------------------------------------------------

  public void reset() {
  // ------------------------------------------------------
  // Resets to first ordered item.
  // ------------------------------------------------------
  // (to complete)
  iterator_index=0;
  }

  public boolean hasNext() {
      // ------------------------------------------------------
      // Returns true if there exists another ordered item to
      // retrieve. Otherwise, returns false.
      // ------------------------------------------------------
      // (to complete)
      return iterator_index < numOrders();
  }

  public String next() {
  // ------------------------------------------------------
  // Returns next order item ID in array of ordered items.
  // (Must only be called when hasNext() is true.)
  // ------------------------------------------------------
  // (to complete)
    if (hasNext())
    {
      return ordered_items[iterator_index++];
    }
    else{
      return "";
    }
  }
  
}
