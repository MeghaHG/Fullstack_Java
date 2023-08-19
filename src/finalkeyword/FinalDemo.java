package finalkeyword;

public class FinalDemo {

    final int i =10;

    public final void show(){
//        i =19;
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println(obj.i);

    }
}

 //class FinalDemo1 extends FinalDemo{
//    public void show(){
////        i =19;
//    }
//
//
//}

