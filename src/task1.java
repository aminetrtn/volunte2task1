import java.util.Scanner;

public class task1 {
    int number,i;
    String s="";
    Scanner sc = new Scanner(System.in);
void plusormines(){
    System.out.println("enter number");
    number= sc.nextInt();
    for ( i = 0; i<number;i++ )
    {
        if(i % 2 == 0)
        {
        s=s + "+";}
        else
        {
            s=s + "-";
        }

    }
    System.out.println(s);
}


}
