package oop;

public class Car extends Vehicle{
    private boolean powerSteering=false;
    private boolean ledScreen=true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){
        super(name,color,model,company,engine);
        this.powerSteering=powerSteering;
        this.ledScreen=ledScreen;
    }

    public boolean getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public String getInfo() {
        return "This is a Car";
    }
    public boolean getLedScreen() {
        return ledScreen;
    }

    @Override
    public String getName(){
        return "Name of your vehicle is: "+ super.getName();
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }
}
