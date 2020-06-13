import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        //esercizioR1_4();
        //esercizioR1_1();
        //esercizioR1_2();
        //esercizioR1_3();
        //calcFatBurningHeartRate();
    }

    private static void esercizioR1_4() {
        int i = 431298764;
        System.out.printf("Is %d even ? \n",i);
        System.out.println("Using plus only: " + isEvenUsingPlusOnly(i));
        System.out.println("Using String and switch case: " + isEvenUsingString(i));
    }

    private static boolean isEvenUsingString(int i) {
        String number = Integer.toString(i);
        char c = number.charAt(number.length() - 1);
        switch (c) {
            case '0': case '2': case '4' : case '6' : case '8':
                return true;
            default:
                return false;
        }
    }

    private static boolean isEvenUsingPlusOnly(int i) {
        boolean result = false;
        int k = 0;
        while (k<=i){
            k+=2;
            if (k == i) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static void esercizioR1_3() {
        long a = 99;
        long b = 33;
        System.out.printf("Is %d multiple of %d ? ",a,b);
        System.out.println(isMultiple(a, b));
    }

    private static void esercizioR1_2() {
        GameEntry[] entriesA = {new GameEntry(3), new GameEntry(1), new GameEntry(8), new GameEntry(6), new GameEntry(10)};

        GameEntry[] entriesB = entriesA.clone();

        System.out.println("A[4]:" + entriesA[4].score);
        System.out.println("B[4]:" + entriesB[4].score);

        entriesA[4].score = 440;
        System.out.println("Dopo A[4]:" + entriesA[4].score);
        System.out.println("Dopo B[4]:" + entriesB[4].score);
    }

    private static boolean isMultiple(long a, long b) {
        return (a % b == 0) ? true : false;
    }

    private static void esercizioR1_1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un boolean: ");
        boolean tipoBoolean = input.nextBoolean();
        System.out.println("Il booleano è: " + tipoBoolean);

        System.out.print("Inserisci un numero intero: ");
        int tipoIntero = input.nextInt();
        System.out.printf("Il numero inserito è: %d\n", tipoIntero);

        System.out.print("Inserisci un numero long: ");
        long tipoLong = input.nextLong();
        System.out.printf("Il numero inserito è: %d\n", tipoLong);

        System.out.print("Inserisci un numero double: ");
        double tipoDouble = input.nextDouble();
        System.out.printf("Il numero inserito è: %f\n", tipoDouble);

        System.out.print("Inserisci un numero float: ");
        float tipoFloat = input.nextFloat();
        System.out.printf("Il numero inserito è: %f\n", tipoFloat);

        System.out.print("Inserisci uno short: ");
        short tipoShort = input.nextShort();
        System.out.printf("Il numero short è: %d\n", tipoShort);

        System.out.print("Inserisci un byte: ");
        byte tipoByte = input.nextByte();
        System.out.printf("Il numero byte è: %d\n", tipoByte);
    }

    private static void calcFatBurningHeartRate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        double age = input.nextDouble(); // età in anni
        double fcMax = 208 - (0.7 * age);
        System.out.printf("Your maximum heart rate is: %d\n", (int) fcMax);
        double fb = (fcMax - age) * 0.65; // frequenza "brucia grassi"
        System.out.printf("Your ideal fat-burning heart rate is %d\n", (int) fb);
    }

    private static class GameEntry {
        public int score;

        public GameEntry(int score) {
            this.score = score;
        }
    }
}