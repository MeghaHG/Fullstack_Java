package constructor;

import java.lang.reflect.Constructor;

/**
 *
 *
 */
public class ConstructorDemo {


    public ConstructorDemo(){
        System.out.println("in constructor");
    }



     public ConstructorDemo(int i){
        System.out.println("parametrized constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo();

    }
}
