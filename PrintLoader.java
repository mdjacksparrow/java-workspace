package javaWorkspace;

import java.io.*;
import java.util.*;
import java.util.Random;

public class PrintLoader{
  static int tot1 = 0, tot2 = 0, tot3 = 0;
  static int THRESHOLD = 10;

  public static void main(String[] args){

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> dev1 = new Stack<Integer>();
    Stack<Integer> dev2 = new Stack<Integer>();
    Stack<Integer> dev3 = new Stack<Integer>();

    System.out.print("Enter No.of Jobs : ");
    int n = scanner.nextInt();

    for(int i = 0; i < n; i++){
      System.out.print("Enter amount of Job " + (i+1) + " Load : ");
      int value = scanner.nextInt();

      switch(rand.nextInt(3)){
        case 0:
          tot1 += value;
          pushLoad(dev1, value, tot1);
          break;
        case 1:
          tot2 += value;
          pushLoad(dev2, value, tot2);
          break;
        case 2:
          tot3 += value;
          pushLoad(dev3, value, tot3);
          break;
      }
    }

    System.out.println("\nBefore Normalize\nDev-1\tDev-2\tDev-3");
    System.out.println(dev1 + "\t" + dev2 + "\t" + dev3);

    System.out.println("length" + length(dev1) + "\n" + length(dev2) + "\n" + length(dev3));

    if((tot1 < tot2) && (tot1 < tot3)){
      System.out.println("\nMinimum load is " + dev1);

      if(dev1.empty())
        System.out.println(dev1);
      else{
        // Find second Minimum Stack
          int range = length(dev1);
          for(int i = 0; i < range; i++){
            int temp = popLoad(dev1);
            System.out.println(temp);
            if(tot2 < tot3)
              pushLoad(dev2, temp, tot2);
            else
              pushLoad(dev3, temp, tot3);
          }
      }
    }
    else if(tot2 < tot3){
      System.out.println("\nMinimum total " + dev2);

      if(dev2.empty())
        System.out.println(dev2);
      else{
            int range = length(dev2);

            for(int i = 0; i < range ; i++){
            int temp = popLoad(dev2);
            System.out.println(temp);
            if(tot1 < tot3)
              pushLoad(dev1, temp, tot1);
            else
              pushLoad(dev3, temp, tot3);
        }
      }
    }
    else{
      System.out.println("\nMinimum total " + dev3);

      if(dev3.empty())
        System.out.println(dev3);
      else{
        int range = length(dev3);

        for(int i = 0; i < range; i++){
          int temp = popLoad(dev3);
          System.out.println(temp);
          if(tot1 < tot2)
            pushLoad(dev1, temp, tot1);
          else
            pushLoad(dev2, temp, tot2);
        }
      }
    }

    System.out.println("\nAfter Normalize\nDev-1\tDev-2\tDev-3");
    System.out.println(dev1 + "\t" + dev2 + "\t" + dev3);
  }

  public static void pushLoad(Stack<Integer> stack, int value, int tot){

    if(THRESHOLD <= tot)
      System.out.println("Exceed THRESHOLD value");
    else{
      stack.push(value);
    }
  }

  public static int popLoad(Stack<Integer> stack){
    return stack.pop();
  }

  public static int length(Stack<Integer> stack){
    int length = 0;
    for(int i : stack){
      length++;
    }

    return length;
  }
}
