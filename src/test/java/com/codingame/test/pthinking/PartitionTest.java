package com.codingame.test.pthinking;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

public class PartitionTest {

	// test si la taille est superieur à la taille de la liste alors retourne la
	// list

	@Test
	public void ifSizeGreaterThanListSizeThenReturnList() {
		int size = 10;
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(in);
		assertTrue(CollectionUtils.isEqualCollection(expectedList, Partition.partition(in, size)));
	}
	// test si la taille est égal à zéro alors reourne la liste

	@Test
	public void ifSizeEqualsZeroThenReturnList() {
		int size = 0;
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(in);
		assertTrue(CollectionUtils.isEqualCollection(expectedList, Partition.partition(in, size)));
	}

	// test si la liste est null
	@Test
	public void ifListIsNullOrEmptyThenReturnNull() {
		int size = 5;
		List<Integer> in1 = new ArrayList<>();
		List<Integer> in2 = null;
		assertTrue(Partition.partition(in1, size) == null);
		assertTrue(Partition.partition(in2, size) == null);
	}

	// simples tests
	@Test
	public void test1() {
		int size = 2;
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		List<Integer> part1 = new ArrayList<>();
		part1.add(1);
		part1.add(2);
		List<Integer> part2 = new ArrayList<>();
		part2.add(3);
		part2.add(4);
		List<Integer> part3 = new ArrayList<>();
		part3.add(5);
		expectedList.add(part1);
		expectedList.add(part2);
		expectedList.add(part3);
		assertTrue(CollectionUtils.isEqualCollection(expectedList, Partition.partition(in, size)));
	}

	@Test
	public void test2() {
		int size = 3;
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		List<Integer> part1 = new ArrayList<>();
		part1.add(1);
		part1.add(2);
		part1.add(3);
		List<Integer> part2 = new ArrayList<>();
		part2.add(4);
		part2.add(5);
		expectedList.add(part1);
		expectedList.add(part2);
		assertTrue(CollectionUtils.isEqualCollection(expectedList, Partition.partition(in, size)));
	}

	@Test
	public void test3() {
		int size = 1;
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		List<Integer> part1 = new ArrayList<>();
		List<Integer> part2 = new ArrayList<>();
		List<Integer> part3 = new ArrayList<>();
		List<Integer> part4 = new ArrayList<>();
		List<Integer> part5 = new ArrayList<>();
		part1.add(1);
		part2.add(2);
		part3.add(3);
		part4.add(4);
		part5.add(5);
		expectedList.add(part1);
		expectedList.add(part2);
		expectedList.add(part3);
		expectedList.add(part4);
		expectedList.add(part5);
		assertTrue(CollectionUtils.isEqualCollection(expectedList, Partition.partition(in, size)));
	}

}
