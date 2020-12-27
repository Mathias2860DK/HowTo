package Exeptions;

/*
This class extends the Exception class and we have the constructor printing the message. And also a constructor
if we want to modify the message.

 */
public class NotEnoughMoneyException extends Exception{
//passing the message as an argument
    public NotEnoughMoneyException(String message){
        super(message);
    }
    //if we dont wont to modify the exeption
    public NotEnoughMoneyException(){
        super("You don't have enough money for withdrawal.");
    }
}
