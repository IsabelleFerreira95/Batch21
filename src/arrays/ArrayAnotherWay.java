package arrays;

public class ArrayAnotherWay {
    public static void main(String[] args) {
        String[] names={"James", "Jane", "Jack", "Jacob", "John"};

        System.out.println(names[2]);
        System.out.println(names[4]);
        //arrays will ALWAYS be based on by indexes
        //need to make sure to specify the correct index

        int size= names.length;
        System.out.println(size);

        //how to retrieve all elements from my array

        for (int i=0; i<size;i++){
            System.out.println(names[i]);
        }

    }
}
