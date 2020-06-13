public class Document implements Printable{
    private String data;

    public Document(String data){
        this.data = data;
    }

    public boolean insEmplty() {
        return data.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(("Document: " + data));
    }
}
