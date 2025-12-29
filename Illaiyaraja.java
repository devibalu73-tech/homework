import java.util.Scanner;

class Illaiyaraja 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT YOUR OPTION:");
        System.out.println("1. Melody");
        System.out.println("2. Kuthu");
        System.out.println("3. Sad");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {   // Melody
            System.out.println("You selected MELODY songs:");
            System.out.println(" - Unnale");
            System.out.println(" - Annul Maele");
            System.out.println(" - Yedho Ondru");
            System.out.println(" - Vaseegara");
            System.out.println(" - Paartha Mudhal");
        }
        else if (choice == 2) {   // Kuthu
            System.out.println("You selected KUTHU songs:");
            System.out.println(" - Tirunelveli Halwa Da");
            System.out.println(" - Aradi Katre");
            System.out.println(" - Soda Bottle");
            System.out.println(" - Aruva Meesai");
        }
        else if (choice == 3) {   // Sad
            System.out.println("You selected SAD songs:");
            System.out.println(" - Venmathiye");
            System.out.println(" - Oh Maname");
            System.out.println(" - Yamma Yamma");
            System.out.println(" - Othaiyile");
        }
        else {
            System.out.println("Invalid Option! Please enter 1–3.");
        }

        sc.close();
    }
}