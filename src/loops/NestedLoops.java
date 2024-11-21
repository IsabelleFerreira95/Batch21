package loops;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i=1; i<=3;i++){
            System.out.println("i="+i);

            for (int j=1;j<=2;j++){
                System.out.println("j="+j);
            }
        }
        for (int i = 1; i < 4; i++) {
            //the outer loop controls the amount of loops and if condition is false, the code
            //won't be executed.
            System.out.println("Hello");

            for (int j = 1; j <=5 ; j++) {//if this condition is false, only the first block of code will be executed.
                System.out.println("Bye");
            }
        }
    }

}
