package arrays;

public class BreakKeyWord {
    public static void main(String[] args) {
        String[] auctionCars={"Toyota","Tesla", "Ford", "Mercedes", "Kia","Honda"};

        for (String car:auctionCars){
            System.out.println(car);

            if (car.equals("Mercedes")){
                break;
            }
        }
    }
}
