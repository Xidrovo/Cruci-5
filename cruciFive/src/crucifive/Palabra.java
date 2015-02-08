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
public class Palabra {
    
    protected String word = new String();
    protected String pista = new String();
    protected int wordLong;
    
    public Palabra()
    {
        word = "";
        pista = "";
        wordLong = 0;
    }

    public Palabra(String Word, String Pista) {
        this.pista = Pista;
        this.word = Word;
        this.wordLong = Word.length();
    }
    
    public int GetLong()
    {
        return wordLong;
    }
    
    public String getWord()
    {
        return word;
    }
    
    public String getPista()
    {
        return pista;
    }

}
