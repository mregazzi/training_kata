public class ObjectAndClasses {
    public static void main(String args[]){
        Book promessiSposi = new Book("Italiano", 100, "I promessi sposi");

        Book divinaCommedia = new Book("Inglese", 200, "La divina commedia");
        
        promessiSposi.stampa(30, 70);

        divinaCommedia.stampa();

        Book book = promessiSposi;

        book.stampa();
        book.setPrezzo(10);
        printBook(book);
        printBook(book);

        book = divinaCommedia;
        divinaCommedia.setPrezzo("20");
        System.out.println(book.titolo + " " + book.getPrezzo());
        printBook(book);
        System.out.println(book.titolo + " " + book.getPrezzo());

        String phone = "555-548-1254";
        System.out.println(phone.substring(3, 6));

        int a = 7;
        int b = 3;
        System.out.println(a / b);

        int c = 50 - 8 * 2 / 4 - 8 + 3;
        System.out.println(c);

        String name = "Bob";
        int num = 3;

        String msg = "Bob wrote "+ (2+1) + " Java programs.";
        msg = name + " wrote " + 2+1 + " Java programs.";
        msg = name + " wrote " + 3 + " Java programs.";

        System.out.println(msg);

        System.out.println("********************");
        String[] someWords = {"prima", "seconda", "terza", "quarta", "quinta"};
        StringBuilder sb = new StringBuilder();
        for (String word : someWords){
            sb.append(word);
            sb.append(" ");
        }
        System.out.println("And the final sentence is: " + sb.toString());
    }

    private static void printBook(Book book) {
        System.out.println(book.titolo + " " + book.getPrezzo());
        book.setPrezzo(100);
    }
}

class Book {
    public String lingua;
    public int pagine;
    public String titolo;
    private int prezzo;

    public Book(String lingua, int pagine, String titolo){
        this.lingua = lingua;
        this.pagine = pagine;
        this.titolo = titolo;
    }

    public void setPrezzo(int prezzo){
        this.prezzo = prezzo;
    }

    public void setPrezzo(String s) {
        this.setPrezzo(Integer.parseInt(s));

    }

    public int getPrezzo(){
        return prezzo;
    }

    public void stampa(int paginaDa, int paginaA){
        System.out.println("Ho stampato " + (paginaA - paginaDa) + " pagine del libro " + titolo + ".");
    }

    public void stampa(){
        System.out.println("Ho stampato " + pagine + " pagine del libro " + titolo + ".");
    }
}
