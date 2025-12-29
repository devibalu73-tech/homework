import java.util.Scanner;

 class U1 
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT YOUR OPTION:");
        System.out.println("1. Melody");
        System.out.println("2. Kuthu");
        System.out.println("3. Motivational");
        System.out.println("4. Sad");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You selected MELODY songs:");
            System.out.println("1. Aathadi Manasudhan");
            System.out.println("2. Chinna Siriusu");
            System.out.println("3. Venmegam");
            System.out.println("4. Iayyayyo");
        } 
        else if (choice == 2) {
            System.out.println("You selected KUTHU songs:");
            System.out.println("1. Machi Open the Bottle");
            System.out.println("2. Saroja Saman Nikalo");
            System.out.println("3. No Money No Honey");
            System.out.println("4. Villayadu Mankatha");
        } 
        else if (choice == 3) {
            System.out.println("You selected MOTIVATIONAL songs:");
            System.out.println("1. Edhirum Nill");
            System.out.println("2. Oru Naal");
            System.out.println("3. Nimirnthu Nil");
            System.out.println("4. Ungakkule Mirugam");
        } 
        else if (choice == 4) {
            System.out.println("You selected SAD songs:");
            System.out.println("1. Kaadhal Valarthen");
            System.out.println("2. Yedho Ondru Ennai");
            System.out.println("3. Pogadhe");
            System.out.println("4. Ninaithu Ninaithu");
        } 
        else {
            System.out.println("Invalid Option ");
        }

        

    }
}