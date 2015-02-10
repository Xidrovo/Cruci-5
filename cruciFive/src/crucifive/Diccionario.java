/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

import java.util.HashMap;
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
    
    private static LinkedList<Palabra> words;
    private static String name;
    private static HashMap <String,String> MapaDic;
    
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
    
    public void putMapa (String Palabra, String Pista){
        if (MapaDic == null)
            MapaDic = new HashMap();
        
       MapaDic.put(Palabra,Pista);
    }
    
    public String getPista (String Palabra)
    {
        return MapaDic.get(Palabra);
    }
}
