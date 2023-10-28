import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {

        //Versiyon 1 icin kodlar.

        int x=1;
        int y=2;


        System.out.println(x+y);
        System.out.println("Versiyon 1 tamamlandi.");

        //Versiyon 2 icin kodlar.

        int z = 5;
        System.out.println(x+y+z);
        System.out.println("Versiyon 2 tamamlandi.");

        //Versiyon 3 icin kodlar.

        System.out.println("Versiyon 3 kodlari.");

        //Versiyon 4 icin kodlar
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz.");
        String adKismi= newScanner.nextLine();

        System.out.println("Adınız :"+ adKismi);
        System.out.println("Lütfen Soyadınızı Giriniz. ");
        String soyAd= newScanner.next();
        System.out.println("Soyadınız :"+ soyAd);
        System.out.println(adKismi + " " + soyAd);
        System.out.println("Başarılı :) Yönlendiriliyorsunuz.....");
        System.out.println( "Eğer otomatik olarak yönlendirme olmadıysa tıklayınız.");

        String hedefurlSite = "https://lms.techproeducation.com/";
        System.out.println(hedefurlSite);









    }

}
