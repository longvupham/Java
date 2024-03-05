package Dahinh;

import java.util.Scanner;

public class Maindahinh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("- Nhập x ");
        float x = scanner.nextFloat();
        System.out.println("- Nhập y ");
        float y = scanner.nextFloat();
        Point2D point2D=new Point2D(x,y);
        System.out.println(point2D);
    }
}

