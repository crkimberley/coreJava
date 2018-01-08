package exercises.ch07.ex01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sieve {

    public static void hashPrimes(int n) {
        HashSet<Integer> integers = IntStream.rangeClosed(2, n).boxed().collect(Collectors.toCollection(HashSet::new));
        hashSieve(2, n, integers).stream().sorted().forEach(System.out::println);
    }

    private static HashSet<Integer> hashSieve(int min, int n, HashSet<Integer> integers) {
        int minSquared = min * min;
        if (minSquared > n) return integers;
        Collection<Integer> hashSieveIntegers = IntStream
                .iterate(minSquared, i -> i + min).limit((n - minSquared) / min + 1)
                .filter(x -> x <= n)
                .boxed()
                .collect(Collectors.toList());
        integers.removeAll(hashSieveIntegers);
        return hashSieve(integers.stream().filter(x -> x > min).min(Comparator.naturalOrder()).get(), n, integers);
    }

    public static void bitSetPrimes(int n) {
        BitSet numbers = new BitSet(n + 1);
        numbers.set(2, n + 1);
        for (int i = 2; i * i <= n ; i++) {
            if (!numbers.get(i)) continue;
            for (int j = i * i; j <= n; j += i) numbers.clear(j);
        }
        numbers.stream().forEach(System.out::println);
        System.out.println("No. of primes = " + numbers.cardinality());
    }

    public static void main(String[] args) {
        new Sieve().launch();
    }

    private void launch() {
        hashPrimes(100);
        System.out.println();
        bitSetPrimes(179424673);
    }
}