package ExceptionHandling;

public class MethodOverriding {
    public void show() throws RuntimeException{
        System.out.println("in show");
    }

class sample extends MethodOverriding {

    public void show() throws ArithmeticException {

    }
}
    public static void main(String[] args) {

    }
}


