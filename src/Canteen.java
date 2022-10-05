import java.util.Scanner;

public class Canteen {

    public static void main(String[] args) {
        printKantinBanner();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input food choice no.: ");
        int noItem = sc.nextInt();
        System.out.print("Input amount: ");
        int itemAmount = sc.nextInt();

        Food chosenFood = null;

        switch (noItem) {
            case 1:
                chosenFood = donuts;
                break;
            case 2:
                chosenFood = crackers;
                break;
            case 3:
                chosenFood = macaroni;
                break;
            case 4:
                chosenFood = nasiPutih;
                break;
            case 5:
                chosenFood = nasiUduk;
                break;
            case 6:
                chosenFood = nasiGoreng;
                break;
            case 7:
                chosenFood = ketupatSayur;
                break;
        }

        int totalHarga = chosenFood.price * itemAmount;
        
        //discount
        float totalDisc = 0;
        if (totalHarga > 10_000) {
            totalDisc = (float)totalHarga * (float)(5.0 / 100);
        }

        System.out.println(chosenFood.name + " (x" + itemAmount + ")");
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Total diskon: Rp" + totalDisc);
        System.out.println("Total Harga (setelah diskon): " + (totalHarga - (int)totalDisc));
        System.out.println("\nSelamat Menikmati :)");
    }

    // snack
    static Food macaroni = new Snack("S024", "Macaroni", 4_000);
    static Food donuts = new Snack("S017", "Donuts", 3_000);
    static Food crackers = new Snack("S050", "Crackers",500);
    // mainDish
    static Food nasiPutih = new MainDish("M001", "Nasi Putih", 5_000);
    static Food nasiUduk = new MainDish("M002", "Nasi Uduk", 7_000);
    static Food nasiGoreng = new MainDish("M003", "Nasi Goreng", 10_000);
    static Food ketupatSayur = new MainDish("M004", "Ketupat Sayur", 1.2F, 7_500);

    public static void printKantinBanner() {
        System.out.println("====== KANTIN MR. JOHN ======");
        System.out.println("=========== MENU ============");
        System.out.println("\nSnacks");
        System.out.println("1. " + donuts.name + " (Rp" + donuts.price + ")");
        System.out.println("2. " + crackers.name + " (Rp" + crackers.price + ")");
        System.out.println("3. " + macaroni.name + " (Rp" + macaroni.price + ")");
        System.out.println("\nMain Dish");
        System.out.println("4. " + nasiPutih.name + " (Rp" + nasiPutih.price + ")");
        System.out.println("5. " + nasiUduk.name + " (Rp" + nasiUduk.price + ")");
        System.out.println("6. " + nasiGoreng.name + " (Rp" + nasiGoreng.price + ")");
        System.out.println("7. " + ketupatSayur.name + " (Rp" + ketupatSayur.price + ")");
        System.out.println("\n=============================");
    }
}
