/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.appweb.java;

/**
 *
 * @author rogerio
 */
public class Fatorial {
    private int n;
    public Fatorial (int n){
        this.n=n;
        
    }

    public int Calculo(){
        int fat = 1;
        for (int i = 1; i < this.getN(); i++ )
            fat*=i;
        return fat;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

   
    
}
