package functional;

/**
 * @author lanqilu
 * @date Created in 2020/10/16  12:30
 * @description 斐波那契数列
 */
public class RecursiveFibonacci {
    IntCall fib;

    RecursiveFibonacci() {
        fib = n -> n == 0 ?
                0 :
                n == 1 ? 1 : fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for (int i = 0; i <= 10; i++) {
            System.out.println(rf.fibonacci(i));
        }
    }
}
/* Output
1
1
2
3
5
8
13
21
34
55
*/
