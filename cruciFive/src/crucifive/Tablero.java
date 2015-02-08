/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucifive;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author fernando
 */
public class  Tablero{
    public static int x;     //numero de palabras horizontales
    public static int y;    //numero de palabras verticales
    private static int tipo;
    private float score;
    private float time;
    private LinkedList<PalabraT> palabras;
    private LinkedList<Palabra> palabras1;
    private static Diccionario dictionary;
    private static String GameType;
    private static char matrizSolucion[][];
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

    
    public void AutoGenCascada(int h, int v)
    {
        Palabra p1, p2;
        String s;
        boolean d, b;
        int posx, posy, num, cont;
        Random r = new Random();
        PalabraT pt1, pt2;
        char c;
        if (palabras.isEmpty())
        {
            matrizSolucion = new char[14][14];
            for(int i = 0; i<14; i++)
            {
                for(int j = 0; j<14; j++)
                {
                    matrizSolucion[i][j]='0';
                }
            }
            palabras = new LinkedList(); 
            p1=dictionary.GetWord();
            while(palabras1.contains(p1))
            {
                p1=dictionary.GetWord();
            }
            d = r.nextBoolean();
            if(d)
            {
                posx = r.nextInt(14);
                posy = r.nextInt(15 - p1.wordLong);
            }
            
            else
            {
                posx = r.nextInt(14);
                posy = r.nextInt(15 - p1.wordLong);
            }
            

            pt1 = new PalabraT(d,p1,posx,posy);
            ponerpalabraenmatriz(pt1);
            
            
        }
        
        
        while(x<h || y<v)
        {
            num=r.nextInt(palabras.size());
            pt1=palabras.get(num);
            p1=pt1.getWord();
            num=r.nextInt(p1.wordLong);
            c=p1.word.charAt(num);
            if(pt1.isOrientacion())
            {
                d=false;
                posx=pt1.getPosicioni()[0];
                posy=pt1.getPosicioni()[1];
                if((matrizSolucion[posx+1][posy+num]=='0'|| matrizSolucion[posx+2][posy+num]=='0')&&(posx==0))
                {
                    b=true;
                    cont=0;
                    while(b)
                    {
                        p2=dictionary.GetWord();
                        while(palabras1.contains(p2))
                        {
                            p2=dictionary.GetWord();
                        }
                        if((p2.word.charAt(0)==c))
                        {
                            pt2 = new PalabraT(d,p2,posx,posy);
                            if(comprobarpalabra(pt2))
                            {
                                ponerpalabraenmatriz(pt2);
                                b=false;
                            }
                        }
                        else
                        {
                            cont++;
                        }
                        if (cont>15)
                            b=false;
                    }
                }
                else if(posx>0 && posx<12)
                {
                    if(((matrizSolucion[posx+2][posy+num]=='0')||(matrizSolucion[posx+1][posy+num]=='0'))&&(matrizSolucion[posx-1][posy+num]=='0'))
                    {
                        b=true;
                        cont=0;
                        while(b)
                        {
                            p2=dictionary.GetWord();
                            while(palabras1.contains(p2))
                            {
                                p2=dictionary.GetWord();
                            }
                            if(p2.word.contains(""+c))
                            {
                                if(posx-p2.word.indexOf(c)>=0)
                                {
                                    posx=posx-p2.word.indexOf(c);
                                    pt2 = new PalabraT(d,p2,posx,posy);
                                    if(comprobarpalabra(pt2))
                                    {
                                        ponerpalabraenmatriz(pt2);
                                        b=false;
                                    }
                                    else
                                        cont++;
                                    
                                }
                                else 
                                    cont++;
                            }
                            if (cont>25)
                                b=false;
                        }
                    }
                }
                else if(posx>1 && posx<13)
                {
                    if(((matrizSolucion[posx-2][posy+num]=='0')||(matrizSolucion[posx-1][posy+num]=='0'))&&(matrizSolucion[posx+1][posy+num]=='0'))
                    {
                        b=true;
                        cont=0;
                        while(b)
                        {
                            p2=dictionary.GetWord();
                            while(palabras1.contains(p2))
                            {
                                p2=dictionary.GetWord();
                            }
                            if(p2.word.contains(""+c))
                            {
                                if(posx-p2.word.indexOf(c)>=0)
                                {
                                    posx=posx-p2.word.indexOf(c);
                                    pt2 = new PalabraT(d,p2,posx,posy);
                                    if(comprobarpalabra(pt2))
                                    {
                                        ponerpalabraenmatriz(pt2);
                                        b=false;
                                    }
                                    else
                                        cont++;

                                }
                                else 
                                    cont++;
                            }
                            if (cont>25)
                                b=false;
                        }
                    }
                }
                else if(posx==13  && (matrizSolucion[posx-1][posy+num]=='0'|| matrizSolucion[posx-2][posy+num]=='0'))
                {
                    b=true;
                    cont=0;
                    while(b)
                    {
                        p2=dictionary.GetWord();
                        while(palabras1.contains(p2))
                        {
                            p2=dictionary.GetWord();
                        }
                        if((p2.word.charAt(p2.wordLong-1)==c))
                        {
                            posx=posx-p2.wordLong+1;
                            pt2 = new PalabraT(d,p2,posx,posy);
                            if(comprobarpalabra(pt2))
                            {
                                ponerpalabraenmatriz(pt2);
                                b=false;
                            }
                        }
                        else
                        {
                            cont++;
                        }
                        if (cont>15)
                            b=false;
                    }
                }
                
            }
            else
            {
                d=true;
                posx=pt1.getPosicioni()[0];
                posy=pt1.getPosicioni()[1];
                if((matrizSolucion[posx+num][posy+1]=='0'|| matrizSolucion[posx+num][posy+2]=='0')&&(posy==0))
                {
                    b=true;
                    cont=0;
                    while(b)
                    {
                        p2=dictionary.GetWord();
                        while(palabras1.contains(p2))
                        {
                            p2=dictionary.GetWord();
                        }
                        if((p2.word.charAt(0)==c))
                        {
                            pt2 = new PalabraT(d,p2,posx,posy);
                            if(comprobarpalabra(pt2))
                            {
                                ponerpalabraenmatriz(pt2);
                                b=false;
                            }
                        }
                        else
                        {
                            cont++;
                        }
                        if (cont>15)
                            b=false;
                    }
                }
                else if(posy>0 && posy<12)
                {
                    if(((matrizSolucion[posx+num][posy+2]=='0')||(matrizSolucion[posx+num][posy+1]=='0'))&&(matrizSolucion[posx+num][posy-1]=='0'))
                    {
                        b=true;
                        cont=0;
                        while(b)
                        {
                            p2=dictionary.GetWord();
                            while(palabras1.contains(p2))
                            {
                                p2=dictionary.GetWord();
                            }
                            if(p2.word.contains(""+c))
                            {
                                if(posy-p2.word.indexOf(c)>=0)
                                {
                                    posy=posy-p2.word.indexOf(c);
                                    pt2 = new PalabraT(d,p2,posx,posy);
                                    if(comprobarpalabra(pt2))
                                    {
                                        ponerpalabraenmatriz(pt2);
                                        b=false;
                                    }
                                    else
                                        cont++;
                                    
                                }
                                else 
                                    cont++;
                            }
                            if (cont>25)
                                b=false;
                        }
                    }
                }
                else if(posy>1 && posy<13)
                {
                    if(((matrizSolucion[posx+num][posy-2]=='0')||(matrizSolucion[posx+num][posy-1]=='0'))&&(matrizSolucion[posx+num][posy+1]=='0'))
                    {
                        b=true;
                        cont=0;
                        while(b)
                        {
                            p2=dictionary.GetWord();
                            while(palabras1.contains(p2))
                            {
                                p2=dictionary.GetWord();
                            }
                            if(p2.word.contains(""+c))
                            {
                                if(posy-p2.word.indexOf(c)>=0)
                                {
                                    posy=posy-p2.word.indexOf(c);
                                    pt2 = new PalabraT(d,p2,posx,posy);
                                    if(comprobarpalabra(pt2))
                                    {
                                        ponerpalabraenmatriz(pt2);
                                        b=false;
                                    }
                                    else
                                        cont++;

                                }
                                else 
                                    cont++;
                            }
                            if (cont>25)
                                b=false;
                        }
                    }
                }
                else if(posy==13  && (matrizSolucion[posx+num][posy-1]=='0'|| matrizSolucion[posx+num][posy-2]=='0'))
                {
                    b=true;
                    cont=0;
                    while(b)
                    {
                        p2=dictionary.GetWord();
                        while(palabras1.contains(p2))
                        {
                            p2=dictionary.GetWord();
                        }
                        if((p2.word.charAt(p2.wordLong-1)==c))
                        {
                            posy=posy-p2.wordLong+1;
                            pt2 = new PalabraT(d,p2,posx,posy);
                            if(comprobarpalabra(pt2))
                            {
                                ponerpalabraenmatriz(pt2);
                                b=false;
                            }
                        }
                        else
                        {
                            cont++;
                        }
                        if (cont>15)
                            b=false;
                    }
                }
                
            }
            
            
        }
        
    }
    
