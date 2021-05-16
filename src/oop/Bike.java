package oop;

public class Bike extends Vehicle{
    private boolean fourStroke=true;

    public Bike(String name, String color, String model, String company, String engine, boolean b){
        super(name,color,model,company,engine);
        this.fourStroke=fourStroke;
    }

    public boolean getFourStroke() {
        return fourStroke;
    }

    public String getInfo() {
        return "This is a Bike";
    }

    public void setFourStroke(boolean fourStroke) {
        this.fourStroke = fourStroke;
    }
}
