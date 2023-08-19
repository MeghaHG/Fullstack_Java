package abstraction.interfacedemo;

public class Football implements Sports {

    @Override
    public void play() {
        System.out.println("play");
    }



    public static void main(String[] args){
        Football obj = new Football();
        obj.play();
    }
}

