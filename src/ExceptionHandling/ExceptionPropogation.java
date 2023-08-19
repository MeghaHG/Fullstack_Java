package ExceptionHandling;

public class ExceptionPropogation {


    public void a() {
        int i = 1 / 0;
    }

    public void b() {
        try {
            a();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        public void c(){
            b();
        }

    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
    }



