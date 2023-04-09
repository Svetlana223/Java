package org.example.sem6.homework.model;

import java.util.HashSet;
import java.util.Set;


public class Laptop {
    private String name;
    private String color;
    private String operatingSystem;
    private Integer rom;
    private Integer ram;

    public Laptop(String name, String color, String operatingSystem, Integer rom, Integer ram) {
        this.name = name;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.rom = rom;
        this.ram = ram;
    }

    public Laptop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String toString() {
        return "Laptop{" +
                "name ='" + name + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", rom=" + rom +
                ", ram=" + ram +
                ", color =" + color +
                '}';
    }


}
