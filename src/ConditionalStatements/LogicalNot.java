package ConditionalStatements;

public class LogicalNot {
    public static void main(String[] args) {
        /*
        Logical NOT (!) reverse the boolean result of a condition. If applied to a boolean expression that
        evaluates to true, the NOT operator (!) will invert it to false and vice versa.
         */

        boolean a=true;
        boolean b=false;

        System.out.println(!a);
        System.out.println(!b);

        boolean study=false;

        if (!study){
            System.out.println("Im not gonna get a job");
        }
    }
}
