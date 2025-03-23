package questionset5;

public class Appliance {
    public Appliance(){

    }

    public final void turnOn(){
        System.out.println("Appliance is turning on.");
    }
    public void turnOn2(){
        turnOn();
    }
}
