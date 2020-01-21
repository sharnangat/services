package com.java8.example.poc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);

		List l = nList.stream().filter(val -> val % 2 == 0).collect(Collectors.toList());

		System.out.println("Only Even Numbers");

		Iterator p1 = l.iterator();

		while (p1.hasNext()) {

			System.out.println(p1.next());
		}

	}

}
