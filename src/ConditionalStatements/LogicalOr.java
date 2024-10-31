package ConditionalStatements;

public class LogicalOr {

    public static void main(String[] args) {
        boolean rain=true;
        boolean cold=false ;

        if (rain||cold){//as long as one of the conditions are true, my block of code will be executed.
            System.out.println("I am staying home and studying Java");

        }else {
            System.out.println("I will go for a walk");
        }

    }
}
