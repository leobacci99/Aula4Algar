package aula4algoritimos;

import java.util.Scanner;

public class Aula4Algoritimos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       char grade = 'A';
       
       switch (grade) {
           case 'A':
               System.out.println("Exelente");
               break;
           case 'B':   
           case 'C':    
               System.out.println("Bem feito!");
               break;
           case 'D':    
               System.out.println("Você passou!");
               break;
           case 'E':
               System.out.println("Conceito invalido!");
               break;
       } 
        
        
    }
    
}
