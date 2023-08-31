import myJavaTutorial.Animal;

public class Cat extends Animal{
    public void sound(){
        System.out.println("I say Meow");
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sound();
        //error because default and private features not accessible
        // c.a=1;
        // c.b=2;
    }
}
