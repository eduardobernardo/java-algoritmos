package com.example.project;

public class MergeSort {
  
  public static int[] sort(int[] original){
    int[] clone = new int[original.length];
    mergeSort(original, clone, 0, original.length-1);
    return original;
  }

  private static void mergeSort(int[] original, int[] clone, int inicio, int fim){
    if(inicio < fim){
      int metade = (inicio + fim) / 2;
      System.out.println("Metade: " + metade);
      mergeSort(original, clone, inicio, metade);
      mergeSort(original, clone, metade+1, fim);
      intercalar(original, clone, inicio, metade, fim);
    }
  }

  private static void intercalar(int[] original, int[] clone, int inicio, int metade, int fim){
    for(int k = inicio; k <= fim; k++){
      clone[k] = original[k];
    }

    int i = inicio;
    int j = metade + 1;

    for(int k = inicio; k <= fim; k++){
      if(i > metade){ 
        System.out.println("i > metade: " + i + " - " + metade);
        original[k] = clone[j++];
      }else if(j > fim){ 
        System.out.println("i > fim: " + i + " - " + fim);
        original[k] = clone[i++];
      }else if(clone[i] < clone[j]){ 
        System.out.println("clone[i] < clone[j]: " + clone[i] + " - " + clone[j]);
        original[k] = clone[i++];
      }else{ 
        System.out.println("else: " + original[k] + " - " + clone[j]);
        original[k] = clone[j++];
      }  
    }
  }
}
