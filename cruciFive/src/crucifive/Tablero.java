/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

import java.util.LinkedList;

/**
 *
 * @author fernando
 */
public class  Tablero{
    private static int x;
    private static int y;
    private float score;
    private float time;
    private LinkedList<Palabra> palabras_x;
    private LinkedList<Palabra> palabras_y;
    private static Diccionario dictionary;
    private static String DictionaryType;
    
    char tab1[][] = new char[14][14];
    char tab2[][] = new char[14][14];
    
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

}
