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
public class PalabraT
{
    
    private boolean orientacion;      //  true para horizontal, false vertical
    private int[] posicioni;     //la posicion en el tablero de la palabra
    private int[] posicionf;
    private Palabra word;

    public PalabraT(boolean orientacion, Palabra word, int posx, int posy) {
        this.orientacion = orientacion;
        this.word = word;
        posicioni=new int[2];
        posicionf=new int[2];
        posicioni[0]=posx;
        posicioni[1]=posy;
        if(orientacion)
        {
            posicionf[0]=posx;
            posicionf[1]=posy+word.wordLong;
        }
        else
        {
           {
            posicionf[0]=posx+word.wordLong;
            posicionf[1]=posy;
        } 
        }
    }

    public PalabraT() {
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

    public Palabra getWord() {
        return word;
    }

    public void setWord(Palabra word) {
        this.word = word;
    }

    
    

    
    
}
