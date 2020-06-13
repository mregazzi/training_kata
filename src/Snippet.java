public class Snippet implements Printable{
    private String data;

    public Snippet(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("Snipper: " + data);
    }
}
