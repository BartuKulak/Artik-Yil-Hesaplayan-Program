import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz: ");
        yil= input.nextInt();
        if(yil%100==0)
        {
            if(yil%400==0)
                System.out.println(yil+" Bir Artık Yıldır");
            else
                System.out.println(yil+" Bir Artık Yıl Değildir");
        }
        else
        {
            if (yil%4== 0)
                System.out.println(yil + " Bir Artık Yıldır");
            else
                System.out.println(yil + " Bir Artık Yıl Değildir");
        }
    }
}