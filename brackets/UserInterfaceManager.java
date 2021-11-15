package brackets;

public class UserInterfaceManager {

    private final BracketsCounter counter = new BracketsCounter();

    public void run() {
        String inputString;
        do {
            System.out.println("Enter the brackets line: ");
            inputString = counter.receiveString();
        } while (counter.isItBracketString(inputString));
        if (counter.isBracketsAmountEquals(inputString)) {
            System.out.println("It's ok");
        } else {
            System.out.println("It's not ok");
        }
    }
}
