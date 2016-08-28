package com.levelup.lesson3.task1;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Алевтина on 30.07.2016.
 */
public class Pen {
    private String color;
    private String producerName;
    private int id;

    private Pen self;

    public Pen() {
        self=this;
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


    public boolean isEquelColor(String color){
        return this.color.equals(color);
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

        StringUtils.isNotEmpty(producerName);
        return "Pen{" +
                "color='" + color + '\'' +
                ", producerName='" + producerName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

    }


}
