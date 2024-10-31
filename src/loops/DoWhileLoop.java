package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num=1;
        /*
        Whit Do-While loop, Java will execute the block of code at least once, even if the condition
        is false because Java enters on the block of code first, then verify the condition.
        On do-while loop, Java execute the block of code first, than checks the condition.
         */

        do {
            System.out.println(num);
            num++;
        }while (num<=10);

    }
}
