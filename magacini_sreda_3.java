package java_auditoriski; //primer od tetratka vo kod

import java.util.Scanner;
import java.util.Stack;
public class magacini_sreda_3 {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vnesete postfix izra:");
        String s = input.nextLine();
        
        System.out.println(s + " = " + evaluatePostfix(s));
        
    }

    private static int evaluatePostfix(String s) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);  // ne interesira dali e brojka ili string
            
            if (c == ' '){
                continue;
            } else if (Character.isDigit(c)) { // dali c e cifra
                int n = 0;
                
                while(Character.isDigit(c)){  //proveruvam dali e dvocifren brojot
                    n = n*10 + (int)(c - '0');  // so '0' se vrakame na poslednata cifra kade sto sme zastanale za da ne go preskokne nekoj znam dokolku ima broj prazno mesto pa znak 
                    i++;
                    c = s.charAt(i);
                }
                
                i--;  // se vrakame na karakter koj moze da go ispersirame
                
                stack.push(n);
            }else {  //za validen operator
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch(c){ //razgleduvanje na site scenarija  - kalkulator
                    
                    case '+':
                        stack.push(val1 + val2);
                        break;
                        
                    case '-':
                        stack.push(val2 - val1);
                        break;
                        
                        
                    case '*':
                        stack.push(val1 * val2);
                        break;
                        
                        
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
            
        }
        
        return stack.pop();
    }
    
}
