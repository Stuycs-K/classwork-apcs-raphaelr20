public class Fibonacci {
    public static int fib(int n) {
        if (n<2) 
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        fib(Integer.parseInt(args[0]));
        // 47 is largest n that takes less than 10 seconds
    }
}