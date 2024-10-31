package operators;

public class EqualVsDoubleEqual {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println(a==b);//false; double "==" is the relational operator
        //System.out.println(a=b); this is incorrect because is the "=" is an assignment operator
    }
}
