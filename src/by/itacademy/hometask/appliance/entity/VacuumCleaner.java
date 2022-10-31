package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends Appliance implements Serializable {

        public static final long serialVersionUID = 69898L;

        private double powerConsumption;
        private String filterType;
        private String bagType;
        private String wandType;
        private int motorSpeed;
        private int cleaningWidth;

    public VacuumCleaner(String name) {
        super(name);
    }

    public VacuumCleaner(String name, double powerConsumption, String filterType,
                         String bagType, String wandType, int motorSpeed, int cleaningWidth) {
        super(name);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeed = motorSpeed;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }

    public void setMotorSpeed(int motorSpeed) {
        this.motorSpeed = motorSpeed;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.getPowerConsumption(), getPowerConsumption()) == 0 && getMotorSpeed() == that.getMotorSpeed() && getCleaningWidth() == that.getCleaningWidth() && Objects.equals(getFilterType(), that.getFilterType()) && Objects.equals(getBagType(), that.getBagType()) && Objects.equals(getWandType(), that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getFilterType(), getBagType(), getWandType(), getMotorSpeed(), getCleaningWidth());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeed=" + motorSpeed +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
