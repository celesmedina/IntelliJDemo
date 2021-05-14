package Interfaces;

public class Carro implements Rueda{
    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detener() {
        System.out.println("EL carro se detiene");
    }

    public Carro(){

    }
}
