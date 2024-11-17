package lab_8;

import java.util.*;

class spisanie {

    int sirina;
    int visocina;

    public spisanie(int s, int v) {
        this.sirina = s;
        this.visocina = v;
    }
    public String toString(){
        return "Sirina: " + sirina + ", Visina: "+ visocina; 
    }
}


public class LAB_8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        spisanie s1 = new spisanie(20, 30);
        spisanie s2 = new spisanie(10, 3);
        spisanie s3 = new spisanie(8, 7);
        spisanie s4 = new spisanie(7, 25);
        spisanie s5 = new spisanie(10, 22);
        spisanie s6 = new spisanie(13, 14);
        spisanie s7 = new spisanie(6, 8);
        spisanie s8 = new spisanie(2, 7);
        
        

       spisanie [] spisania= {s1, s2, s3, s4, s5, s6, s7, s8};
       System.out.println("Dadeni spisanija so nivni dimenzii: ");
       for(spisanie s: spisania){
           System.out.println(s);
       }
       
       System.out.println("Dolzina na polici: ");
       int dolzina = scanner.nextInt();
      
       System.out.println("Minimalna visina na polici: " + funkcija(spisania, dolzina));
    }
    
    
    public static int funkcija (spisanie [] spisania, int dolzina){
        
        for (int i = 0; i < spisania.length - 1; i++) {
        for (int j = 0; j < spisania.length - i - 1; j++) {
            if (spisania[j].visocina < spisania[j + 1].visocina) { 
             
                spisanie temp = spisania[j];
                spisania[j] = spisania[j + 1];
                spisania[j + 1] = temp;
            }
        }
    }
        int md=0;
        int mv=0;
        int vkupna_visina = 0;
        
        for(spisanie s : spisania){ // za sekoe s vo nizata spisanija se izvrsuva
            if( md + s.sirina > dolzina){
                vkupna_visina += mv;
                md=0;
                mv=0;
            }
            md += s.sirina;
            mv = Math.max(mv, s.visocina);
        }
        vkupna_visina += mv;
        return vkupna_visina;
    }        
            
}
