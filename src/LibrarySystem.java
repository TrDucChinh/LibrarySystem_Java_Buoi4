import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    public static List<Product> productsList = new ArrayList<>();
    public static HashMap<Integer, Boolean> markId = new HashMap<>();

    public static void pressKey(){
        System.out.print("\nNhấn phím Enter để tiếp tục");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Chào Mừng Đến Với Hệ Thống Thư Viện Của Chính");
        Login login = new Login();
    }
}
