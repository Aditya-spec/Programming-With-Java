import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order=new Order(2,"Soft Drinks",100.0);

    @Test
    void getQuantity() {
        int expectedItemQuantity=2;
        int getItemQuantity=order.getQuantity();
        assertEquals(expectedItemQuantity,getItemQuantity);
            }

    @Test
    void setQuantity() {
      int itemQuantity=5;
        order.setQuantity(itemQuantity);
        int getItemQuantity=order.getQuantity();
        assertTrue(getItemQuantity==5);
    }


    @Test
    void getItemName() {
        String expectedItemName="Soft Drinks";
        String getItemName=order.getItemName();
        assertEquals(expectedItemName,getItemName);
   }

    @Test
    void setItemName() {
String itemName="Chocolate bar";
        order.setItemName(itemName);
        String getItemName=order.getItemName();
        assertTrue(
                getItemName != "Chocolate");
    }


    @Test
    void getPrice() {
        double expectedItemPrice=100.0;
        double orderGetPrice=order.getPrice();
        assertEquals(expectedItemPrice,orderGetPrice);
    }

    @Test
    void setPrice() {
        double orderPrice=50.0;
        order.setPrice(orderPrice);
        assertFalse(order.getPrice()==35.0);
    }



    @Test
    void getPriceWithTex() {
 double expectedOrderPriceWithTex=132.7;
 order.setPriceWithTex(expectedOrderPriceWithTex);
 assertEquals(expectedOrderPriceWithTex,order.getPriceWithTex());
    }

    @Test
    void setPriceWithTex() {
        double priceWithTex=132.50;
        order.setPriceWithTex(priceWithTex);
        assertTrue(order.getPriceWithTex()==priceWithTex);
    }



}