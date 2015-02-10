/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

/**
 *
 * @author fernando
 */
public class PosDir {
    private Posicion posin;
    private boolean direction;
    
    public PosDir(Posicion posin, boolean direction)
    {
        this.posin = posin;
        this.direction = direction;
    }

    public Posicion getPosin() {
        return posin;
    }

    public boolean isDirection() {
        return direction;
    }
    

    
    
}
