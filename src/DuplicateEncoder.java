public class DuplicateEncoder {
    static String encode(String word) {
        String resultWord = "";
        int[] changes = new int[word.length()];
        if (word.length() != 0) {
            for (int i = 0; i < word.length(); i++) {
                if(word.substring(i+1).contains(""+word.charAt(i))) {
                    System.out.println("Trovato");
                    resultWord = word.replace(word.charAt(i), ')');
                } else {
                    resultWord = word.replace(word.charAt(i), '(');
                }
                word = resultWord;
            }
        }
        return resultWord;
    }
}