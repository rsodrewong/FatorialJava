/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.appweb.java;

import java.util.Scanner;

/**
 *
 * @author rogerio
 */
public class Programa {
    public static void main (String args[]){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe n");
        int numero = leitura.nextInt();
        Fatorial fat = new Fatorial(numero);
        System.out.println("O fatorial de " + fat.Calculo());
    }
    
}
