package java;

public class StringUtils {
    
    public int reverse(int nr){

        int reversed = 0;       
        System.out.println("Original Number: " + nr);

        // run loop until num becomes 0
        while(nr != 0) {       
            // get last digit from num
            int digit = nr % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            nr /= 10;
        }

        return reversed;
    }
}
