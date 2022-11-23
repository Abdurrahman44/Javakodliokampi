
public class MiniProje5 {

    public static void main(String[] args) {
int []arr=new int[] {2,5,8,9,6,76,14,54794,98,29,};     
    int aransayı=12;
boolean a=true;
    for (int i =0;i<arr.length;i++)    
{
 if(aransayı==arr[i]){
 
    System.out.println(arr[i]+" Aranan sayı bulundu");
   a=false; 
}
}
if(a)
System.out.println("Aranan sayı bulunamadı");
}

}
