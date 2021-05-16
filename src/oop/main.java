package oop;

public class main {
    public static void main(String[] args) {
       /* Vehicle vehicle1=new Vehicle();
        vehicle1.setName("city");
        System.out.println(vehicle1.getName());
        System.out.println(vehicle1.count);

        Vehicle vehicle2=new Vehicle("civic", "black", "2012", "honda", "800");
        System.out.println(vehicle2.getColor());
        vehicle2.setColor("green");
        System.out.println(vehicle2.getColor());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle1.count);
        System.out.println(Vehicle.getVehicle());*/

        /*Car car1=new Car("civic","black","2012","honda","900",true,false);
        System.out.println(car1.getLedScreen());
        System.out.println(car1.getName());*/

        Vehicle vehicle1=new Vehicle("civic","black","2012", "honda", "900");
        System.out.println(vehicle1.getInfo());

        Vehicle vehicle2=new Car("civic","black","2012", "honda", "900", true, false);
        System.out.println(vehicle2.getInfo());

        Vehicle vehicle3=new Bike("civic","black","2012", "honda", "900", true);
        System.out.println(vehicle3.getInfo());
    }
}
