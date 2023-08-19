package Basic;


    import java.lang.reflect.Constructor;
    import java.lang.reflect.InvocationTargetException;

    public class Day1Main {


        String tv;

        public String getName(){
            return "hii";
        }

        int i= 0;

        public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
            Day1Main main = new Day1Main();
            main.i=10;

            System.out.println(main.i);
            main.getName();
            System.out.println(main.getName());
            System.out.println("Hello World");


            Day1Main main2 = Day1Main.class.newInstance();
            System.out.println(main2.tv);

            Constructor<Day1Main> main3 = Day1Main.class.getConstructor();
            Day1Main main4 = main3.newInstance();
            System.out.println(main4.tv);

            Day1Main main5 = (Day1Main) main.clone();
        }
    }


