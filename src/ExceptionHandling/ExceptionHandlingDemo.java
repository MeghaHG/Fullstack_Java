package ExceptionHandling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

//        int i=1/0;
//        System.out.println(i);


            try {
                int i = 1 / 1;
                System.out.println(i);

                try {
                    String str = "5";
                    Integer j = Integer.parseInt(str);
                    System.out.println(j);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }

                String str = null;
                System.out.println(str.toUpperCase());

            } catch (NumberFormatException | ArithmeticException e) {
                e.printStackTrace();
            } catch(Exception e){
                System.out.println("In Exception "+e.getMessage());
            } finally {
                System.out.println("In finally");
            }

            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");

        }
}
