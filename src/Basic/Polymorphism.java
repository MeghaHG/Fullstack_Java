package Basic;

public class Polymorphism {

    public int add(int a,int b){
        return a+b;
    }

    public double add(int a, double b){
        return a+b;
    }
        public static void main(String[] args){
        Polymorphism obj = new Polymorphism();

        System.out.println(obj.add(3,5));
            System.out.println(obj.add(3,5.8));
        }

}

