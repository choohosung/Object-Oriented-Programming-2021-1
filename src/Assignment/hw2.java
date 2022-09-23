package Choo;
import java.util.*;
public class hw2 {
	public static void main(String[] args) {
		Set<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));

		System.out.println("hashset" + a1);
		Set<String> a2 = new TreeSet<>(a1);
		System.out.println("treeset" + a2);

		TreeSet<String> a3 = (TreeSet<String>) a2;
		System.out.println("첫 번째 동물 : " + a3.first());
		System.out.println("마지막 동물 : " + a3.last());
		System.out.println("나비 앞에 있는 동물 : " + a3.lower("나비"));
	}
}
