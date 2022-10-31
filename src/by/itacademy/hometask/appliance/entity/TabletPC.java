package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Appliance implements Serializable {

    public static final long serialVersionUID = 99898L;

    private double battaryCapacity;
    private double displayInches;
    private double memoryROM;
    private double fleshMemory;
    private String color;

    public TabletPC(String name) {
        super(name);
    }

    public TabletPC(String name, double battaryCapacity,
                    double displayInches, double memoryROM, double fleshMemory, String color) {
        super(name);
        this.battaryCapacity = battaryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.fleshMemory = fleshMemory;
        this.color = color;
    }

    public double getBattaryCapacity() {
        return battaryCapacity;
    }

    public void setBattaryCapacity(double battaryCapacity) {
        this.battaryCapacity = battaryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getFleshMemory() {
        return fleshMemory;
    }

    public void setFleshMemory(double fleshMemory) {
        this.fleshMemory = fleshMemory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBattaryCapacity(), getBattaryCapacity()) == 0 && Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) == 0 && Double.compare(tabletPC.getMemoryROM(), getMemoryROM()) == 0 && Double.compare(tabletPC.getFleshMemory(), getFleshMemory()) == 0 && Objects.equals(getColor(), tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattaryCapacity(), getDisplayInches(), getMemoryROM(), getFleshMemory(), getColor());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battaryCapacity=" + battaryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", fleshMemory=" + fleshMemory +
                ", color='" + color + '\'' +
                '}';
    }
}
