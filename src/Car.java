public class Car {

    void drive(){
        System.out.println("Driving");
    }
}
class Audi extends Car{

    void autoDrive() {
        System.out.println("Auto driving");
    }

}

class Audi2050 extends Audi{

    void fly(){
        System.out.println("Flying");
    }
}

class Test{

    public static void main(String[] args) {
        Audi2050 a =new Audi2050();
        a.drive();
        a.autoDrive();
        a.fly();
    }
}