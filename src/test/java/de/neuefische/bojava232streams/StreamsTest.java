package de.neuefische.bojava232streams;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamsTest {
    @Test
    public void filtering() {
        List<Integer> numbers = List.of(1,10,3,4,5,6,7,8,9,2);

        List<Integer> numbersGreaterThan5 = numbers.stream().filter(x -> {
            if (x > 5) {
                return true;
            }

            return false;
        }).toList();

        System.out.println(numbersGreaterThan5);

        Assertions.assertTrue(true);
    }

    @Test
    public void map() {
        List<Integer> numbers = List.of(1,10,3,4,5,6,7,8,9,2);

        List<Integer> numbersPlus1 = numbers.stream().map(x -> {
            return x + 1;
        }).toList();

        System.out.println(numbersPlus1);

        Assertions.assertTrue(true);
    }

    @Test
    public void reduce() {
        List<Integer> numbers = List.of(1,10,3,4,5,6,7,8,9,2);


        int sumArr = numbers.stream().reduce(0, (sum, x) -> {
            return sum + x;
        });

        System.out.println(sumArr);

        Assertions.assertTrue(true);
    }

    @Test
    public void complexExample() {
        List<Integer> numbers = List.of(1,10,3,4,5,6,7,8,9,2);

        List<Integer> result = numbers.stream()
                .filter(x -> x < 5)
                .map(x -> x * x)
                .filter(x -> x < 5)
                .toList();

        System.out.println(result);

        Assertions.assertTrue(true);
    }
}
