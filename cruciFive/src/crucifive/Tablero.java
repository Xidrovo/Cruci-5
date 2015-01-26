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
public class Tablero {
    private int x;
    private int y;
    private float Score;
    private float Time;
    private LinkedList<Palabra> Palabras_x;
    private LinkedList<Palabra> Palabras_y;
    private Diccionario Dictionary;
    
    public void ShowWords(Diccionario Dictionary)
    {
        //Muestra las palabras de un diccionario indicado.
        //Creo que sólo se debería agregar con un String del nombre del diccionario.
    }
    
    public void SetWordX (Palabra palabra)
    {
        //Coloca una palabra y lo almacena en 'x'.
    }
    
    public void SetWordY (Palabra palabra)
    {
        //Coloca una palabra y se lo almacena en 'y'.
    }
    
    public int GetHorizontal (int x)
    {
        //Este método regresa la cantidad de letras horizontales colocadas.
        return x;
    }
    
    public int GetVertical (int y)
    {
        //Me recuerdan por qué coges algo en esta función... qué es que mismo hacía xD?
        return y;
    }
    
    public void GetScore()
    {
        //Muestra por pantalla el Score que está obteniendo, supongo que esta se actualiza frame by frame.
    }
    
    public void GetTime()
    {
        //It gets the fucking time~
    }
    
    public void AutoGen(Diccionario Dictionary)
    {
        //AutoGenera un crucigrama con las palabras de un diccionario.
    }
    
    public void PrintCrucigram()
    {
        //It prints actual crucigram.
    }
    
}
