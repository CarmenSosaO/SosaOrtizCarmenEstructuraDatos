package com.mycompany.tablashash;

import java.util.LinkedList;

public class TablasHash<K, T> {

    private LinkedList<Dato<K, T>>[] data;

    public TablasHash(int tamanio) {
        data = new LinkedList[tamanio];
    }

    public void add(K key, T valor) {
        int index = (key.hashCode() & 0x7fffffff) % data.length;
        data[index].add(new Dato<>(key, valor));
    }

    public T valueOf(K key) {
        int index = (key.hashCode() & 0x7fffffff) % data.length;
        for (Dato<K, T> item : data[index]) {
            if (item.key == key) {
                return item.valor;
            }
        }
        throw new NullPointerException("El valor no esta en la tabla");
    }

    public void remove(K key) {
        int index = (key.hashCode() & 0x7fffffff) % data.length;
        for (int i = 0; i < data[index].size(); i++) {
            if (data[index].get(i).key == key) {
                data[index].remove(i);
                break;
            }
        }
    }

    private class Dato<K, T> {

        K key;
        T valor;

        public Dato(K key, T valor) {
            this.key = key;
            this.valor = valor;
        }

        @Override
        public String toString() {

            return key + ":" + valor;
        }
    }

    public static void main(String[] args) {

    }
}
