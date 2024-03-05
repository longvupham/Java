package ly

import java.util.Scanner;

public class Xoa1phantukhoimang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu gồm các phần tử sau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vị trí phần tử muốn xoá: ");
        int x = sc.nextInt();
        if (x < 0 || x >= arr.length) {
            System.out.println("vị trí không phù hợp: ");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != x) {
                newArr[j++] = arr[i];
            }
        }
        arr = newArr;
        System.out.print("Mảng mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
