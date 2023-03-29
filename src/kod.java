import java.util.Scanner;

public class kod {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password = inp.nextLine();
        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız.");

        } else {
            int try1;
            System.out.println("Hatalı Giriş Yaptınız.");
            System.out.println("1-Şifremi Sıfırlamak İstiyorum\n2-Şifremi Sıfırlamak İstemiyorum  ");
            try1 = inp.nextInt();
            switch (try1) {
                case 1:
                    String password1;
                    Scanner iny = new Scanner(System.in);
                    System.out.println("Yeni Şifrenizi Girin");
                    password1 = iny.nextLine();

                    if (password1.equals("java123")) {
                        System.out.println("Yeni Şifre Eskisiyle Aynı Olamaz");

                    } else {
                        System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu");
                        break;
                    }

                case 2:
                    System.out.println("Üzgünüz.\n Sonra Görüşürüz");
                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız");
            }

        }
    }
}
