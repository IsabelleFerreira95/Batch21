package ConditionalStatements;

public class SwitchLimitation {
    public static void main(String[] args) {
        //Switch statement can not use any relational or logical operator because is only to check for equality
        /*
        We can ONLY use:
        char,byte, short or int for numbers
        and String for words.
         */
        int electionYear=2024;

        switch (electionYear){

            case 2020:
                System.out.println("President is Biden");
                break;
            case 2016:
                System.out.println("President is Trump-vomiting after saying his name");
                break;
            case 2012:
                System.out.println("President is Obama");
                break;
            case 2008:
                System.out.println("President is Obama");
                break;
            default:
                System.out.println("President is Unknown");
                break;

        }
    }
}
