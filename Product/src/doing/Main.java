package doing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddNewObject action = new AddNewObject();
        Product[] listProduct = new Product[5];
        Product p1 = new Product(1, "Iphone15", 2999, 12, "ios 16");
        Product p2 = new Product(2, "Iphone14", 1999, 52, "ios 15");
        Product p3 = new Product(3, "Iphone13", 999, 23, "ios 13");
        Product p4 = new Product(4, "Iphone12", 699, 45, "ios 12");
        Product p5 = new Product(5, "Iphone11", 499, 82, "ios 11");
        listProduct[0] = p1;
        listProduct[1] = p2;
        listProduct[2] = p3;
        listProduct[3] = p4;
        listProduct[4] = p5;
        do {
            System.out.println("Menu product");
            System.out.println("1. Tạo 1 đối tượng Product và thêm vào mảng");
            System.out.println("2. Sửa thông tin 1 đối tượng Product dựa theo id nhập vào");
            System.out.println("3. Xóa 1 đối tương Product khỏi mảng dựa theo id nhập vào");
            System.out.println("4. Hiển thị tất cả các Product có trong mảng");
            System.out.println("5. Hiển thị các Product có giá lớn nhất (price)");
            System.out.println("6. Hiển thị các Product có giá nhỏ nhất (price)");
            System.out.println("7. Hiển thị các Product có số lượng lớn nhất (quantity)");
            System.out.println("8. Hiển thị các Product có số lượng nhỏ nhất (quantity)");
            System.out.println("9. Tính tổng tiền hàng hiện có (tổng của giá x số lượng của tất cả sản phẩm)");
            System.out.println("Chọn tính năng: ");
            int input = scanner.nextInt();
            if (input < 0 || input > 9) {
                System.out.println("Số ko hợp lệ!");
            } else {
                switch (input) {
                    case 1:
                        Product productNew=action.addProduct(scanner);
                        Product[] listProductNew = new Product[listProduct.length+1];
                        for (int i = 0; i < listProduct.length; i++) {
                            listProductNew[i] = listProduct[i];
                        }
                        listProductNew[listProductNew.length-1] = productNew;
                        listProduct=listProductNew;
                        action.display(listProduct);
                        break;
                    case 2:

                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0:
                        System.exit(0);
                }
            }
        } while (true);
    }
}
