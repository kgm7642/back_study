package lecture.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Operator : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
        *            Function과 거의 유사하지만 다른 점은 매개변수를 이용해 연산을 한 후
        *            동일한 타입으로 리턴해주는 것이 다르다.
        * */

        /*
        * BinarayOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴한다.
        * */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        /* UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴한다.*/
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));

        /* 목차. 3. DoubleBinaryOperator#applyAsDouble(double d1, double d2) : double : 매개변수 두 개를 이용하여 연산 후 double 타입으로 리턴한다. */

        /* 목차. 4. DoubleUnaryOperator#applyAsDouble(double d) : double : 매개변수 한 개를 이용하여 연산 후 double 타입으로 리턴한다. */

        /* 목차. 5. IntBinaryOperator#applyAsInt(int i1, int i2) : int : 매개변수 두 개를 이용하여 연산 후 int 타입으로 리턴한다. */

        /* 목차. 6. IntUnaryOperator#applyAsInt(int i) : int : 매개변수 한 개를 이용하여 연산 후 int 타입으로 리턴한다. */

        /* 목차. 7. LongBinaryOperator#applyAsLong(long l1, long l2) : long : 매개변수 두 개를 이용하여 연산 후 long 타입으로 리턴한다. */

        /* 목차. 8. LongUnaryOperator#applyAsLong(long l) : long : 매개변수 한 개를 이용하여 연산 후 long 타입으로 리턴한다. */
    }
}
