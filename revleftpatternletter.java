/* E
   E D
   E D C
   E D C B
   E D C B A  */
import java.util.*;
public class revleftpatternletter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print((char)(j+64)+" ");
            }System.out.println();
        }
    }
}