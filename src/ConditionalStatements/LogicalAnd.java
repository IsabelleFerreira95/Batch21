package ConditionalStatements;

public class LogicalAnd {
    public static void main(String[] args) {
        int num1=30;
        int num2=200 ;
        int num3=100;
        //this logical is used to check if two or more conditions are true

        if (num1>num2 && num1>num3){//ALL conditions HAVE to be true to execute my block of code.
            System.out.println(num1+" is the largest");

        }else if (num2>num1 && num2>num3){
            System.out.println(num2+" is the largest");

        } else if (num3>num1 && num3>num2) {
            System.out.println(num3+" is the largest");

        }
    }
}
