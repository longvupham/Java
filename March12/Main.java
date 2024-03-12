package March12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Official> list = new ArrayList<>();
        list.add(new Official("NgocAnh", 25, "Female", "HCM"));
        list.add(new Official("HoangAnh", 35, "Male", "VungTau"));
        list.add(new Official("NhuNgoc", 18, "Female", "BenTre"));
        while (true) {
            System.out.println("---Menu---" +
                    "\n1. Add new Official" +
                    "\n2. Search Fullname" +
                    "\n3. Show Official's list" +
                    "\n4. Escape");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Add information: ");
                System.out.println("FullName: ");
                scanner.nextLine();
                String fullName = scanner.nextLine();
                System.out.println("Age: ");
                int age = scanner.nextInt();
                System.out.println("Gender: ");
                scanner.nextLine();
                String gender = scanner.nextLine();
                System.out.println("Address: ");
                String address = scanner.nextLine();
                list.add(new Official(fullName, age, gender, address));
            }
            if (choice == 2) {
                System.out.println("Type FullName: ");
                scanner.nextLine();
                String fullName = scanner.nextLine();
                boolean found=false;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getFullName().equals(fullName)) {
                        System.out.println(list.get(i));
                    }
                    if (found=true){
                        System.out.println("FullName's not available");
                        break;
                    }
                }
            }
            if (choice == 3) {
                System.out.println("Official's list: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
