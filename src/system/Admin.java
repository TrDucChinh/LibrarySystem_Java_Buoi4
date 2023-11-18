package system;

import manage.ProductManage;

import java.util.Scanner;

public class Admin {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    public static String getAdminUserName() {
        return ADMIN_USERNAME;
    }

    public static String getAdminPassWord() {
        return ADMIN_PASSWORD;
    }

    public void adminActions() {
        Scanner sc = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        while (true) {
            System.out.println("\n---------------------------------------");
            System.out.println("|              Menu system.Admin             |");
            System.out.println("| 1. Thêm Sản Phẩm                    |");
            System.out.println("| 2. Xóa Sản Phẩm                     |");
            System.out.println("| 3. Cập Nhật Sản Phẩm                |");
            System.out.println("| 4. Tìm Kiếm Sản Phẩm                |");
            System.out.println("| 5. Xem Sản Phẩm                     |");
            System.out.println("| 6. Thoát                            |");
            System.out.println("---------------------------------------");
            System.out.print("Nhập Lựa Chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    productManage.addProduct();
                    LibrarySystem.pressKey();
                    break;
                case 2:
                    productManage.deleteProduct();
                    LibrarySystem.pressKey();
                    break;
                case 3:
                    productManage.updateProduct();
                    LibrarySystem.pressKey();
                    break;

                case 4:
                   productManage.searchProduct();
                    LibrarySystem.pressKey();
                    break;
                case 5:
                    productManage.showProduct();
                    LibrarySystem.pressKey();
                    break;
                case 6:
                    System.out.println("Thoát chế độ system.Admin trở về chế độ Khách!!");
                    Guest guest = new Guest();
                    guest.guestActions();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
