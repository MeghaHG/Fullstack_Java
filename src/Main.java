// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public String getName(){
        return "hi";
    }

    int i=0;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Main main = new Main();
        main.i = 10;
        System.out.println(main.i);
        main.getName();
        System.out.println(main.getName());
        System.out.printf("Hello and welcome!");
    }
    }
