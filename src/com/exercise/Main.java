package com.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<Integer> integers = new HashSet<>();
    integers.add(2);
    integers.add(5);
    integers.add(8);
    integers.add(14);
    integers.add(0);

    int n = 14;

    List<Integer> sum = getAddends(integers, n);
    System.out.println(sum);
  }

  private static List<Integer> getAddends(Set<Integer> numbers, int result) {
    List<Integer> addends = new ArrayList<>();

    for (int i : numbers) {
      for (int j : numbers) {
        if (i + j == result && i != j) {
          addends.add(i);
          addends.add(j);

          return addends;
        }
      }
    }

    return addends;
  }
}
