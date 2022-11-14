
package com.mycompany.listaprioridad;

public class ColaADT {
    
    Arreglo<ColaADT> ColaPrioridad;
    int Prioridad;

    public ColaADT(int Prioridad) {
        ColaPrioridad = new Arreglo (Prioridad);
        this.Prioridad = Prioridad;
        for (int i = 0; i < Prioridad; i++) {
            ColaPrioridad.setItem(i, new ColaADT());
        }
    }

    private ColaADT() {
    }

    
    public void enqueue(int Prioridad, String valor) {
        if (Prioridad >= 0 && Prioridad < Prioridad) {
            ColaPrioridad.getItem(Prioridad).enqueue(valor);
        } else if (Prioridad > Prioridad) {
            ColaPrioridad.getItem(Prioridad - 1).enqueue(valor);
        }
    }

    public void dequeue() {
        for (int K = 0; K < Prioridad; K++) {
            if (!ColaPrioridad.getItem(K).estaVacia()) {
                ColaPrioridad.getItem(K).dequeue();
                break;
            }
        }
    }

    public void nombrar() {
        for (int Q = 0; Q < Prioridad; Q++) {
            System.out.print("Prioridad " + Q + " ");
            ColaPrioridad.getItem(Q).nombrar();
        }
    }
    public boolean estaVacia() {
        int elemento;
        elemento = 0;
        for (int j = 0; j < Prioridad - 1; j++) {
            if (ColaPrioridad.getItem(j).estaVacia()) {
                elemento++;
            } else {
            }
        }
        return elemento == 0;
    }

    @Override
    public String toString() {
        return "ColaADT{" + "Prioridad=" + ColaPrioridad.toString() + '}';
    }

    private static class Arreglo<T> {

        public Arreglo(int Prioridad) {
        }

        private Object getItem(int j) {
        }

        private void setItem(int i, ColaADT colaADT) {
        }
    }

    private static class T {

        public T() {
        }
    }
}
