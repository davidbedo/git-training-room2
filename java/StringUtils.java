package java;

public class StringUtils {
    
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
    }


}
