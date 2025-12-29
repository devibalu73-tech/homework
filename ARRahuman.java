import java.util.Scanner;

class ARRahuman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("A.R. RAHUMAN");
        System.out.println("SELECT YOUR OPTION, THE OPTIONS ARE MELODY, KUTHU, MOTIVATIONAL, SAD");
        System.out.println("(If you choose any option, you have to play the lyrics of the particular song)");

        System.out.print("Enter your category: ");
        String type = sc.nextLine().toLowerCase();

        if (type.equals("melody")) {

            System.out.println("\nMelody Songs:");
            System.out.println("1. Netru Illadha Matram");
            System.out.println("2. Enna Solla Pogirai");
            System.out.println("3. Ennavale Adi Ennavale");
            System.out.println("4. Malargale Malargale");

        } else if (type.equals("kuthu")) {

            System.out.println("\nKuthu Songs:");
            System.out.println("• Thaiya Thaiya");
            System.out.println("• Mukkala Mukkabala");
            System.out.println("• Urvashi Urvashi");
            System.out.println("• Aathichudi");

        } else if (type.equals("motivational")) {

            System.out.println("\nMotivational Songs:");
            System.out.println("• Vande Mataram");
            System.out.println("• Oruvan Oruvan Muthalali");
            System.out.println("• Shakthi Kodu");
            System.out.println("• Kappal Yeri Poyachu");

        } else if (type.equals("sad")) {

            System.out.println("\nSad Songs:");
            System.out.println("• Poongatrile");
            System.out.println("• Marudaani");
            System.out.println("• Minnale En Vazhvin");
            System.out.println("• Rasathi");
            System.out.println("• Oru Poiyavathu Sol");

        } else {

            System.out.println("\nInvalid Category");
        }
    }
}