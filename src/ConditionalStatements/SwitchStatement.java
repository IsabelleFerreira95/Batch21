package ConditionalStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        // The switch statement looks for equality
        //Switch statement can not have a duplicate case

        String choice="juice";

        switch (choice){
            case "water":
                System.out.println("Dispensing water");
                break;//it tells Java to leave the block of code.Must use to not execute unnecessary output.
            case "soda":
                System.out.println("Dispensing soda");
                break;
            case"juice":
                System.out.println("Dispensing juice");
                break;
            case"coffee":
                System.out.println("Dispensing coffee");
                break;
            default:
                System.out.println("Your drink is not available");
                break;
        }
    }
}
