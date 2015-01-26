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
    
    private String word = new String();
    private String pista = new String();
    private int wordLong;
    
    public Palabra()
    {
        word = "";
        pista = "";
        wordLong = 0;
    }

    public Palabra(int WordLong, String Word, String Pista) {
        this.wordLong = WordLong;
        this.pista = Pista;
        this.word = Word;
    }
    
    public int GetLong()
    {
        return wordLong;
    }
    
    public void SetWord(String Word)
    {
        //This Method will set a word.
    }
     
    public void SetPista(String Pista)
    {
        //this Method will set a Pista and attach it to the word.
    }
   
}
