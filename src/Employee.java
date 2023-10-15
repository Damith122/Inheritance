public class Employee {

    double salary = 21500.56;
}

class Programmer extends Employee{
    int bonus = 5000;

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println("Salary is : " + p.salary);
        System.out.println("Bonus is : " + p.bonus);
        double x = p.bonus;
        double y = p.salary;
        System.out.println("Net salary is : " + (x+y));
    }

}
