public class FactorialDivideAndConquer {
    public static void main(String[] args) {
        System.out.println("Factorial using Divide and Conquer approach");
        int num = 5;
        System.out.println("Factorial "+ calculateFactorial(num));
    }

    private static long calculateFactorial(int num){
        if( num < 0 ){
            System.out.println("Cannot calculate factorial for given number");
            return 1;
        }
        if( num == 0 || num == 1 ){
            return 1;
        }

        return divideAndConquerApproach(2, num);

    }

    private static long divideAndConquerApproach(int start, int end){
        if (start == end) {
            return start;
        }
        int mid = start + (end - start) / 2;

        long firstPart = divideAndConquerApproach(start, mid);
        long secondPart = divideAndConquerApproach(mid+1, end);

        return firstPart * secondPart;
    }
}
