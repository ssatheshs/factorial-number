public class IterativeApproach {
    public static void main(String[] args) {
        System.out.println("Factorial using Iterative approach");
        int num = 4;
        System.out.println(String.format("Factorial of %d is %d ", num, calculateFactorial(num)));
    }

    private static int calculateFactorial(int num){
        int res = 1;
        for(int i = 2; i <= num; i++){
            res *= i;
        }
        return res;
    }
}
