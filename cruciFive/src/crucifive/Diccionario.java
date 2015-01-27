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
    
    private LinkedList<Palabra> words;
    private String name;
    
    public void AddWord(Palabra Word)
    {
        //This Method will add a word on the Dictionary.
    }
    
    public void ViewDictionariesList()
    {
        //This Method will show to the user all the Dictionaries.
    }
    
    public void ViewDictionary(String DictionaryName)
    {
        //This Method will show all the word of an Specific Dictionary.
    }
    
    public String GetWord()
    {
        //This Method will return a word of the Dictionary's words.
        return "Hello Word";
    }
}
