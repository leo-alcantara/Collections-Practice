package se.lexicon;

//12. Create a new class and call it Car. Add fields for Id, Brand and Model + getters and setters Create a new hashMap of type <Integer,Car>
//    and populate it with elements containing an id(Integer), and a car object(Car). Lastly, print out only the car's brand.

public class Car {

    public int id;
    public String brand;
    public String model;

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
