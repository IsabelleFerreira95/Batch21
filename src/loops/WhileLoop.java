package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int time=7;
        /*
        For while loop, the block of code will only be executed if condition is true. If condition is not true,
        Java will not enter the block of code. On while loop, condition is checked first.
         */

        while (time<12){
            System.out.println("Good Morning");
            time++;//This is a control variable that allows to control de loop, otherwise, it will not stop
        }
    }
}
