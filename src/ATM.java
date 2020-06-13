public class ATM {
    public int solve(int amountToBeDelivered) {
        int[] notes = {500, 200, 100, 50, 20, 10};
        int notesCounter = 0;

        for (int note : notes) {
            notesCounter += amountToBeDelivered / note;
            amountToBeDelivered = amountToBeDelivered % note;
        }

        return amountToBeDelivered == 0 ? notesCounter : -1;
    }
}
