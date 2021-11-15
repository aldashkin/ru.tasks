package brackets;

import java.util.Scanner;

public class BracketsCounter {

    private final Scanner scanner = new Scanner(System.in);

    public String receiveString() {
        return scanner.nextLine();
    }

    public boolean isItBracketString(String bracketsString) {
        boolean isItBracketString = true;
        for (Character sign : bracketsString.toCharArray()) {
            if (sign != ')' && sign != '(') {
                isItBracketString = false;
                break;
            }
        }
        return !isItBracketString;
    }

    public boolean isBracketsAmountEquals(String bracketsString) {
        int bracketsCount = 0;
        boolean isEqualAmount = true;
        for (Character sign : bracketsString.toCharArray()) {
            if (sign == '(') {
                bracketsCount++;
            } else {
                bracketsCount--;
            }
        }
        if (bracketsCount != 0) {
            isEqualAmount = false;
        }
        return isEqualAmount;
    }

}