import java.util.Scanner;

public class ManagePencil {
    Scanner sc = new Scanner(System.in);

    //Thêm Bút Chì
    public void addPencil() {
        System.out.print("Nhập số lượng bút chì muốn thêm: ");
        int numberOfPencil = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfPencil; ++i) {
            int id = (int) (Math.random() * 10000 + 1);
            while (LibrarySystem.markId.containsKey(id)) {
                id = (int) (Math.random() * 10000 + 1);
            }
            LibrarySystem.markId.put(id, true);
            System.out.print("Tên bút chì: ");
            String name = sc.nextLine();
            System.out.print("Giá Bán: ");
            String price = sc.nextLine();
            System.out.print("Thương Hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Màu sắc: ");
            String color = sc.nextLine();
            System.out.print("Chất liệu: ");
            String material = sc.nextLine();
            System.out.print("Độ cứng: ");
            String hardness = sc.nextLine();
            Product newProduct = new Pencil(id, name, price, brand, color, material, hardness);
            LibrarySystem.productsList.add(newProduct);
            System.out.println("Thêm bút chì thành công!");
            if (i < numberOfPencil - 1) {
                System.out.println("Nhập thông tin bút chì tiếp theo: ");
            }
        }
    }

    //Xóa Bút Chì
    public void deletePencil() {
        System.out.print("\nNhập tên bút chì muốn xóa: ");
        String name = sc.nextLine();
        if (CheckProduct.existPencil(name)) {
            System.out.println("Không có bút chì này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllPencil(name);
            System.out.print("\nNhập ID bút chì muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (LibrarySystem.productsList.removeIf(product -> ((product instanceof Pencil) && product.getId() == id))) {
                System.out.println("Xóa bút chì thành công!");
            } else {
                System.out.println("Không tìm thấy ID!");
            }
        }
    }

    //Sửa Bút Chì
    public void updatePencil() {
        System.out.print("\nNhập tên bút chì muốn sửa: ");
        String name = sc.nextLine();
        if (CheckProduct.existPencil(name)) {
            System.out.println("Không có bút chì này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllPencil(name);
            System.out.print("\nNhập ID bút chì muốn sửa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (!CheckProduct.checkIdPencil(id)) {
                System.out.println("Không có ID này!");
                return;
            }
            System.out.println("\n---------------------------------------");
            System.out.println("|              Mục cần sửa            |");
            System.out.println("| 1. Tên sách                         |");
            System.out.println("| 2. Giá bán                          |");
            System.out.println("| 3. Thương hiệu                      |");
            System.out.println("| 4. Màu sắc                          |");
            System.out.println("| 5. Chất liệu                        |");
            System.out.println("| 6. Độ cứng                          |");
            System.out.println("---------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập tên bút chì mới: ");
                                String newName = sc.nextLine();
                                product.setName(newName);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 2:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập giá bán mới: ");
                                String newPrice = sc.nextLine();
                                product.setPrice(newPrice);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 3:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập thương hiệu mới: ");
                                String newBrand = sc.nextLine();
                                product.setBrand(newBrand);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 4:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập màu sắc mới: ");
                                String newColor = sc.nextLine();
                                ((Pencil) product).setColor(newColor);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 5:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập chất liệu mới: ");
                                String newMaterial = sc.nextLine();
                                ((Pencil) product).setMaterial(newMaterial);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 6:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pencil) {
                            if (product.getId() == id) {
                                System.out.print("Nhập độ cứng mới: ");
                                String newHardness = sc.nextLine();
                                ((Pencil) product).setHardness(newHardness);
                                System.out.println("Cập nhật thành công!");
                                return;
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
