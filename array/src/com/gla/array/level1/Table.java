package com.gla.arrays.level1;
import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] table=new int[10];
        for(int i=1;i<=10;i++){
            table[i-1]=n*i;
        }
        for(int i=0;i<table.length;i++) {
            System.out.println(n + " * " + (i+1 ) + " = " + table[i]);
        }


    }
}
