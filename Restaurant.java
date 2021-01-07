package workshop2stencil;

import java.util.Scanner;

public class Restaurant {
    workshop2solution.Chef _mainChef;
    int _numberOfOrders;

    //TODO: is there anything missing here?

    public void takeOrder() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nWhat would you like to eat? ");
        _mainChef.cook(myScanner.nextLine());
        _numberOfOrders +=1;
    }

    /*TODO: write a method to print out how much is owed based on the
     * number of orders (HINT: the chef can help us calculate this!)
     */
}
