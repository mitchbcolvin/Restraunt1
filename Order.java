import java.util.ArrayList;

public class Order{
    private ArrayList<Food> dishes;
    public ArrayList<Food> getDishes() {
        return dishes;
    }
   private int orderNumber;

   private static int totalOrders = 0;
    public void setDishes(ArrayList<Food> dishes) {

        this.dishes = dishes;
        totalOrders++;
        this.orderNumber =totalOrders;
        dishes = new ArrayList<>();
    }
    private int ordernumber;
    public int getOrdernumber() {
        return ordernumber;
    }
    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }
    public boolean equals(Order o){
        return orderNumber == o.orderNumber;
    }
}