package doing;

import java.util.Scanner;

public class AddNewObject {
    public void display(Product[] arr){
        for (Product value: arr
             ) {
            System.out.println(value);
        }
    }
    public Product addProduct(Scanner scanner){
        System.out.println("Nhap vao ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao name");
        String name = scanner.nextLine();
        System.out.println(" Nhap vao price");
        float price = scanner.nextFloat();
        System.out.println("Nhap vao so luong: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao mo ta:");
        String description = scanner.nextLine();
        Product product = new Product(id,name,price,quantity,description);
        return product;
    }
}
