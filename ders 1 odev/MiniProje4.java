public class MiniProje4 {
/**
 * @param args
 */
public static void main(String[] args) {
int a=220;
int b=285;
int topa=0;
int topb=0;
for(int i=1;i<a*b;i++)
{
if(a%i==0 && i!=a)  
topa=topa+i;
if(b%i==0 && i!=b)
topb=topb+i;
}
if(topa==b && topb==a)
{
    
System.out.println("Arkadaş sayıdır.");
}else{
    System.out.println("Arkadaş sayı değil");
}
}    
}