    public void ponerpalabraenmatriz(PalabraT pt)
    {
        char c;
        palabras.add(pt);
        palabras1.add(pt.getWord());
        if(pt.isOrientacion())    //
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                c=pt.getWord().getWord().charAt(i);
                matrizSolucion[pt.getPosicioni()[0]][pt.getPosicioni()[1]+i]=c;
            }
            x++;
        }
        else
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                c=pt.getWord().getWord().charAt(i);
                matrizSolucion[pt.getPosicioni()[0]+i][pt.getPosicioni()[1]]=c;
            }
            y++;
        }
    }
    
    public boolean comprobarpalabra(PalabraT pt)
    {
        char c, a;
        if(pt.isOrientacion())
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                if(pt.getPosicioni()[1]+i >= 14)
                    return false;
                
                c=pt.getWord().getWord().charAt(i);
                a=matrizSolucion[pt.getPosicioni()[0]][pt.getPosicioni()[1]+i];
                if((a!=c) && (a!='0'))
                {
                    return false;
                }
            }
        }
        else
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                if(pt.getPosicioni()[0]+i >= 14)
                    return false;
                
                c=pt.getWord().getWord().charAt(i);
                a=matrizSolucion[pt.getPosicioni()[0]=i][pt.getPosicioni()[1]];
                if((a!=c) && (a!='0'))
                {
                    return false;
                }
            }
        }
        return true;
    }
            
            
}
