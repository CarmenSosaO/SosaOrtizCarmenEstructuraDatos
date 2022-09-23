

package com.mycompany.juegodevida;

import java.util.Scanner;

public class JuegoDeVida
{
    public static void main(final String[] args) {
        int numColumnas = 0;
        int numFilas = 0;
        int generacionMax = 0;
        int[][] celulasOrigen = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        numColumnas = (numFilas = celulasOrigen.length);
        System.out.println("¿Cuantas generaciones quieres visualizar? ");
        final Scanner teclado = new Scanner(System.in);
        generacionMax = Integer.parseInt(teclado.nextLine());
        System.out.println("MATRIZ ORIGEN");
        for (int i = 0; i < numFilas; ++i) {
            for (int j = 0; j < numColumnas; ++j) {
                System.out.print(celulasOrigen[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int g = 1; g <= generacionMax; ++g) {
            final int[][] celulasDestino = new int[numFilas][numColumnas];
            for (int k = 0; k < numFilas; ++k) {
                for (int l = 0; l < numColumnas; ++l) {
                    int vecinosVivos = 0;
                    vecinosVivos = contarVecinosVivos(celulasOrigen, k, l);
                    if (celulasOrigen[k][l] == 1) {
                        if (vecinosVivos == 2 || vecinosVivos == 3) {
                            celulasDestino[k][l] = 1;
                        }
                        else if (vecinosVivos <= 1) {
                            celulasDestino[k][l] = 0;
                        }
                        else if (vecinosVivos >= 4) {
                            celulasDestino[k][l] = 0;
                        }
                    }
                    else if (vecinosVivos == 3) {
                        celulasDestino[k][l] = 1;
                    }
                    else {
                        celulasDestino[k][l] = 0;
                    }
                }
            }
            System.out.println();
            System.out.println("GENERACION " + g);
            for (int k = 0; k < numFilas; ++k) {
                for (int l = 0; l < numColumnas; ++l) {
                    System.out.print( celulasDestino[k][l] + " ");
                }
                System.out.println();
            }
            celulasOrigen = celulasDestino;
        }
    }
    
    private static int contarVecinosVivos(final int[][] matriz, final int posI, final int posJ) {
        int vecinosVivos = 0;
        int n = 0;
        n = matriz.length - 1;
        if (posI > 0 && posJ > 0) {
            vecinosVivos += matriz[posI - 1][posJ - 1];
        }
        if (posI > 0) {
            vecinosVivos += matriz[posI - 1][posJ];
        }
        if (posI > 0 && posJ < n) {
            vecinosVivos += matriz[posI - 1][posJ + 1];
        }
        if (posJ > 0) {
            vecinosVivos += matriz[posI][posJ - 1];
        }
        if (posJ < n) {
            vecinosVivos += matriz[posI][posJ + 1];
        }
        if (posI < n && posJ > 0) {
            vecinosVivos += matriz[posI + 1][posJ - 1];
        }
        if (posI < n) {
            vecinosVivos += matriz[posI + 1][posJ];
        }
        if (posI < n && posJ < n) {
            vecinosVivos += matriz[posI + 1][posJ + 1];
        }
        return vecinosVivos;
    }
}
