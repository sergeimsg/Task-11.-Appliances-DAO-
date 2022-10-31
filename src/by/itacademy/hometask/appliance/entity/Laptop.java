package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {

    private static final long serialVersionUID = -2L;

   private double battery_capacity;
    private String os;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, double battery_capacity, String os, double memoryROM,
                  double systemMemory, double cpu, double displayInchs) {
        super(name);
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBattery_capacity(), getBattery_capacity()) == 0 && getOs() == laptop.getOs() && Double.compare(laptop.getMemoryROM(), getMemoryROM()) == 0 && Double.compare(laptop.getSystemMemory(), getSystemMemory()) == 0 && Double.compare(laptop.getCpu(), getCpu()) == 0 && Double.compare(laptop.getDisplayInchs(), getDisplayInchs()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery_capacity(), getOs(), getMemoryROM(), getSystemMemory(), getCpu(), getDisplayInchs());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os=" + os +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }
}
