public class Main {

    public static void main(String[] args) {
        // Restaurant menu
        String[] menu = {"Pizza", "Soda", "French Fries"};
        // Cost for each item in menu
        double[] cost = {3.55, 1.00, 2.55};

        Robot robot = new Robot();
        System.out.println(robot.add("Jane", "Pizza", menu, cost));
        System.out.println("$" + robot.getTotal());
        System.out.println(robot.add("John", "Soda", menu, cost));
        System.out.println("$" + robot.getTotal());
    }
}
