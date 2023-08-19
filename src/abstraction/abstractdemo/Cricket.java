package abstraction.abstractdemo;

public class Cricket extends Abssports{

    @Override
    public void play() {
        System.out.println("in play");
    }
    public static void main(String[] args){
        Cricket obj = new Cricket();
        obj.show();
        obj.play();
    }

}
