package Choo;
import java.util.Scanner;
import java.util.stream.Stream;

public class hw3 {
	public static void main(String[] args) {
		Stream<String> kb = Stream.generate(() -> new Scanner(System.in).nextLine());
		long count = kb.limit(5).filter(x -> x.length() == 2).count();
		System.out.println(count);
	}
}
