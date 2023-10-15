public class Animal {

    void eat(){
        System.out.println("Dog is eating");
    }
}
class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

class testInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}
