package ly

import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng 1
        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        // Nhập giá trị cho các phần tử của mảng 1
        System.out.println("Nhập giá trị cho các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Nhập kích thước của mảng 2
        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Nhập giá trị cho các phần tử của mảng 2
        System.out.println("Nhập giá trị cho các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 có kích thước là tổng của kích thước mảng 1 và mảng 2
        int[] array3 = new int[size1 + size2];

        // Sao chép các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Sao chép các phần tử của mảng 2 vào mảng 3, tính từ vị trí cuối cùng của mảng 3
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng 3
        System.out.println("Mảng 3 sau khi gộp mảng 1 và mảng 2:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
