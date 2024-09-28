package MatematikaDasar;
import java.util.Scanner;

public class LatihanSoalMTK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Grade = 0;
        int passingGrade = 3;

        System.out.println("- LATIHAN SOAL MATEMATIKA DASAR -");

        System.out.print("Berapa hasil dari 5 x 5? ");
        int soalSatu = sc.nextInt();

        if (soalSatu == 25) {
            Grade++;
        }

        System.out.print("Berapa hasil dari 10 x 5? ");
        int soalDua = sc.nextInt();

        if (soalDua == 50) {
            Grade++;
        }

        System.out.print("Berapa hasil dari 1000 + 500? ");
        int soalTiga = sc.nextInt();

        if (soalTiga == 1500) {
            Grade++;
        }

        System.out.print("Berapa hasil dari 70 / 10? ");
        int soalEmpat = sc.nextInt();

        if (soalEmpat == 7) {
            Grade++;
        }

        System.out.print("Berapa hasil dari 50 / 25? ");
        int soalLima = sc.nextInt();

        if (soalLima == 2) {
            Grade++;
        }

        System.out.println("Total nilai mu: " + Grade);

        if (Grade >= passingGrade) {
            System.out.println("Selamat, anda lolos!");
        } else {
            System.out.println("Maaf, anda gagal!");
        }

        sc.close();
    }
}