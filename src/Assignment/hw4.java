package Choo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class hw4 {
	public static void main(String[] args) {
		String[] s1 = { "a", "b", "a", "b", "c" };
		String[] s2 = { "c" };

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);

		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);

		System.out.println("set1�� set2�� ���� : " + set1.equals(set2));

		System.out.println("set1�� set2�� ��� ��Ҹ� �����Ѵ� : " + set1.containsAll(set2));

		Set<String> union = new HashSet<>(set1);
		Set<String> intersection = new HashSet<>(set1);

		union.addAll(set2);
		intersection.retainAll(set2);
		System.out.println("������ : " + union);
		System.out.print("������ : " + intersection);

	}
}
