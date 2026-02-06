package com.gla.arrays.level1;
import java.util.Scanner;

public class NumberCheck {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) {
                System.out.println(arr[i] + " is positive and");
                if (arr[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }else if(arr[i]<0) {
                System.out.println(arr[i] + " is Negative");
            }else {
                System.out.println(arr[i] + " is Zero");
            }
            }
        if(arr[0]==arr[arr.length -1])
            System.out.println("First and last are Equal");
        else if(arr[0]>arr[arr.length -1])
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");

        }

    }

