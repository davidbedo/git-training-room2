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
}