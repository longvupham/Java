package March16;

import java.util.ArrayList;
import java.util.Scanner;

public class ManangementSystem {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Iphone15", 980, 20, "Apple"));
        list.add(new Product("GalaxyS23", 900, 30, "Samsung"));
        list.add(new Product("Xiaomi14", 890, 30, "Xiaomi"));
        list.add(new Product("Reno", 450, 17, "Oppo"));
        while (true) {
            System.out.println("---Menu---" +
                    "\n1. Add new Product" +
                    "\n2. Edit Product" +
                    "\n3. Delete Product" +
                    "\n4. Search by Name" +
                    "\n5. Search by Price Range" +
                    "\n6. Sort by Ascending Price" +
                    "\n7. Sort by Descending Price" +
                    "\n8. Sort by Descending Quantity" +
                    "\n9. Show Product list" +
                    "\n10. Escape");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Add Product: ");
                System.out.println("Product Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Price: ");
                double price = scanner.nextDouble();
                System.out.println("Quantity: ");
                int quantity = scanner.nextInt();
                System.out.println("Brand: ");
                scanner.nextLine();
                String brand = scanner.nextLine();
                list.add(new Product(name, price, quantity, brand));
            }
            ;
            if (choice == 2) {
                System.out.println("Edit Product: ");
                System.out.println("Type the name of product you would like to edit: ");
                scanner.nextLine();
                String productName = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(productName)) {
                        System.out.println("Enter new information product: ");
                        System.out.println("New Product Name: ");
                        String name = scanner.nextLine();
                        System.out.println("New Product Price: ");
                        double price = scanner.nextDouble();
                        System.out.println("New Product Quantity: ");
                        int quantity = scanner.nextInt();
                        System.out.println("New Product Brand: ");
                        scanner.nextLine();
                        String brand = scanner.nextLine();
                        list.get(i).setName(name);
                        list.get(i).setPrice(price);
                        list.get(i).setQuantity(quantity);
                        list.get(i).setBrand(brand);
                        System.out.println("Updated successfully");
                        break;
                    }
                    if (!found) {
                        System.out.println("Product not found!");
                    }
                }
            }
            if (choice == 9) {
                System.out.println("Product list: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }

        }

    }
}

