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
    public static int h;      //max h
    public static int v;    //max v
    private static int tipo;
    private float score;
    private float time;
    private static LinkedList<PalabraT> palabras;
    private static LinkedList<Palabra> palabras1;
    private static Diccionario dictionary;
    private static String GameType;
    public static char matrizSolucion[][];
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

    
    public void AutoGenCascada()
    {
        Palabra p1, p2;
        String s;
        boolean d, b;
        int posx, posy, num, cont, cont1;
        Random r = new Random();
        PalabraT pt1, pt2;
        char c;
        if (palabras.isEmpty()||palabras==null)
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
                posx = 7;
                posy = 1;
            }
            
            else
            {
                posx = 1;
                posy = 7;
            }
            

            pt1 = new PalabraT(d,p1,posx,posy);
            ponerpalabraenmatriz(pt1);
            
            
        }
        
        cont1=0;
        while((x<h || y<v) && palabras.size()<14)
        {
            num=r.nextInt(palabras.size());
            pt1=palabras.get(num);
            p1=pt1.getWord();
            num=r.nextInt(p1.wordLong);
            c=p1.word.charAt(num);
            if(pt1.isOrientacion()&& x<h)
            {
                d=false;
                posx=pt1.getPosicioni()[0];
                posy=pt1.getPosicioni()[1];
                if(posx==0)
                {
                if((matrizSolucion[posx+1][posy+num]=='0'|| matrizSolucion[posx+2][posy+num]=='0'))
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
                            pt2 = new PalabraT(d,p2,posx,posy+num);
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
                                    pt2 = new PalabraT(d,p2,posx,posy+num);
                                    if(comprobarpalabra(pt2))
                                    {
                                        ponerpalabraenmatriz(pt2);
                                        b=false;
                                    }
                                    else
                                        cont++;
                                    
                                }
                            }
                            else 
                                cont++;
                            
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
                                    pt2 = new PalabraT(d,p2,posx,posy+num);
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
                            pt2 = new PalabraT(d,p2,posx,posy+num);
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
            else if (!pt1.isOrientacion()&& y<v)
            {
                d=true;
                posx=pt1.getPosicioni()[0];
                posy=pt1.getPosicioni()[1];
                if(posy==0)
                {
                if((matrizSolucion[posx+num][posy+1]=='0'|| matrizSolucion[posx+num][posy+2]=='0'))
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
                            pt2 = new PalabraT(d,p2,posx+num,posy);
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
                                    pt2 = new PalabraT(d,p2,posx+num,posy);
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
                            else
                                cont++;
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
                                    pt2 = new PalabraT(d,p2,posx+num,posy);
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
                            pt2 = new PalabraT(d,p2,posx+num,posy);
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
            
        //cont1++;
        //System.out.println("intento");
        
        }
        
        if(x==h && y==v)
        {
            System.out.println("YAAAA");
        }
        if (palabras.size()==11)
        {
            System.out.println("YA");
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
            x=x+1;
        }
        else
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                c=pt.getWord().getWord().charAt(i);
                matrizSolucion[pt.getPosicioni()[0]+i][pt.getPosicioni()[1]]=c;
            }
            y=y+1;
        }
    }
    
    public boolean comprobarpalabra(PalabraT pt)
    {
        char c, a;
        if (x>=h && pt.isOrientacion())
        {
            return false;
        }
        else if(y>=v && !pt.isOrientacion())
        {
            return false;
        }
        if(pt.isOrientacion())
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                if(pt.getPosicioni()[1]+i >= 13)
                {
                    System.out.println("Palabra no valida");
                    return false;
                }
                
                c=pt.getWord().word.charAt(i);
                a=matrizSolucion[pt.getPosicioni()[0]][pt.getPosicioni()[1]+i];
                if((a!=c) && (a!='0'))
                {
                    System.out.println("Palabra no valida");
                    return false;
                }
            }
        }
        else
        {
            for (int i=0; i<pt.getWord().wordLong; i++)
            {
                if(pt.getPosicioni()[0]+i >= 13)
                {
                    System.out.println("Palabra no valida");
                    return false;
                }
                
                c=pt.getWord().word.charAt(i);
                a=matrizSolucion[pt.getPosicioni()[0]+i][pt.getPosicioni()[1]];
                if((a!=c) && (a!='0'))
                {
                    System.out.println("Palabra no valida");
                    return false;
                }
            }
        }
        System.out.println("Palabra valida"+pt.getWord().word);
        return true;
    }
    
    //public void 

    public void setPalabras(LinkedList<PalabraT> palabras) {
        Tablero.palabras = palabras;
    }

    public void setPalabras1(LinkedList<Palabra> palabras1) {
        Tablero.palabras1 = palabras1;
    }
    
            
            
}

