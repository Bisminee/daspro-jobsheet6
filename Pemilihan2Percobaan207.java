import java.util.Scanner;
public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);

        String member;
        int menu, harga;
        double diskon, bayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");

        menu = sc07.nextInt();
        sc07.nextLine();

        System.out.print("Apakah anda memiliki member (y/n) ? = ");
        member = sc07.nextLine();

        System.out.println("--------------------------------------");

        if(member.equalsIgnoreCase("y")){
            diskon = 0.1;
            System.out.println("Besar Diskon = 10%");
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl " + harga);
            }else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea " + harga);
            }else if(menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling " + harga);
            }else{
                System.out.println("Masukkan menu yang tersedia ");
                return;
            }

            bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah dison = " + bayar);
        }else if(member.equalsIgnoreCase("n")){
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl " + harga);
            }else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea " + harga);
            }else if(menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling " + harga);
            }else{
                System.out.println("Masukkan menu yang tersedia ");
                return;
            }
            bayar = harga;
            System.out.println("Total bayar setelah dison = " + bayar);
        }else{
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}
