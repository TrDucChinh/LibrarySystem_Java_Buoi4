import java.util.Scanner;

public class ManageNoteBook extends NoteBook {
    Scanner sc = new Scanner(System.in);
    //Thêm Vở
    public void addNoteBook() {
        System.out.print("\nNhập số vở muốn thêm: ");
        int numberOfNoteBook = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfNoteBook; ++i) {
            int id = (int) (Math.random() * 10000 + 1);
            while (LibrarySystem.markId.containsKey(id)) {
                id = (int) (Math.random() * 10000 + 1);
            }
            LibrarySystem.markId.put(id, true);
            System.out.print("Tên Vở: ");
            String name = sc.nextLine();
            System.out.print("Giá Bán: ");
            String price = sc.nextLine();
            System.out.print("Thương Hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Số Trang: ");
            String numberOfPage = sc.nextLine();
            System.out.print("Loại Vở: ");
            String type = sc.nextLine();
            System.out.print("Màu Bìa: ");
            String colorOfCover = sc.nextLine();
            System.out.print("Chất liệu giấy: ");
            String paperType = sc.nextLine();
            System.out.print("Kích thước: ");
            String size = sc.nextLine();
            Product newProduct = new NoteBook(id, name, price, brand, numberOfPage, type, colorOfCover, paperType, size);
            LibrarySystem.productsList.add(newProduct);
            System.out.println("Thêm vở thành công!");
            if (i < numberOfNoteBook - 1) {
                System.out.println("Nhập thông tin vở tiếp theo: ");
            }
        }
    }
    //Xóa Vở
    public void deleteNoteBook(){
        System.out.print("\nNhập tên vở muốn xóa: ");
        String name = sc.nextLine();
        if (CheckProduct.existNoteBook(name)){
            System.out.println("Không có vở này!");
        } else{
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllNoteBook(name);
            System.out.print("\nNhập ID vở muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (LibrarySystem.productsList.removeIf(product -> ((product instanceof NoteBook) && product.getId() == id))){
                System.out.println("Xóa vở thành công!");
            } else{
                System.out.println("Không tìm thấy ID!");
            }
        }
    }

    //Sửa Vở
    public void updateNoteBook(){
        System.out.print("\nNhập tên vở muốn sửa: ");
        String name = sc.nextLine();
        if (CheckProduct.existNoteBook(name)) {
            System.out.println("Không có vở này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllNoteBook(name);
            System.out.print("\nNhập ID vở muốn sửa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (!CheckProduct.checkIdNoteBook(id)) {
                System.out.println("Không có ID này!");
                return;
            }
            System.out.println("Chọn mục cần sửa: ");
            System.out.println("1. Tên vở");
            System.out.println("2. Giá bán");
            System.out.println("3. Thương hiệu");
            System.out.println("4. Số trang");
            System.out.println("5. Loại vở");
            System.out.println("6. Màu bìa");
            System.out.println("7. Chất liệu giấy");
            System.out.println("8. Kích thước");
            System.out.print("Nhập lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập tên vở mới: ");
                                String newName = sc.nextLine();
                                product.setName(newName);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 2:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập giá bán mới: ");
                                String newPrice = sc.nextLine();
                                product.setPrice(newPrice);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 3:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập thương hiệu mới: ");
                                String newBrand = sc.nextLine();
                                product.setBrand(newBrand);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 4:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập số trang mới: ");
                                String newNumberOfPage = sc.nextLine();
                                ((NoteBook) product).setNumberOfPage(newNumberOfPage);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 5:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập loại vở mới: ");
                                String newType = sc.nextLine();
                                ((NoteBook) product).setType(newType);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 6:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập màu bìa mới: ");
                                String newColorOfCover = sc.nextLine();
                                ((NoteBook) product).setColorOfCover(newColorOfCover);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 7:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập chất liệu giấy mới: ");
                                String newPaperType = sc.nextLine();
                                ((NoteBook) product).setPaperType(newPaperType);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                case 8:
                    for (Product product : LibrarySystem.productsList){
                        if (product instanceof NoteBook){
                            if (product.getId() == id){
                                System.out.print("Nhập kích thước mới: ");
                                String newSize = sc.nextLine();
                                ((NoteBook) product).setSize(newSize);
                                System.out.println("Cập nhật thành công!");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại!");
            }
        }
    }
}
