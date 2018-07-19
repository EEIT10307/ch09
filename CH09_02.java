package ch09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CH09_02 {

	public static void main(String[] args) {

		String[] names = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList(names));

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {

			String x = it.next();

			System.out.println(x);

		}

	}

}
