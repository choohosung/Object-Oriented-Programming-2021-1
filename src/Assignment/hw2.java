package Choo;
import java.util.*;
public class hw2 {
	public static void main(String[] args) {
		Set<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("������", "����", "����", "�����", "����", "����"));

		System.out.println("hashset" + a1);
		Set<String> a2 = new TreeSet<>(a1);
		System.out.println("treeset" + a2);

		TreeSet<String> a3 = (TreeSet<String>) a2;
		System.out.println("ù ��° ���� : " + a3.first());
		System.out.println("������ ���� : " + a3.last());
		System.out.println("���� �տ� �ִ� ���� : " + a3.lower("����"));
	}
}
