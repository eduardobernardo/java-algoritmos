package com.example.project;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class MergeSortTest {

  @Test
  void deve_retornar_um_array_ordenado(){
    int[] arrayTest = {10,8,9,4,6,5,1,2,3,7};
    int[] ordered = MergeSort.sort(arrayTest);
    Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(ordered));
  }

}
