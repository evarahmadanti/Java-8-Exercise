import java.util.*;
import java.util.stream.Collectors;

public class AssignmentOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 5);
        System.out.println("Input Numbers : " + numbers);
        isEvenNumber(numbers);
        isStartOne(numbers);
        sumElements(numbers);
        sortingValue(numbers);
    }

    private static void isEvenNumber(List<Integer> numbers) {
        Map<Boolean, List<Integer>> isEven = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        List<Integer> evenNum = isEven.get(true);
        System.out.println("Even Numbers : " + evenNum);
    }

    private static void isStartOne(List<Integer> numbers) {
        List<String> strings = numbers.stream().map(Object::toString)
                .filter(number -> number.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Numbers starting with one : " + strings);
    }

    private static void sumElements(List<Integer> numbers) {
        Integer sum = numbers.stream().reduce(0, (i, j) -> i +j);
        System.out.println("Sum of the elements : " + sum);
    }

    private static void sortingValue(List<Integer> numbers) {
        List<Integer> sorting = numbers.stream()
                .sorted().collect(Collectors.toList());
        System.out.print("Sorted Elements :");
        sorting.forEach((number) -> System.out.print(" " + number));
    }
}
