
import java.util.Scanner;
import java.util.*;
//Asal sayıların Hesaplanması
public class MiniProje1 {
/**
 * @param args
 */

    
/**
 * @param args
 */
public static void main(String[] args) {
Scanner girdi = new Scanner(System.in);
System.out.println("Lütfen bir sayı giriniz ");
int input = girdi.nextInt();


if (input <= 1){//bir ve birden küçük değerlerin girmesini engeller dergerleri 

System.out.println(" Lütfen 1 den büyük değerleri giriniz.Çünkü asal sayılar 1 den sonra başlar . ");


}
else {

if(input% 2==0 && input!=2 )//2 olma durumu kontrol edilir ve İfin içine sokulur. 
{
System.out.println(input+"sayısı asal değildir ");
}else
{
    System.out.println(input+" sayısı asal sayıdır ");
}

}








}






}

