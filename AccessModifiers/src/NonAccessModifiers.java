public class NonAccessModifiers {

    // Non Access Modifiers change the behaviour of classes, methods and variables

    // Final - Unable to change variable values, override methods or instantiate classes
    public class MyFinal {
        final int finalVariable = 5;

        final void finalMethod() {
            System.out.println("This method cannot be overridden");
        }
    }

    // Abstraction - Hides certain details while showing necessary features
    public abstract class MyAbstractClass {
        public abstract void abstractMethod();
    }

    // Static - Methods and variables belong to the class
    public class MyStatic {
        static int staticVariable = 10;

        static void staticMethod() {
            System.out.println("This method is static");
        }
    }

}
