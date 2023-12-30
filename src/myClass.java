import java.util.*;
public class myClass{
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter integer");
        int n=s.nextInt();
       // int a = s.nextInt();
        for(int i=1;i<=10;i++)
        {
        int	a=i*n;
            System.out.println(n+"*"+i+"="+a );  
        }
       // s.close();
    }
}