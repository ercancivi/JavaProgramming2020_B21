package day45_Exceptions;

public class LunchBreakException extends RuntimeException{

    public LunchBreakException() {
        super("It's time for lunch");
    }

    public LunchBreakException(String msg) {
        super(msg);
    }

}


class Test1 {

    public static void main(String[] args) {
        throw new LunchBreakException("We need to take lunch");

    }

}