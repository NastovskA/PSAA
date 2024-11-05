package java_auditoriski;  //minimalen broj na paricki za da se odredi suma koja ja vnesuvame od tastatura 50,20,10,2,1 denari


public class cas_vtornik_paricki {
    public static void main(String [] args){
        System.out.println(min_pari(17));    
    }

    private static int min_pari(int suma) {
       int min = Integer.MAX_VALUE;
        int p1,p2,p3,p4,p5; //iteratori za ciklusi
        int pom , broj;
        
        for(p1=0; p1<= (suma/50); p1++){
            for(p2=0; p2<= (suma/20); p2++){
                for(p3=0; p3<= (suma/10); p3++){
                    for(p4=0; p4<=(suma/2); p4++){
                        for(p5=0; p5<=suma; p5++){
                            pom = p1 * 50 + p2 * 20 + p3 * 10 + p4 * 2+ p5;
                            if(pom == suma){
                                broj = p1+ p2+ p3 + p4 + p5;
                                if(broj < min){
                                    min = broj;
                                }
                            }
                        }
                    }
                }
            }
        }
        return min;
    }   
}
