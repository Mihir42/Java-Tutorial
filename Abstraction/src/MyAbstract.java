// Abstraction - Hides certain details and only show important information

// Abstract class - Cannot create objects, must be inherited by another class
public abstract class MyAbstract {

    public String myVariable;

    // Abstract classes can have constructors - used to initialise fields
    public MyAbstract() {
        System.out.println("The constructor of the abstract class");
        this.myVariable = "This variable has been initialised";
    }

    // Abstract method - No body, provided by the subclass when overridden
    public abstract void abstractMethod();

    // Abstract classes can have concrete methods
    public void normalMethod() {
        System.out.println("This is a normal method");
    }
}

