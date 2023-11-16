import java.util.Scanner;

public class Guest extends LibrarySystem {
    private static final String GUEST_USERNAME = "khach";

    public static String getGuestUserName() {
        return GUEST_USERNAME;
    }

    public void guestActions(){
        Scanner sc = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        while (true){
            System.out.println("\nMenu Khách");
            System.out.println("1. Tìm Kiếm Sản Phẩm");
            System.out.println("2. Xem Sản Phẩm");
            System.out.println("3. Thoát");
            System.out.print("Nhập Lựa Chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    productManage.searchProduct();
                    super.pressKey();
                    break;
                case 2:
                    productManage.showProduct();
                    super.pressKey();
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
