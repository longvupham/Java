package ly

public class Mangb1 {
    public static void main(String[] args) {
        float[] a = {1.2f, 2, 3, 5, 6.2f};
        float sum = 0;
        float max = a[0];
        float mul = 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            mul *= a[i];
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("tổng các số trong mảng: " + sum);
        System.out.println("tích các số trong mảng: " + mul);
        System.out.println("Số lớn nhất trong mảng: " + max);
    }
}
