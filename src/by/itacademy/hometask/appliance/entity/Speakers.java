package by.itacademy.hometask.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {

    public static final long serialVersionUID = 16546541L;

    private double powerConsumption;
    private int numbSpeakers;
    private double frequancyRange;
    private int cordLength;

    public Speakers(String name) {
        super(name);
    }

    public Speakers(String name, double powerConsumption,
                    int numbSpeakers, double frequancyRange, int cordLength) {
        super(name);
        this.powerConsumption = powerConsumption;
        this.numbSpeakers = numbSpeakers;
        this.frequancyRange = frequancyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumbSpeakers() {
        return numbSpeakers;
    }

    public void setNumbSpeakers(int numbSpeakers) {
        this.numbSpeakers = numbSpeakers;
    }

    public double getFrequancyRange() {
        return frequancyRange;
    }

    public void setFrequancyRange(double frequancyRange) {
        this.frequancyRange = frequancyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.getPowerConsumption(), getPowerConsumption()) == 0 && getNumbSpeakers() == speakers.getNumbSpeakers() && Double.compare(speakers.getFrequancyRange(), getFrequancyRange()) == 0 && getCordLength() == speakers.getCordLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getNumbSpeakers(), getFrequancyRange(), getCordLength());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numbSpeakers=" + numbSpeakers +
                ", frequancyRange=" + frequancyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
