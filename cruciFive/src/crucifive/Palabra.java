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
    
    private String Word = new String();
    private String Pista = new String();
    private int WordLong;
    
    public Palabra()
    {
        Word = "";
        Pista = "";
        WordLong = 0;
    }

    public Palabra(int WordLong, String Word, String Pista) {
        this.WordLong = WordLong;
        this.Pista = Pista;
        this.Word = Word;
    }
    
    public int GetLong()
    {
        return WordLong;
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
