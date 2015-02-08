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
public class Diccionario {
    //Aquí un pequeño cambio, en el escrito habíamos puesto un "Array" de clase "Palabra"
    //Ahora hay una lista vinculada que guarda palabras.
    
    private static LinkedList<Palabra> words;
    private static String name;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    public void putWord(Palabra word)
    {       
        if (words == null)
            words = new LinkedList();
        
        words.add(word);        
    }
    public  LinkedList<Palabra> getWordsList()
    {
        return words;
    }
}
