import java.util.Scanner;
import java.util.*;

public class MiniProje3 
{
/**
 * @param args
 */
public static void main(String[] args) {
Scanner girdi=new Scanner(System.in);

int temp=0;
System.out.println("Lütfen sayıyı giriniz");
int a=girdi.nextInt();

for(int i =1;i<a;i++)
{
if(a%i==0)
{
temp=temp+i;
}
}
if(a==temp)
{
System.out.println(a+":Mükemmel sayıdır");
}
else if(temp!=a){
    System.out.println(a+": Sayısı değildir");
}










}    


}
