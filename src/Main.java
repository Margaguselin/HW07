import task1.Person;
import task2.Car;
import task2.CarBuilder;
import task2.Fuel;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Lev");
        person1.setLastName("Roosileht");
        person1.setAge(34);
        System.out.println(person1.getName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        Person person2 = new Person("Vasilij", "Petrov");
        person2.setAge(75);
        System.out.println(person2.getName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());

        Person person3 = new Person("Oleg", "Dubinin", 18);
        System.out.println(person3.getName());
        System.out.println(person3.getLastName());
        System.out.println(person3.getAge());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Car car = new Car();
        car.setBrand("Bmw");
        car.setModel("X5");
        car.setCurrentSpeed(230);
        car.setMaxSpeed(250);
        car.setFuel(Fuel.DISEL);
        car.setNumber("123 ABC");
        car.setColor("Black");

        System.out.println(car);
        try {
            car.accelerate(10);
            car.slowDown(30);

        } catch (Exception exception) {
            System.out.println(exception);
        }

        System.out.println(car);

        Car car2 = new CarBuilder()
                .withNumber("999 AAA")
                .build();
        System.out.println(car2);
    }



}