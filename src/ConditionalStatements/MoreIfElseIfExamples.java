package ConditionalStatements;

public class MoreIfElseIfExamples {
    public static void main(String[] args) {
        String language="portuguese";
        if (language.equalsIgnoreCase("English")){
            System.out.println("Hello");
        } else if (language.equalsIgnoreCase("Spanish")) {
            System.out.println("Hola");
        } else if (language.equalsIgnoreCase("French")) {
            System.out.println("Bonjour");
        } else if (language.equalsIgnoreCase("Italian")) {
            System.out.println("Ciao");
        } else if (language.equalsIgnoreCase("Portuguese")) {
            System.out.println("Oi, tudo bem?");
        }else {
            System.out.println("I do not know how to greet you");
        }
    }
}
