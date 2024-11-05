package java_auditoriski;


class Tochka{
    public double x;
    public double y;
    
    Tochka(double x, double y){
        this.x = x;
        this.y = y;
    }
}


public class cas_vtornik_boot {
    public static void main(String [] args){
        Tochka [] array  = new Tochka[10];
        
        for( int i=0; i< 10; i++){
            array[i] = new Tochka(Math.random() * 10, Math.random() * 20);
        }
        
        System.out.println(min_rast(array, 10));
    }

    private static double min_rast(Tochka[] array, int n) {
        int i, j;
        double pom;
        double min = Math.sqrt(Math.pow(array[0].x - array[1].x, 2) + Math.pow(array[0].y - array[1].y, 2)); // so 2 toa znaci deka e na kvadrat
        
        for(i = 0; i< n-1; i++){
            for(j= i+1; j< n; j++){
                pom =  Math.sqrt(Math.pow(array[i].x - array[j].x, 2) + Math.pow(array[i].y - array[j].y, 2)); //ne e biten redosledot na i, j vo ovoj slucaj, no moze da e bitno
        if(pom < min){
            min = pom;
            }
        }
    }
        
        
    
        
        return min;
    }
    
    
}
