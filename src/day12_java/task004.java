package day12_java;
import java.util.*;
import java.util.stream.Collectors;

public class task004 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(45, 81, 85, 100, 20, 95, 60, 10, 21);

        // Group by unit digit (last digit), preserving discovery order
        Map<Integer, List<Integer>> groups = input.stream()
                .collect(Collectors.groupingBy(
                        n -> Math.abs(n % 10),            // classifier: last digit
                        LinkedHashMap::new,               // preserve insertion order
                        Collectors.toList()               // collect into lists
                ));

        // Print each group: Array 1, 2, ...
        int idx = 1;
        for (List<Integer> group : groups.values()) {
            System.out.printf("Array %d has : %s%n",
                    idx++,
                    group.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", "))
            );
        }
    }
}
