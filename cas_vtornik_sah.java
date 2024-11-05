package java_auditoriski; // bez da se napagaat dve kralici,sahovska tabla



public class cas_vtornik_sah {
    public static void main(String [] args){
        System.out.println(count());
    }
    private static int count(){
        int x1, x2, y1, y2;
        int brojach = 0;
        
        for(x1 = 0; x1 < 8; x1++){
            for(y1 = 0; y1 < 8; y1++){
                for(x2 = 0; x2 <8; x2++){
                    for(y2 = 0; y2 < 8; y2++){
                        if(!seNapagjaat(x1, y1, x2, y2)){
                            brojach++;
                        }
                        
                    }
                }
            }
        }
        return brojach;
    }
    
    private static boolean seNapagjaat(int x1, int y1, int x2, int y2){
        return (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2) );
    }
}
