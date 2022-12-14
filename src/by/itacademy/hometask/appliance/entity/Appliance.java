package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable {
        private static final long serialVersionUID = 1l;

        private String name;

    public Appliance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appliance)) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(getName(), appliance.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                '}';
    }
}
