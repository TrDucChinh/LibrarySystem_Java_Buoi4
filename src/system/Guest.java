package system;

import manage.ProductManage;

import java.util.Scanner;
public class Guest {
    private static final String GUEST_USERNAME = "khach";

    public static String getGuestUserName() {
        return GUEST_USERNAME;
    }

    public void guestActions(){
        Scanner sc = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        while (true){
            System.out.println("\n---------------------------------------");
            System.out.println("|              Menu Khách             |");
            System.out.println("| 1. Tìm Kiếm Sản Phẩm                |");
            System.out.println("| 2. Xem Sản Phẩm                     |");
            System.out.println("| 3. Thoát                            |");
            System.out.println("---------------------------------------");
            System.out.print("Nhập Lựa Chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    productManage.searchProduct();
                    LibrarySystem.pressKey();
                    break;
                case 2:
                    productManage.showProduct();
                    LibrarySystem.pressKey();
                    break;
                case 3:
                    System.out.println("Thoát chế độ Khách!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
