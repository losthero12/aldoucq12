
package minutos;

import java.util.Scanner;





public class Minutos {

    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        int num,min,hor,dia,año; 
        System.out.println( "Ingrese los años");
        num=sc.nextInt();
        min=60;
        hor=24;
        año=365;
        año=(min*hor*año*num);
        System.out.println(año+"min "); 
        
        
    }
    
}
