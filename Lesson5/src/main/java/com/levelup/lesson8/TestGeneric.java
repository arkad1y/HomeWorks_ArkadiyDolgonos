package com.levelup.lesson8;

import com.levelup.lesson3.task1.Pen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 28.08.2016.
 */
public class TestGeneric<T extends Pen> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;

    }

    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
        List objs = new ArrayList();

        for (Iterator<Pen> iterator = pens.iterator(); iterator.hasNext(); ) {
            Pen pen = iterator.next();
        }

        for (int i = 0; i < pens.size(); i++) {

        }
        for (Pen pen : pens) {

        }
    }
}
