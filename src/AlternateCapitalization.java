public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String[] result = new String[2];
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean capital = true;
        for (int i = 0; i < s.length(); i++) {
            if (capital){
                sb1.append((""+s.charAt(i)).toUpperCase());
                sb2.append((""+s.charAt(i)).toLowerCase());
            } else {
                sb1.append((""+s.charAt(i)).toLowerCase());
                sb2.append((""+s.charAt(i)).toUpperCase());
            }
            capital = !capital;
        }
        result[0] = sb1.toString();
        result[1] = sb2.toString();
        return result;
    }
}