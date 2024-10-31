package ConditionalStatements;

public class IfElseIfStatement {
    public static void main(String[] args) {

        //The if statement is used to check for a condition.
        int score = 75;
        if (score > 90) {
            System.out.println("You are doing an excellent job");
        } else if (score > 80) {
            System.out.println("You are doing great job");
        } else if (score > 70) {
            System.out.println("You are doing good");
        } else if (score > 60) {
            System.out.println("You are doing ok");
        } else {
            System.out.println("You need to get study more");
        }
    }
}
