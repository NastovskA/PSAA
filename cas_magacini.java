package java_auditoriski; //NAOGANJE NA MAKSIMALEN ELEMENT 2 nacini

import java.util.Stack;  //ova ke mi bide samo potrebno za zadaca so magacini

public class cas_magacini {

    public static void main(String[]args){
        Stack<Integer> s = new Stack<Integer>();   //genericka klasa
        
        for(int i = 0; i < 5; i++){
            s.push(i);
        }
        
      int m =  maxValueNoIssues(s);
      System.out.println(m);
      System.out.println(s.isEmpty());
    }
    
    public static int maxValueNoIssues(Stack<Integer> s){
        
        Stack<Integer> backup = new Stack<Integer>();
        
        int maxValue = s.pop();
        backup.push(maxValue);
        
        while(!s.isEmpty()) {   //se dodeka makgacinot ne e prazen
            int next =s.pop();
            backup.push(next);
            maxValue = Math.max(maxValue, next);
        }
        
        while(!backup.isEmpty()){
            s.push(backup.pop());
        }
        return maxValue;
    }

}
// redosledot zapazi go vo zavisnost od toa sto se raboti