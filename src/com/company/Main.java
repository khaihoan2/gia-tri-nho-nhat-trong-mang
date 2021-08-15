package com.company;

import java.util.Scanner;

public class Main {

    public static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = creatArray();
        int min = findMin(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
