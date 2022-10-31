package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {

    private static final long serialVersionUID = 6552L;


    private double power_consumption;
    private double weigjht;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(String name) {
        super(name);
    }

    public Oven(String name, double power_consumption, double weigjht, double capacity,
                double depth, double height, double width) {
        super(name);
        this.power_consumption = power_consumption;
        this.weigjht = weigjht;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.power_consumption, power_consumption) == 0 && Double.compare(oven.weigjht, weigjht) == 0 && Double.compare(oven.capacity, capacity) == 0 && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power_consumption, weigjht, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weigjht=" + weigjht +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
