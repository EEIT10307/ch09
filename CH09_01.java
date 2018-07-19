package ch09;

import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CH09_01 {

	public static void main(String[] args) {
		Collection<Object> v = new ArrayList<>();
		// 加入V的物件
		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add((short) 100);
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("Snoppy");
		v.add(new BigInteger("1000"));
		System.out.println("印出V的物件");
		for (Object x : v) {
			System.out.println(x);

		}

		System.out.println("刪除非Number 家族的物件 然後印出");
		Iterator<Object> v1 = v.iterator();

		while (v1.hasNext()) {
			if (!(v1.next() instanceof Number)) {
				v1.remove();
			}
		}

		v1 = v.iterator();

		while (v1.hasNext()) {
			Number x = (Number) v1.next();

			System.out.println(x);
		}

	}

}
