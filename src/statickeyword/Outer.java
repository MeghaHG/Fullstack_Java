package statickeyword;

public class Outer {

    int i=10;

    public static void show(){ //member function
        System.out.println("In show");
    }
   static class Inner{
        int i=20;
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o.i);

        //Inner i = new Outer().new Inner();
        //System.out.println(i.i);

        Outer.show();

        Outer.Inner inner = new Inner();
        System.out.println(inner.i);
    }
}
