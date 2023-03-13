package HW02;

public abstract class Bird implements Animals {
    protected double flightHeight;

    protected Bird(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    @Override
    public double getHeight() {
        return flightHeight;
    }

    @Override
    public abstract double getWeight();

    @Override
    public abstract String getEyeColor();

    @Override
    public abstract void makeSound();

    @Override
    public abstract void printInfo();

    public void fly() {
        System.out.println("Я летаю на " + flightHeight + " метрах");
    }
}
