package controlflowstatement;

public class IfElse {
    public static void main(String[] args) {

        int age=18;
        if(age>=18){
            System.out.println("you can vote");
        }else {
            System.out.println("you cannot vote");
        }

        int a=10,b=50,c=2;
        if(a>b && b>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }


    }
}
