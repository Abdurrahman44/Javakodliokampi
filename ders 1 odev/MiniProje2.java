import java.util.Scanner;
import java.util.*;
public class MiniProje2 {
    
    
    
    
    
    
    public static void main(String[] args) {
        char harf='Ö';
       // System.out.println(harf);
        switch(harf){
            case'A':
            case'O':
            case'U':
            case'I':
            System.out.println( harf+" bu bir kalın sesli ünlüdür");            
             break;
            case 'Ö':
            case 'İ'://defualt olarakta yapabilirdim farklı olsun diye böyle yaptım.
            case 'E':
            case 'Ü':
            System.out.println( harf+" bu bir ince  sesli ünlüdür");            
            break;
        }
      





    }
    
}
