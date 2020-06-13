public class ExceptionDemo {

    public static void main(String[] args) {
        methodOne();
    }

    private static void methodOne(){
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There was an exception: " + e);
            //e.printStackTrace();
        }
    }

    private static void generateException() throws ArrayIndexOutOfBoundsException{
        int[] myArray = new int[5];
        myArray[5] = 1;
        System.out.println(myArray[4]);
    }
}
