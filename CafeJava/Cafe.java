
public class Cafe {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables 
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 4.5;
        double cappucino = 5.5;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP Interactions
        // System.out.println(generalGreeting + customer1 + pendingMessage);
        
        // if (isReadyOrder4 == true){
        //     System.out.println( customer4 + readyMessage + " " + displayTotalMessage + cappucino);
        // }else {
        //     System.out.println(pendingMessage);
        // }

        // if (isReadyOrder2 == true){
        //     System.out.println( customer2 + readyMessage + " " + displayTotalMessage + (cappucino + cappucino));
        // }else {
        //     System.out.println(pendingMessage);
        // }

        System.out.println(customer2 + displayTotalMessage + (latte - dripCoffee));
    
    }
}
