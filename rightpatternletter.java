/*  A B C D E F 
    B C D E F
    C D E F
    D E F
    E F
    F       */
import java.util.*;
public class rightpatternletter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }System.out.println();
        }
    }
}