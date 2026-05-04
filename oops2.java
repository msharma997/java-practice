class Livingbeing {
    void breathe(){
        System.out.println("all living beings can breathe");
    }
}
class Animals extends Livingbeing {
    void eat(){
        System.out.println("animals eat food");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("birds can fly");
    }
}
class Parrot extends Bird {
    void speak(){
        System.out.println("parrot can speak");
    }
}
public class oops2 {
    public static void main(String[]args){
        Parrot p = new Parrot();
        p.breathe();
        p.eat();
        p.fly();
        p.speak();
    }
}