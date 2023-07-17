package JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamfunctions {
  public static void main(String[] args) {
	  
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,2847,248);
    
    long oddnumbers =numbers.stream().count();

    List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

    System.out.println("Even numbers: " + evenNumbers);
    System.out.println("Odd numbers: " + oddnumbers);
    
    //Mapping a stream of strings to their lengths:
    List<String> words = Arrays.asList("hello", "world", "streams", "are", "cool");
    List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
    
    System.out.println(words);
    System.out.println(wordLengths);

    
    //Reducing a stream of numbers to find their sum:
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers1.stream().reduce(0, Integer::sum);
    
    





  }
}
