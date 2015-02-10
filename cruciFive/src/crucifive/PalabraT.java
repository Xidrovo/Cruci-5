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
    private Posicion posicioni;     //la posicion en el tablero de la palabra
    private Posicion posicionf;
    private Palabra word;

    public PalabraT(boolean orientacion, Palabra word, int posx, int posy) {
        this.orientacion = orientacion;
        this.word = word;
        posicioni= new Posicion(posx, posy);
        
        if(orientacion)
        {
            posicionf=new Posicion(posx, posy+word.wordLong);
        }
        else
        {
            posicionf=new Posicion(posx+word.wordLong, posy);
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

    public Posicion getPosicioni() {
        return posicioni;
    }

    public void setPosicioni(Posicion posicioni) {
        this.posicioni = posicioni;
    }

    public Posicion getPosicionf() {
        return posicionf;
    }

    public void setPosicionf(Posicion posicionf) {
        this.posicionf = posicionf;
    }



    
    public Palabra getWord() {
        return word;
    }

    public void setWord(Palabra word) {
        this.word = word;
    }

    
    

    
    
}
