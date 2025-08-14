abstract class Mario {

    public void speak() {
        System.out.println("Wahooo");
    }

    public abstract void powerUp();

}

class FireMario extends Mario{
    public void powerUp() {
        System.out.println("Mario can now shoot fireballs");
    }
}

class MetalMario extends Mario {
    public void powerUp() {
        System.out.println("Mario is now stronger");
    }

}
