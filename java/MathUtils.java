import java.util.List;
import java.util.Arrays;

public class MathUtils {

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
      if (a !== b && a !== c && b !== c) return 1; //oarecare
      if (a === b || a === c || b === c) return 2; //isoscel
      if (a === b && b === c) return 3; //echilateral
    }

    public double getAverage(int[] myArray){       
        return Arrays.stream(myArray).average().orElse(0);
    }
}