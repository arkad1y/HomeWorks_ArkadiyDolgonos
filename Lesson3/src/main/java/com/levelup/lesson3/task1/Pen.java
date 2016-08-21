package com.levelup.lesson3.task1;

/**
 * Created by Алевтина on 30.07.2016.
 */
public class Pen {
    private String color;
    private String producerName;
    private int id;

    public Pen() {
    }

    public Pen(String color, String producerName, int id) {
        this.color = color;
        this.producerName = producerName;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (id != pen.id) return false;
        return producerName.equals(pen.producerName);

    }

    @Override
    public int hashCode() {
        int result = producerName.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", producerName='" + producerName + '\'' +
                ", id=" + id +
                '}';
    }


}
