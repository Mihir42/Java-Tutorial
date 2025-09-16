public class AccessModifiers {

    // Access Modifiers sets the access level for classes, attributes, methods and constructors

    // Default - Access level set in same class and packages
    void displayDefault() {
        System.out.println("Default access modifier");
    }

    // Public - Access level set to all classes
    public void displayPublic() {
        System.out.println("Public access modifier");
    }

    // Private - Access level set to code's declared class
    private void displayPrivate() {
        System.out.println("Private access modifier");
    }

    // Protected - Access level set to same package and class's subclasses
    protected void displayProtected() {
        System.out.println("Protected access modifier");
    }
}
