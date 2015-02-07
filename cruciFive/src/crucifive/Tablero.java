/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

import java.util.LinkedList;
import javax.swing.JTextField;

/**
 *
 * @author fernando
 */
public class  Tablero{
    public static int x;
    public static int y;
    private static int tipo;
    private float score;
    private float time;
    private LinkedList<PalabraT> palabras;
    private static Diccionario dictionary;
    private static String GameType;
    char matrizSolucion[][];
    char matriz[][];
   
    
    public void setHorizontal(int NumeroHorizontal)
    {
        x = NumeroHorizontal;
    }
    
    public void setVertical(int NumeroVertical)
    {
        y = NumeroVertical;
    }
    
    public int getHorizontal()
    {
        return x;
    }
    
    public int getVertical()
    {
        return y;
    }

    public void setDictionary(Diccionario d)
    {
        dictionary=d;
    }

    
    public void AutoGenCascada()
    {
        if (matrizSolucion==null)
        {
            matrizSolucion = new char[14][14];
            
            
            
        }
        
    }
}
