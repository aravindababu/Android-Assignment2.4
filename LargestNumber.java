/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

/**
 *
 * @author user2
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialization of the integers
        
        int a=12,b=15,c=10;
        
        if(a>b){
           //Only if a>b it will check the following if-else conditions and find out the largest number
           //if(a>b) is not true it will not check the following conditions.
           
            if(a>c)
                System.out.print("Largest number "+a);
            else
                System.out.println("Largest number "+c);
        }
        //When the above condition (a>b) is not true the following if-else conditions will be checked
        //to find out the largest number among the three
        else
        {
            if(b>c)
                      System.out.print("Largest number "+b);
            else
                System.out.println("Largest number "+c);
                
        }
    }
    
}
