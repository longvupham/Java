import java.util.Scanner;

public class arr1arr2thanharr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng thứ 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Nhập giá trị phần tử trong mảng 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + ": ");
            arr1[i]=sc.nextInt();
        }
        System.out.print("Nhập kích thước mảng thứ 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Nhập giá trị phần tử trong mảng 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + ": ");
            arr2[i]=sc.nextInt();
        }
        int[]arr3=new int[size1+size2];
        for (int i = 0; i < size1; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr3[size1+i]=arr2[i];
        }
        System.out.println("Mảng 3 là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
    }
}
