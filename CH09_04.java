package ch09;

import java.util.Arrays;

public class CH09_04 {

	public static void main(String[] args) {
		String[] names = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
		
		Arrays.sort(names);

		for(int x = 0 ; x < names.length ; x++) {
			System.out.print(names[x]+" ");
			
		}
		
	}

}
