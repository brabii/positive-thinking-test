package com.codingame.test.pthinking;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	public static List<List<Integer>> partition(List<Integer> in, int size) {
		List<List<Integer>> rs = new ArrayList<>();
		if (in == null || in.isEmpty()) {
			return null;
		}
		if (size >= in.size() || size == 0) {
			rs.add(in);
			return rs;
		}
		for (int i = 0; i < in.size(); i = i + size) {
			List<Integer> subList = new ArrayList<>(size);
			if (size + i < in.size()) {
				subList = in.subList(i, size + i);
			} else {
				subList = in.subList(i, in.size());
			}
			System.err.println(subList);
			rs.add(subList);
		}
		return rs;
	}
}
