import java.util.Scanner;

public class ProductManage {
    Scanner sc = new Scanner(System.in);
    //Thêm Sản Phẩm
    public void addProduct() {
        System.out.println("\nSản phẩm muốn thêm: ");
        System.out.println("1. Thêm Sách");
        System.out.println("2. Thêm Vở");
        System.out.println("3. Thêm Bút Mực");
        System.out.println("4. Thêm Bút Chì");
        System.out.print("Nhập lựa chọn: ");
        byte choice = Byte.parseByte(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    ManageBook manageBook = new ManageBook();
                    manageBook.addBook();
                    return;
                case 2:
                    ManageNoteBook manageNoteBook = new ManageNoteBook();
                    manageNoteBook.addNoteBook();
                    return;
                case 3:
                    ManagePen managePen = new ManagePen();
                    managePen.addPen();
                    return;
                case 4:
                    ManagePencil managePencil = new ManagePencil();
                    managePencil.addPencil();
                    return;
                default:
                    System.out.print("Nhập sai, vui lòng nhập lại: ");
                    choice = Byte.parseByte(sc.nextLine());
            }
        }
    }
    //Xóa Sản Phẩm
    public void deleteProduct() {
        if (LibrarySystem.productsList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong thư viện");
            return;
        }
        System.out.println("\nSản phẩm muốn xóa: ");
        System.out.println("1. Xóa Sách");
        System.out.println("2. Xóa Vở");
        System.out.println("3. Xóa Bút Mực");
        System.out.println("4. Xóa Bút Chì");
        System.out.print("Nhập lựa chọn: ");
        byte choice = Byte.parseByte(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    ManageBook manageBook = new ManageBook();
                    manageBook.deleteBook();
                    return;
                case 2:
                    ManageNoteBook manageNoteBook = new ManageNoteBook();
                    manageNoteBook.deleteNoteBook();
                    return;
                case 3:
                    ManagePen managePen = new ManagePen();
                    managePen.deletePen();
                    return;
                case 4:
                    ManagePencil managePencil = new ManagePencil();
                    managePencil.deletePencil();
                    return;
                default:
                    System.out.print("Nhập sai, vui lòng nhập lại: ");
                    choice = Byte.parseByte(sc.nextLine());
            }
        }
    }
    //Cập Nhật Sản Phẩm
    public void updateProduct(){
        if (LibrarySystem.productsList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong thư viện");
            return;
        }
        System.out.println("\nSản phẩm muốn cập nhật: ");
        System.out.println("1. Cập nhật Sách");
        System.out.println("2. Cập nhật Vở");
        System.out.println("3. Cập nhật Bút Mực");
        System.out.println("4. Cập nhật Bút Chì");
        System.out.print("Nhập lựa chọn: ");
        byte choice = Byte.parseByte(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    ManageBook manageBook = new ManageBook();
                    manageBook.updateBook();
                    return;
                case 2:
                    ManageNoteBook manageNoteBook = new ManageNoteBook();
                    manageNoteBook.updateNoteBook();
                    return;

                case 3:
                    ManagePen managePen = new ManagePen();
                    managePen.updatePen();
                    return;
                case 4:
                    ManagePencil managePencil = new ManagePencil();
                    managePencil.updatePencil();
                    return;
                default:
                    System.out.print("Nhập sai, vui lòng nhập lại: ");
                    choice = Byte.parseByte(sc.nextLine());
            }
        }
    }
    //Tìm Kiếm Sản Phẩm Theo Truy Vấn Bất Kì
    public void searchProduct(){
        if (LibrarySystem.productsList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong thư viện");
            return;
        }
        System.out.print("Nhập Truy Vấn: ");
        String query = sc.nextLine();
        System.out.println("Chọn dạng hiển thị: ");
        System.out.println("1. Hiển thị theo danh sách");
        System.out.println("2. Hiển thị theo bảng");
        System.out.print("Nhập lựa chọn: ");
        byte choice = Byte.parseByte(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("\nKết quả tìm kiếm: ");
                    ShowProductList showProductList = new ShowProductList(query);
                    return;
                case 2:
                    System.out.println("\nKết quả tìm kiếm: ");
                    ShowProductTable showProductTable = new ShowProductTable(query);
                    return;
                default:
                    System.out.print("Nhập sai, vui lòng nhập lại: ");
                    choice = Byte.parseByte(sc.nextLine());
            }
        }
    }

    public void showProduct(){
        if (LibrarySystem.productsList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong thư viện");
            return;
        }
        System.out.println("Chọn dạng hiển thị: ");
        System.out.println("1. Hiển thị theo danh sách");
        System.out.println("2. Hiển thị theo bảng");
        System.out.print("Nhập lựa chọn: ");
        byte choice = Byte.parseByte(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("\nDanh Sách Sản Phẩm: ");
                    ShowProductList showProductList = new ShowProductList();
                    return;
                case 2:
                    System.out.println("\nBảng Sản Phẩm: ");
                    ShowProductTable showProductTable = new ShowProductTable();
                    return;
                default:
                    System.out.print("Nhập sai, vui lòng nhập lại: ");
                    choice = Byte.parseByte(sc.nextLine());
            }
        }
    }


}
