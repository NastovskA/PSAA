package java_auditoriski;   // 10, 50, 19,  sredina   54, 30,67 = vleze            10,50,19,19,50,10,54,30,67,67,30,54 = izlez


import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class cas_redovi_ogledalo {
    public static void main(String [] args){
     
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for (int i=0; i< 6; i++){
            q.add(i);
        }
        
        Queue<Integer> q_r = mirrorQ(q);
        
        if(q_r.isEmpty()) {
            System.out.println("Ogledalniot red bil orazen, oa zatoa i rezultatot e vakov.");
        }else{
            while(!q_r.isEmpty()){
                System.out.println(q_r.remove() + ", ");
            }
        }
        
    }

    private static Queue<Integer> mirrorQ(Queue<Integer> q) {
        
        int queue_size = q.size();
        Queue<Integer> q_r = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        int re;
        if(q.isEmpty()) return q; //za koga ni e prazna vraka prazno
        
        if(queue_size % 2 == 1){
            throw new IllegalArgumentException("Dimenzijata na redicata ne moze da e neparen broj");
        }
        
        int j=0;
        int queue_half = queue_size / 2;
        
        while (j < queue_half) {
            re = q.remove();
            q_r.add(re);
            s.push(re);
            j++;
        }
        
        while(!s.isEmpty()) {
            q_r.add(s.pop());
        }
        
        j=0;
         
        while (j < queue_half) {
            re = q.remove();
            q_r.add(re);
            s.push(re);
            j++;
        }
        
        while(!s.isEmpty()) {
            q_r.add(s.pop());
        }
        
        return q_r;
    }
    
}
