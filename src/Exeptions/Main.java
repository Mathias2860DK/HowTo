package Exeptions;

public class Main {

    /*
    Let's say we have a bankAccount with 100DKK on it. If you try to withdraw more than 100DKK,
    some kind of error should display. You can make your own Exception by extending the Exception class.
     */

    public static void main(String[] args) {
        double totalAmount = 100;
        double moneyForWithDraw = 150;
        try {
            if (moneyForWithDraw > totalAmount){
                throw new NotEnoughMoneyException("You don't have enough money for withdrawal.");
                //throw new NotEnoughMoneyException(); //prints the same, because it's in our NotEnoughMoneyException.
            } else {
                System.out.println("You do have enough money for withdrawal! ");
            }
} catch (NotEnoughMoneyException exception){
            System.out.println(exception.getMessage());
        }
    }
}
