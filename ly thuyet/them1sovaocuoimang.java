package ly

import java.util.Scanner;

public class them1sovaocuoimang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.print("Nhập số cần thêm: ");
        int x = scanner.nextInt();
        int[]newArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        };
        newArr[arr.length]=x;
        arr=newArr;
        System.out.println("Mảng mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
