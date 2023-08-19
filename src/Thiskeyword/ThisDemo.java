    package Thiskeyword;
//1. it is used to refer current class instance variable
//2. it is used to invoke current class method
//3. it is used to invoke current class constructor
//4. it is used to pass argument in method call
//5. it is used to return as an object
public class ThisDemo {
    private int id;

    private String name;

    private String address;

    public ThisDemo(int id, String name, String address ){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public ThisDemo(){
        this(1,"megha", "pune");
    }

    public void show(){
        System.out.println("in show");
    }

    public void display(Test test){
        System.out.println(test);
    }
    public void setId(int id) {

        this.id = id;
        this.show();
    }

    public static void main(String[] args) {

        ThisDemo obj = new ThisDemo();
        obj.setId(5);

        System.out.println(obj.id);

    }
}

class Test{
    public void sample(){
        ThisDemo obj = new ThisDemo();
        obj.display(this);
    }
    public Test a(){
        return this;
    }
}
