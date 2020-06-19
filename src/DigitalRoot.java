public class DigitalRoot {
    public static int digital_root(int number) {
        if (number < 10) return number;
        int newNumber = 0;
        if (number >= 10) {
            String[] sNumArray = String.valueOf(number).split("");
            for (int i = 0; i < sNumArray.length; i++) {
                newNumber += Integer.parseInt(sNumArray[i]);
            }
        }
        return digital_root(newNumber);
    }
}
