package exercises.ch01;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Ex6_BigIntegerFactorial {
    public static BigInteger factorial(int number) {
        return number == 1 ? BigInteger.ONE : BigInteger.valueOf(number).multiply(factorial(number - 1));
    }


    public static BigInteger factorialTail(int number) {
        return factorialX(BigInteger.ONE, 1, number);
    }

    private static BigInteger factorialX(BigInteger accumulator, int n, int number) {
        accumulator = accumulator.multiply(BigInteger.valueOf(n));
        return n == number ? accumulator : factorialX(accumulator, n + 1, number);
    }


    private static Map<Integer, BigInteger> factorialMap;

    public static BigInteger factorialMemoMap(int number) {
        if (factorialMap == null) {
            factorialMap = new HashMap<>();
            factorialMap.put(1, BigInteger.ONE);
        }
        if (!factorialMap.containsKey(number)) {
            factorialMap.put(number, BigInteger.valueOf(number).multiply(factorialMemoMap(number - 1)));
        }
        return factorialMap.get(number);
    }


    public static BigInteger factorialMemoArray(int number) {
        BigInteger[] factorialArray = initialiseArray(number);
        if (factorialArray[number].equals(BigInteger.valueOf(-1))) {
            factorialArray[number] = BigInteger.valueOf(number).multiply(factorialMemoArray(number - 1));
        }
        return factorialArray[number];
    }

    private static BigInteger[] initialiseArray(int number) {
        BigInteger[] factorialArray = new BigInteger[number + 1];
        for (int i = 0; i < factorialArray.length; i++) {
            factorialArray[i] = BigInteger.valueOf(-1);
        }
        factorialArray[1] = BigInteger.ONE;
        return factorialArray;
    }
}