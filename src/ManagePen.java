import java.util.Scanner;

public class ManagePen {
    Scanner sc = new Scanner(System.in);

    //Thêm Bút
    public void addPen() {
        System.out.print("\nNhập số lượng bút muốn thêm: ");
        int numberOfPen = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfPen; ++i) {
            int id = (int) (Math.random() * 10000 + 1);
            while (LibrarySystem.markId.containsKey(id)) {
                id = (int) (Math.random() * 10000 + 1);
            }
            LibrarySystem.markId.put(id, true);
            System.out.print("Tên bút: ");
            String name = sc.nextLine();
            System.out.print("Giá bút: ");
            String price = sc.nextLine();
            System.out.print("Thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Màu sắc: ");
            String color = sc.nextLine();
            System.out.print("Chất liệu bút: ");
            String material = sc.nextLine();
            System.out.print("Loại mực: ");
            String inkColor = sc.nextLine();
            System.out.print("Độ mịn: ");
            String smoothly = sc.nextLine();
            Product newProduct = new Pen(id, name, price, brand, color, material, inkColor, smoothly);
            LibrarySystem.productsList.add(newProduct);
            System.out.println("Thêm bút thành công!");
            if (i < numberOfPen - 1) {
                System.out.println("Nhập thông tin bút tiếp theo: ");
            }
        }
    }

    //Xóa Bút
    public void deletePen() {
        System.out.print("\nNhập tên bút muốn xóa: ");
        String name = sc.nextLine();
        if (CheckProduct.existPen(name)) {
            System.out.println("Không có bút này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllPen(name);
            System.out.print("\nNhập ID bút muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (LibrarySystem.productsList.removeIf(product -> ((product instanceof Pen) && product.getId() == id))) {
                System.out.println("Xóa bút thành công!");
            } else {
                System.out.println("Không tìm thấy ID!");
            }
        }
    }

    //Sửa Bút
    public void updatePen() {
        System.out.print("\nNhập tên bút muốn sửa: ");
        String name = sc.nextLine();
        if (CheckProduct.existPen(name)) {
            System.out.println("Không có bút này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllPen(name);
            System.out.print("\nNhập ID bút muốn sửa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (!CheckProduct.checkIdPen(id)) {
                System.out.println("Không có ID này!");
                return;
            }
            System.out.println("\n---------------------------------------");
            System.out.println("|              Mục cần sửa            |");
            System.out.println("| 1. Tên sách                         |");
            System.out.println("| 2. Giá bán                          |");
            System.out.println("| 3. Thương hiệu                      |");
            System.out.println("| 4. Màu bút                          |");
            System.out.println("| 5. Chất liệu bút                    |");
            System.out.println("| 6. Loại mực                         |");
            System.out.println("| 7. Độ mịn                           |");
            System.out.println("---------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập tên bút mới: ");
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
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập giá bút mới: ");
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
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập thương hiệu bút mới: ");
                                String newBrand = sc.nextLine();
                                product.setBrand(newBrand);
                                System.out.println("Cập nhât thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 4:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập màu bút mới: ");
                                String newColor = sc.nextLine();
                                ((Pen) product).setColor(newColor);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 5:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập chất liệu bút mới: ");
                                String newMaterial = sc.nextLine();
                                ((Pen) product).setMaterial(newMaterial);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 6:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập loại mực mới: ");
                                String newInkColor = sc.nextLine();
                                ((Pen) product).setInkColor(newInkColor);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 7:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Pen) {
                            if (product.getId() == id) {
                                System.out.print("Nhập độ mịn mới: ");
                                String newSmoothly = sc.nextLine();
                                ((Pen) product).setSmoothly(newSmoothly);
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




