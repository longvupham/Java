import java.util.Scanner;

public class Hamjs {
    public static void main(String[] args) {
        // viết 1 hàm nhận vào a và b, trả về tích các số từ a đến b, gọi hàm
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = sc.nextInt();
        System.out.println("Input B: ");
        int b = sc.nextInt();
        if (a <= b) {
            return;
        };

    }
}
