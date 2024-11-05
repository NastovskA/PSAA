package java_auditoriski;

import java.util.Queue;
import java.util.LinkedList;


public class cas_redovi {
    public static void main(String [] args){
        Queue<Integer> queue = new LinkedList();
        
        for(int i = 0; i < 5; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + ", ");
            queue.remove();  //enque de    //deque=remove
    }
    
  }
}
