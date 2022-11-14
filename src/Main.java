import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner select = new Scanner(System.in);
        int n1 ,n2;
        int islem ;
        double sonuc;

        System.out.print("1.Sayiyi giriniz : ");
        n1 = select.nextInt();
        System.out.print("2. Sayiyi giriniz : ");
        n2 = select.nextInt();
        System.out.print("*** \n1 - Toplama \n2 - Cikarma \n3 - Carpma \n4 - Bolme \n***\n" );
        System.out.print("Yapilacak islemi seciniz :");
        islem = select.nextInt();

        switch (islem){
            case 1:
                sonuc = n1+n2;
                System.out.println("Sonuc : "+sonuc);
                break;
            case 2:
                sonuc = n1-n2;
                System.out.println("Sonuc : "+sonuc);
                break;
            case 3:
                sonuc = n1*n2;
                System.out.print("Sonuc : "+sonuc);
                break;
            case 4:
                if (n2 != 0){
                    sonuc = n1/n2;
                    System.out.print("Sonuc : "+sonuc);
                    break;
                }else {
                    System.out.print("Bir sayi 0'a Bolunemez...");
                    break;
                }

            default:
                System.out.print("Error !!!!");
        }



    }
}