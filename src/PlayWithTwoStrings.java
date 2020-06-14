public class PlayWithTwoStrings {
    public static String workOnStrings(String firstString, String secondString) {
        String[] first = firstString.split("");
        String[] second = secondString.split("");

        changeString(secondString, first, second);

        secondString = rewriteString(second);

        changeString(firstString, second, first);

        firstString = rewriteString(first);

        return firstString + secondString;
    }

    private static String rewriteString(String[] s) {
        StringBuffer newString = new StringBuffer();
        for (int k = 0; k < s.length; k++) {
            newString.append(s[k]);
        }
        return newString.toString();
    }

    private static void changeString(String secondString, String[] first, String[] second) {
        for (String s : first) {
            if (isPresentInBoth(s, secondString)) {
                for (int j = 0; j < second.length; j++) {
                    if (second[j].equalsIgnoreCase(s)) {
                        second[j] = changeCase(second[j]);
                    }
                }
            }
        }
    }

    private static boolean isPresentInBoth(String s, String s2) {
        return s2.toUpperCase().contains(s.toUpperCase());
    }

    private static String changeCase(String s) {
        return s.equals(s.toLowerCase()) ? s.toUpperCase() : s.toLowerCase();
    }
}