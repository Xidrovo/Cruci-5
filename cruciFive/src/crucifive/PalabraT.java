/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

/**
 *
 * @author JorLuis
 */
public class PalabraT extends Palabra{
    
    private boolean orientacion;      //  true para horizontal, false vertical
    private int posicioni[] = new int[2];    //aqui ira la posicion en el tablero de la palabra
    private int posicionf[] = new int[2];

    
    
    public PalabraT(boolean orientacion) {
        this.orientacion = orientacion;
    }

    public PalabraT(String Word, String Pista, boolean orientacion) {
        super(Word, Pista);
        this.orientacion = orientacion;
    }

    public boolean isOrientacion() {
        return orientacion;
    }

    public void setOrientacion(boolean orientacion) {
        this.orientacion = orientacion;
    }

    public int[] getPosicioni() {
        return posicioni;
    }

    public void setPosicioni(int[] posicioni) {
        this.posicioni = posicioni;
    }

    public int[] getPosicionf() {
        return posicionf;
    }

    public void setPosicionf(int[] posicionf) {
        this.posicionf = posicionf;
    }
    
    
}
