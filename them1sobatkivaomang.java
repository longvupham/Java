import java.util.Scanner;

public class them1sobatkivaomang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Nhập số cần thêm: ");
        int x = scanner.nextInt();
        System.out.println("Vị trí muốn thêm x vào: ");
        int vitri=scanner.nextInt();
        int[]newArr=new int[arr.length+1];
        for (int i = 0; i < vitri; i++) {
            newArr[i]=arr[i];
        }
        newArr[vitri]=x;
        for (int i = vitri; i <arr.length ; i++) {
            newArr[i+1]=arr[i];
        }
        arr=newArr;
        System.out.println("Mảng mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
