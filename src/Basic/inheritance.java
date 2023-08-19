package Basic;

public class inheritance { //parent class,super class,base class
    int id;
    String name;
    String add;

    public static void main(String[] args){

        inheritance obj = new inheritance();
        obj.id=1;
        obj.name="mehar";
        obj.add="pune";

        System.out.println(obj.id+" "+ obj.name+" " +obj.add);
    }
}

    class student extends inheritance { //child class, sub_class, derived class
    public static void main(String[] args) {

        student obj = new student();
        obj.id = 2;
        obj.name = "abc";
        obj.add = "pune";

        System.out.println(obj.id + " " + obj.name + " " + obj.add);
    }
}

    class teacher extends student {
    public static void main(String[] args) {

        teacher obj = new teacher();
        obj.id = 3;
        obj.name = "mnb";
        obj.add = "pune";

        System.out.println(obj.id + " " + obj.name + " " + obj.add);
    }
}

    class marks extends inheritance {
    public static void main(String[] args) {

        marks obj = new marks();
        obj.id = 4;
        obj.name = "lkj";
        obj.add = "pune";

        System.out.println(obj.id + " " + obj.name + " " + obj.add);
    }
}

