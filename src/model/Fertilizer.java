package model;

public class Fertilizer {
    private String name;
    private String type;
    private double price;

    // todo type фиксированный список
    // todo придумать как хранить цену (зависит как от даты так и фасовки)
    public Fertilizer(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Удобрение: " + name + ", Тип: " + type + ", Цена: " + price + " руб.";
    }
}