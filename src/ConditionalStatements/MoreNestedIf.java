package ConditionalStatements;

public class MoreNestedIf {
    public static void main(String[] args) {
        boolean member=true;
        double purchaseAmount=100;

        if (member){
            if (purchaseAmount>100){
                System.out.println("Your discount is 15%");
            }else {
                System.out.println("Your discount is 10%");
            }

        }else {
            if (purchaseAmount>100){
                System.out.println("Your discount is 5%");
            }else {
                System.out.println("There is no discount for non members");
            }
        }
    }
}
