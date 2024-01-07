public class IterativeApproach {
    public static void main(String[] args) {
        System.out.println("Factorial using Iterative approach");
        int num = 5;
        System.out.println(String.format("Factorial of %d is %d ", num, calculateFactorial(num)));
        System.out.println(String.format("Factorial of %d is %d ", num, calculateFact(num)));
    }

    private static int calculateFactorial(int num){
        int res = 1;
        for(int i = 2; i <= num; i++){
            res *= i;
        }
        return res;
    }

    private static int calculateFact(int num){
        int res = 1;
        for(int i = num; i >= 2; i--){
            res *= i;
        }
        return res;
    }
}
