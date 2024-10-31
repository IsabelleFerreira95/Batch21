package ConditionalStatements;

public class IfElseStatement {
    public static void main(String[] args) {
        int score=99;

        if (score>90){
            System.out.println("You are doing a great job!");//if the condition is true, this line of code will be executed
        }else {
            System.out.println("You are doing good, however there is room for improvement");
            //if the condition is false, the line of code above will be executed

        }
        String password="Hello12";

        if (password.equals("Hello123")){
            System.out.println("Password is correct, you will be able to log in");
        }else {
            System.out.println("Password is not correct, error message will be displayed");
        }
    }
}
