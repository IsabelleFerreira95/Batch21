package arrays;

public class ContinueKeyWord {
    public static void main(String[] args) {

        int[] numbers={9,66,100,8,10,78,5,101,99};
        for (int i=0; i<numbers.length;i++){

            if (numbers[i]%2==0){//the number is divided my 2 and if there is any remaining number from the result, block of code will be not executed.
                continue;//to skip the current interaction to the next interaction.
            }
            System.out.println(numbers[i]);
        }
    }
}
