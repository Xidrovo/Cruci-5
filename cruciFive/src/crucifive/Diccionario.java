/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class Diccionario {
    //Aquí un pequeño cambio, en el escrito habíamos puesto un "Array" de clase "Palabra"
    //Ahora hay una lista vinculada que guarda palabras.
    
    private LinkedList<Palabra> words;
    private String name;
    
    public void AddWord(Palabra Word)
    {
        words.add(Word);
    }
    
    public void ViewDictionariesList()
    {
        //This Method will show to the user all the Dictionaries.
    }
    
    public void ViewDictionary(String DictionaryName)
    {
        //This Method will show all the word of an Specific Dictionary.
    }
    
    public Palabra GetWord()    //me devuelve una palabra aleatoria del diccionario
    {
        Iterator <Palabra> i  = words.iterator();
        int c=0, d;
        Random rnd = new Random();
        
        while(i.hasNext())
        {
            i.next();
            c++;
        }
        d=rnd.nextInt(c);
        
        return words.get(d);
    }
}
