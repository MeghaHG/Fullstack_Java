package abstraction.abstractdemo;

public abstract class Abssports {

    public abstract void play(); //declared method //incomplete method

    public void show(){
        System.out.println("in show"); //concrete method //defined method
    }
}


/**    abstract class                                               interface
 *
 *  1.abstract class uses abstract keyword                         uses interface keyword
 *
 *  2.we can use private, protected, default with method           only public methods allowed
 *
 *  3.declared & defined both methods                              only declared
 *
 *  4.partial abstraction                                          100% abstraction
 *
 */