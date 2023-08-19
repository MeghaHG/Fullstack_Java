package ExceptionHandling;

public class ThrowAndThrows {

    public static void main(String[] args) throws Exception {

        int age=15;
        if(age>=18){
            System.out.println("you can vote");
        }else {
            throw new Exception("you can not vote");
        }

        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
    }
}


/**
 *              throw                                                   throws
 *      1.throw is used to throw exception explicitly           1.used to declare exception
 *
 *      2.throw is used within method                           2.used with method signature
 *
 *      3.throw is used with instance of class                  3.used with class name
 *
 *      4.you can throw
 *
 *
 *
 */