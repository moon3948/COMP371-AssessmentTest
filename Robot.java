import java.util.*;


public class Robot {
    public ArrayList<String> orderedFood;
    public LinkedHashMap<String, String> orderQueue;
    public double totalCost;


    public Robot() {
        orderedFood = new ArrayList<String>();
        orderQueue = new LinkedHashMap<String, String>();

    }

    public String add(String customer, String food, String[] menu, double[] cost) {
        orderQueue.put(customer, food);
        generateCheck(food, menu, cost);
        return (customer + " has been added to the queue!");
    }

    public String remove(String customer, String food) {
        orderQueue.remove(customer, food);
        return (customer + " has been removed from the queue!");
    }

    public void generateCheck(String food, String[] menu, double[] cost) {
        orderedFood.add(food);
        for (int i = 0; i < menu.length; i++) {
            if (food.equals(menu[i])) {
                totalCost += cost[i];
            }
        }
    }

    public double getTotal() {
        return totalCost;
    }

}
