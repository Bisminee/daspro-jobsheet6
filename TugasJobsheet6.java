import java.util.Scanner;

public class TugasJobsheet6 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        
        String day, buku;
        double diskon = 0, bayar;
        int jmlBuku, harga = 20000;

        System.out.print("Masukkan jenis buku: ");
        buku = sc07.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jmlBuku = sc07.nextInt();
        sc07.nextLine();

        if(buku.equalsIgnoreCase("kamus")){
            if(jmlBuku > 2){
                diskon = 0.12 * harga * jmlBuku;
            }else if(jmlBuku <= 2 && jmlBuku > 0 ){
                diskon = 0.1 * harga * jmlBuku;
            }else{
                System.out.println("\nJUMLAH BUKU HARUS POSITIF!!!");
            }
        }else if(buku.equalsIgnoreCase("novel")){
            if(jmlBuku > 3){
                diskon = 0.09 * harga * jmlBuku;
            }else if(jmlBuku <= 3 && !(jmlBuku < 0)){
                diskon = 0.08 * harga * jmlBuku;
            }else {
                System.out.println("\nJUMLAH BUKU HARUS POSITIF!!!");
            }
        }else if(jmlBuku > 3){
            diskon = 0.05 * harga * jmlBuku; 
        }else if (jmlBuku <= 3 && jmlBuku > 0){
            diskon = 0;
        }else{
            System.out.println("\nJUMLAH BUKU HARUS POSITIF!!!");
        }

        bayar = harga * jmlBuku - diskon;

        System.out.println("Jumlah diskon diterima Rp " + diskon + "\n" + "Maka anda hanya membayar Rp " + bayar );
    }
    
}
