import java.util.*;

class Exp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        int q = 0;
	
        for (int i = 0; i < str.length(); i++) 
        {
            char currentChar = str.charAt(i);
            int prevState = q;
            switch (q) {
                case 0:
                    if (currentChar == 'a') {
                        q = 1;
                    } else {
                        q = 0;
                    }
                    break;
                case 1:
                    if (currentChar == 'b') {
                        q = 2;
                    } else {
                        q = 1;
                    }
                    break;
                case 2:
                    if (currentChar == 'c') {
                        q = 3;
                    } else if (currentChar == 'a') {
                        q = 1;
                    }
                    break;
                case 3:
                    if (currentChar == 'a') {
                        q = 1;
                    }
                    else {
                        q=0;
                    }
                    break;
            }
            System.out.println("q" + prevState + " --> " + "q" + q + " with input '" + currentChar + "'");
        }

        if (q == 3) {
            System.out.println("THE GIVEN STRING IS ACCEPTED");
        } else {
            System.out.println("THE GIVEN STRING IS NOT ACCEPTED");
        }
    }
}
