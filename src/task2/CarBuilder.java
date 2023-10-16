package task2;

public class CarBuilder {
    private Car car = new Car();

    public CarBuilder withNumber(String number){
        if (number.length() > 8){
            throw new IllegalArgumentException("Not real number");
        }
        this.car.setNumber(number);

        return this;
    }
    public Car build() {
        return this.car;
    }
}
