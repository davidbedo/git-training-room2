import java.util.List;
import java.util.Arrays;

public class MathUtils{

    public static void main(String args[]){
        int nr=10;
        System.out.println(factorial(nr));
    }

    private int factorial(int nr){
        int factorial;
        for(int i=1; i<=nr; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    function getTriangleType(a,b,c) {
      if (a === b || a === c || b === c) return 2; //isoscel
      else if (a === b && b === c) return 3; //echilateral
      else return 1; //oarecare
    }

    public double getAverage(int[] myArray){
        int arrayLenght= myArray.length;
        return Arrays.stream(myArray).average().orElse(0);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}