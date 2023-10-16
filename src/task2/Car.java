package task2;

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    private int maxSpeed;
    private String color;
    private String number;

    private Fuel fuel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 300){
            throw new IllegalArgumentException("Max speed cannot be more than 300 km/h");
        }
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void accelerate(int speed) throws Exception{
        if(this.currentSpeed + speed > this.maxSpeed){
            throw new Exception("Too fast");
        }
        this.currentSpeed += speed;
    }

    public void slowDown(int speed) throws Exception {
        if (this.currentSpeed - speed < 0) {
            throw new Exception("Too slow");
        }
        this.currentSpeed -= speed;
    }
    @Override
    public String toString(){
        return "Car " + this.brand + " Model " + this.model + " Current speed " + this.currentSpeed + " Max speed " + this.maxSpeed + " Fuel " + this.fuel + " Color " + this.color + " Number " + this.number;

    }

    }

