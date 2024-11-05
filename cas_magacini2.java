package java_auditoriski; //ja zamenuva sekoja sekvenca od duplikati so par vrednosti, so upotreba samo na edna dopolnitelna struktura so redica ili magacin

import java.util.Stack;
public class cas_magacini2 {
    
    public static void main(String [] args){
        
        Stack<Integer> s=new Stack<Integer>();  // 1, 2, 2, 3, 3, 3, 4 , 4 ,
        
        for (int i=0; i< 4; i++){
            for(int j=0; j< i+1; j++){
                s.add(i);
                System.out.print(i + ", ");
            } // so ova se dodava dvojkata dva pati trojkata tri pati .., mooze i so push
        }
        
        System.out.println();
        
        compress(s);
        
        while (!s.isEmpty()){
            System.out.print(s.pop() + ", ");
        }
    }
    

    private static void compress(Stack<Integer> s) {
        
        int el_val, el_peek, el_count; //momentalen element, element posle nego, brojac 
        //counterot ne go postavuvame na nula bidejki toj mora da pocne od nula samiot
        Stack<Integer> sr = new Stack<Integer>();
        
        
        while(!s.isEmpty()) {
         el_val = s.peek();
         el_count = 0;
         
         while(!s.isEmpty() && el_val == s.peek()) {  // end koga ke bidat izminati site elementi ili koga ke mi bide prazen
             s.pop();
             el_count++;
         }
         
         sr.push(el_val);
         sr.push(el_count);
        }
        
        while( !sr.isEmpty()) {
            s.push(sr.pop());
        }
    }
    
}
