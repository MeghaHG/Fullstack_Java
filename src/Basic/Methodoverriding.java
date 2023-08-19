package Basic;

public class Methodoverriding {

    public void sound(){
        System.out.println("in animal sound");
    }
}

class cat extends Methodoverriding{

    @Override
    public void sound() {
        System.out.println("cat sound");
    }

    public static void main(String[] args){
        cat obj = new cat();
        obj.sound();
    }
}
