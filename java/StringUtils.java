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

    public String getUcFirst(String input){
        return "Not sure what is UcFirst";
    }

public String sustring(int beginIndex) {    
       if (beginIndex < 0) {    
           throw new StringIndexOutOfBoundsException(beginIndex);    
       }    
       int subLen = value.length - beginIndex;    
       if (subLen < 0) {    
           throw new StringIndexOutOfBoundsException(subLen);    
       }    
       return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);    
   } 
    function palindrome(str) {
      let lowStr = str.toLowerCase();
      let reverseStr = lowRegStr.split('').reverse().join(''); 
      return reverseStr === lowRegStr; 
      //test
    }

}
