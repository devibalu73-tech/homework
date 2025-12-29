import java.util.Scanner;

class Anirudh 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT YOUR OPTION:");
        System.out.println("1. MELODY");
        System.out.println("2. KUTHU");
        System.out.println("3. MOTIVATIONAL");
        System.out.println("4. SAD");

        System.out.print("Enter your choice (1-4): ");
        int option = sc.nextInt();

        if(option == 1) { 
            System.out.println("You selected MELODY songs:");
            System.out.println("1. Neeyum Nanum Anbe");
            System.out.println("2. Velicha Poove");
            System.out.println("3. Po Indru Neeyaga");
            System.out.println("4. Nee Partha Vizhigal");

            System.out.print("Choose a song (1-4): ");
            int song = sc.nextInt();

            if(song == 1)
                System.out.println("Playing: Neeyum Nanum Anbe...");
            else if(song == 2)
                System.out.println("Playing: Velicha Poove...");
            else if(song == 3)
                System.out.println("Playing: Po Indru Neeyaga...");
            else if(song == 4)
                System.out.println("Playing: Nee Partha Vizhigal...");
            else
                System.out.println("Invalid song choice!");

        } else if(option == 2) {
            System.out.println("You selected KUTHU songs:");
            System.out.println("1. Vaathi Raid");
            System.out.println("2. Naa Ready");
            System.out.println("3. Badass");
            System.out.println("4. Vandha Edam");

            System.out.print("Choose a song (1-4): ");
            int song = sc.nextInt();

            if(song == 1)
                System.out.println("Playing: Vaathi Raid...");
            else if(song == 2)
                System.out.println("Playing: Naa Ready...");
            else if(song == 3)
                System.out.println("Playing: Badass...");
            else if(song == 4)
                System.out.println("Playing: Vandha Edam...");
            else
                System.out.println("Invalid song choice!");

        } else if(option == 3) {
            System.out.println("You selected MOTIVATIONAL songs:");
            System.out.println("1. Vellai Illa Pattathari");
            System.out.println("2. Boomi Enna Suthudhe");
            System.out.println("3. Ethir Neechal");
            System.out.println("4. Surviva");

            System.out.print("Choose a song (1-4): ");
            int song = sc.nextInt();

            if(song == 1)
                System.out.println("Playing: Vellai Illa Pattathari...");
            else if(song == 2)
                System.out.println("Playing: Boomi Enna Suthudhe...");
            else if(song == 3)
                System.out.println("Playing: Ethir Neechal...");
            else if(song == 4)
                System.out.println("Playing: Surviva...");
            else
                System.out.println("Invalid song choice!");

        } else if(option == 4) {
            System.out.println("You selected SAD songs:");
            System.out.println("1. Porkanda Singam");
            System.out.println("2. Kanave Kanave");
            System.out.println("3. Kannaana Kanney");
            System.out.println("4. Jodi Nilave");

            System.out.print("Choose a song (1-4): ");
            int song = sc.nextInt();

            if(song == 1)
                System.out.println("Playing: Porkanda Singam...");
            else if(song == 2)
                System.out.println("Playing: Kanave Kanave...");
            else if(song == 3)
                System.out.println("Playing: Kannaana Kanney...");
            else if(song == 4)
                System.out.println("Playing: Jodi Nilave...");
            else
                System.out.println("Invalid song choice!");

        } else {
            System.out.println("Invalid option! Please choose between 1–4.");
        }

        sc.close();
    }
}