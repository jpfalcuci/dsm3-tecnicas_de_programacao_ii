package Vehicles;

public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showDetails() {
        System.out.println("Marca: " + this.getBrand() +
                ", Modelo: " + this.getModel() +
                ", Cor: " + this.getColor());
        System.out.printf("Objeto: %s, HashCode: %s \n", this, this.hashCode());
    }
}
