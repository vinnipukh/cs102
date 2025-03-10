package questionset1;

public class Car {
    public String model;
    public String color;
    public int year;
    private int mileage;

    public Car(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
        mileage = 0;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }

    public void start_engine(){
        System.out.println("Engine started");
    }
    public void paint_car(String new_color){
        this.color = new_color;

    }


}
