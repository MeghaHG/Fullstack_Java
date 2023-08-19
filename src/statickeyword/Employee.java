package statickeyword;

public class Employee {

    int id;
    String name;
    static String companyName = "ABC";
/** static block */
    static {
        System.out.println("in static block");
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        //this.companyName = companyName;
    }

    public static void main(String[] args) {

        Employee e = new Employee(1,"Megha");
        Employee e1 = new Employee(2,"harshal");
        Employee e2 = new Employee(3,"gaurav");

        System.out.println(e.id+" "+e.name+" "+e.companyName);
        System.out.println(e1.id+" "+e1.name+" "+e1.companyName);
        System.out.println(e2.id+" "+e2.name+" "+e2.companyName);
    }
}
