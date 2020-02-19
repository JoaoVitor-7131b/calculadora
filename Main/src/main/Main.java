
package main;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        String num1=
        JOptionPane.showInputDialog("digite um número:");
        int n1=Integer.parseInt(num1);
          
        String num2=
        JOptionPane.showInputDialog("digite um segundo número:");
        int n2=Integer.parseInt(num2);
       
        
        int result=0;
        int x=0;
        while(x==0){
            String op=
        JOptionPane.showInputDialog("De acordo com o número indique que operação deseja realizar:"+
                 "1-ADIÇÃO"
                + "2-SUBTRAÇÃO"
                + "3-MULTIPLICAÇÃO"
                + "4-DIVISÃO ");
            int operacao=Integer.parseInt(op);
        
        
        
        if(operacao==4){
            result=n1/n2;
            x=1;
        }
        else{
            if(operacao==3){
                result=n1*n2;
                x=1;
            }
            else{
                if(operacao==2){
                    result=n1-n2;
                    x=1;
                }
                else{
                   if(operacao==2){
                    result=n1+n2;
                    x=1;
                   }
                   else{
                       System.out.println("digite uma opção válida!!!!");
                   }
      
                }
            
            }
        
        }
        JOptionPane.showMessageDialog(null,"O resultado da operação referida é: "+ result,"/// operação com os dois números",JOptionPane.PLAIN_MESSAGE);
        }
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
           }
    
}
