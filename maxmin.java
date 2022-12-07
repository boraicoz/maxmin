import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int min=0,max=0,number;
        System.out.print("N sayisi Giriniz:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+".Sayi Giriniz:");
            number=in.nextInt();
            if(i==1) {
                max = number;
                min = number;
            }else
            {
                 if(number>max)
                 {
                     max=number;
                 }
                 if(min>number)
                   min=number;

            }

        }
        System.out.println("En Buyuk:"+max+"\tEn Kucuk:"+min);
    }



}

