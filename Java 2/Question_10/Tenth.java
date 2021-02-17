package Question_10;

import java.util.LinkedList;
import java.util.Queue;

class Customer {
    private int token = 0;
    Order ord = null;

    // set token for the customer order
    public void setToken(int token) {
        this.token = token;
    }

    // places order to cashier
    public Order placeOrdertoCashier() {
        ord = new Order(101, "coffee");
        return ord;
    }

    // pays bill of the order
    void paysBill(Order ord) {
        System.out.println("bill of " + ord.orderName + " is paid");
    }


}
class Cashier {
    private Barista barObj = null;

    // takes order from customer
    public void takesOrderfromCustomer(Order ord) {
        System.out.println("taken order of " + ord.orderName);
    }
    // takes cash from customer
    public int takesCash(Order ord) {
        System.out.println("cash of " + ord.orderName + " is taken");
        return 3423;
    }
    // places order to barista
    public Barista placeOrdertoBarista(Order ord, int token, Queue orderQueue) {
        orderQueue.add(token);
        barObj = new Barista(token, ord.orderId);
        return barObj;
    }
    // gives order to the customer
    public void giveToken(Queue completteOrderqueue) {
        System.out.println("sorry for the wait here is the order for token " + completteOrderqueue.peek());
    }

}

class Barista {
    private int token;
    private int orderId;

    public Barista(int token, int orderId) {
        this.token = token;
        this.orderId = orderId;

    }

    // takes order form Cashier
    public void takeOrderfromCashier(Queue orderQueue) {
        System.out.println("getting next order from queue whose id is " + orderQueue.peek());

    }

    // prepares coffee and add the order token to the completeOrder Queue list
    public boolean prepareCoffee(Queue completeOrderQueue, Queue orderQueue) {
        System.out.println("preparing the coffee");
        completeOrderQueue.add(orderQueue.peek());
        System.out.println("order for " + token + " is ready");
        orderQueue.remove();
        return true;

    }

}

class Order {
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    int orderId;
    String orderName;
}



public class Tenth {
    public static void main(String[] args) {
        int token;
        Queue<Integer> orderQueue = new LinkedList<Integer>();
        Queue<Integer> completeOrderQueue = new LinkedList<Integer>();
        Barista barista = null;
        Customer cust = new Customer();
        Cashier cashier = new Cashier();
        Order ord = cust.placeOrdertoCashier(); // Customer places order
        cashier.takesOrderfromCustomer(ord); // Cashier takes order
        cust.paysBill(ord); // Customer pays Bill
        token = cashier.takesCash(ord); // Cashier gives token
        cust.setToken(token); // customer gets token.
        barista = cashier.placeOrdertoBarista(ord, token, orderQueue); //Cashier places order to barista
        barista.takeOrderfromCashier(orderQueue); // Barista takes order

        // if order is ready by barista then custormer give the order to the Customers.
        if (barista.prepareCoffee(completeOrderQueue, orderQueue)) {
            cashier.giveToken(completeOrderQueue);
        }


    }
}
