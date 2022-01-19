import java.util.List;

public class MathUtils { 

    public static void main(String[] args) {       
    }

    public double getAverage(int[] myArray){
        int arrayLenght= myArray.length;
        return Arrays.stream(myArray).average().orElse(0);
    }
}