package restAssured;

public class Car {

    private String color;
    private String brand;
    private String wheel;

    public String getColor() {
        return color;
    }
    public String getWheel(){
        return wheel;
    }

    public String getBrand() {
        return brand;
    }
    public Car(String brand,String color,String wheel) {
        this.brand = brand;
        this.color=color;
        this.wheel=wheel;
    }


}
