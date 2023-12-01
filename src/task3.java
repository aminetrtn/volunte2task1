import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class task3 {
    int number,y;
    int array[]=new int[number];

    public boolean check (int x)
    {
        for (int i=0;i<=number;i++)
        {
            if (array[i]==x)
                return true;


        }
        return false;
    }
        public int sum ()
    {
        int n=0;
        for (int i=0;i<=number;i++)
        {n=+array[i];}
        return n;
    }


    Scanner sc = new Scanner(System.in);
    void arrayofzero(){
        System.out.println("enter number");
        number= sc.nextInt();
        if ((number<=100) && (number>=1))
        {
            int m;

           Random rand = new Random();
//            m=rand.nextInt(-number,number);


            while(!(sum()==0))
            {
                while( y<=number)
                {
                    m=rand.nextInt(-number,number);
                    if(check(m))
                    {
                        m=rand.nextInt(-number,number);
                    }
                   array[y]=m;
                    y++;
                }

            }

//            int arr[]=new int[number];
//
//
//            for (int i=0;i<number;i++)
//            {
//
//                m=rand.nextInt(number);
//                arr[i]=m;
//
//                for (int k=0;k<i;k++)
//                {
//
//                    if (arr[i]==arr[k])
//
//                    {
//
//                        arr[i]=m;
//
//                    }
//                    }
//            }


            System.out.println(Arrays.toString(array));
    }
else
{
    System.out.println("number not in range");
    arrayofzero();
}
    }
}
