package Choo;
import java.util.*;
public class hw1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		map.put("�迭��", 80);
		map.put("�ְ��", 90);
		map.put("����", 95);
		map.put("���ڹ�", 88);

		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String id = in.nextLine();

		if (map.containsKey(id))
			System.out.println(map.get(id));
	}
}
