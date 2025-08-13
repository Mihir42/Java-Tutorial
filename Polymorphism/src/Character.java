// Polymorphism - means many forms, perform single action in different ways
// This example, one method can have different forms and implementations

class Mario {
    public void speak() {
        System.out.println("Wahooo");
    }
}

class Luigi extends Mario{
    public void speak() {
        System.out.println("Oh yeah");
    }
}

class Wario extends Mario{
    public void speak() {
        System.out.println("Wahahah");
    }
}

class Waluigi extends Mario{
    public void speak() {
        System.out.println("Waaaaaaaa");
    }
}