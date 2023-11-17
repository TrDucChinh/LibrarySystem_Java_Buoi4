import java.util.Scanner;

public class ManageBook {
    Scanner sc = new Scanner(System.in);

    //Thêm Sách
    public void addBook() {
        System.out.print("\nNhập số lượng sách muốn thêm: ");
        int numberOfBook = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfBook; ++i) {
            int id = (int) (Math.random() * 10000 + 1);
            while (LibrarySystem.markId.containsKey(id)) {
                id = (int) (Math.random() * 10000 + 1);
            }
            LibrarySystem.markId.put(id, true);
            System.out.print("Tên sách: ");
            String name = sc.nextLine();
            System.out.print("Giá bán: ");
            String price = sc.nextLine();
            System.out.print("Thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Thể loại: ");
            String genre = sc.nextLine();
            System.out.print("Tác giả: ");
            String author = sc.nextLine();
            System.out.print("Nhà xuất bản: ");
            String publisher = sc.nextLine();
            System.out.print("Năm xuất bản: ");
            String publishDate = sc.nextLine();
            System.out.print("Ngôn ngữ: ");
            String language = sc.nextLine();
            Product newProduct = new Book(id, name, price, brand, genre, author, publisher, publishDate, language);
            LibrarySystem.productsList.add(newProduct);
            System.out.println("Thêm sách thành công!");
            if (i < numberOfBook - 1) {
                System.out.println("\nNhập thông tin cuốn sách tiếp theo");
            }
        }
    }

    //Xóa Sách
    public void deleteBook() {
        System.out.print("\nNhập tên sách muốn xóa: ");
        String name = sc.nextLine();

        if (CheckProduct.existBook(name)) {
            System.out.println("Không có cuốn sách này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllBook(name);
            System.out.print("\nNhập ID sách muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            if (LibrarySystem.productsList.removeIf(product -> ((product instanceof Book) && product.getId() == id))) {
                System.out.println("Xóa sách thành công!");
            } else {
                System.out.println("Không tìm thấy ID!");
            }
        }
    }

    //Cập Nhật Sách
    public void updateBook() {
        System.out.print("\nNhập tên sách muốn sửa: ");
        String name = sc.nextLine();
        if (CheckProduct.existBook(name)) {
            System.out.println("Không có cuốn sách này!");
        } else {
            ShowProduct showProduct = new ShowProduct();
            showProduct.showAllBook(name);
            System.out.print("\nNhập ID sách muốn cập nhật: ");
            int id = Integer.parseInt(sc.nextLine());
            if (!CheckProduct.checkIdBook(id)) {
                System.out.println("Không có ID này!");
                return;
            }

            System.out.println("\n---------------------------------------");
            System.out.println("|              Mục cần sửa            |");
            System.out.println("| 1. Tên sách                         |");
            System.out.println("| 2. Giá bán                          |");
            System.out.println("| 3. Thương hiệu                      |");
            System.out.println("| 4. Thể loại                         |");
            System.out.println("| 5. Tác giả                          |");
            System.out.println("| 6. Nhà xuất bản                     |");
            System.out.println("| 7. Năm xuất bản                     |");
            System.out.println("| 8. Ngôn ngữ                         |");
            System.out.println("---------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập tên sách mới: ");
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
                        if (product instanceof Book) {
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
                        if (product instanceof Book) {
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
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập thể loại mới: ");
                                String newGenre = sc.nextLine();
                                ((Book) product).setGenre(newGenre);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 5:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập tác giả mới: ");
                                String newAuthor = sc.nextLine();
                                ((Book) product).setAuthor(newAuthor);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 6:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập nhà xuất bản mới: ");
                                String newPublisher = sc.nextLine();
                                ((Book) product).setPublisher(newPublisher);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 7:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập ngày xuất bản mới: ");
                                String newPublishDate = sc.nextLine();
                                ((Book) product).setPublishDate(newPublishDate);
                                System.out.println("Cập nhật thành công!");
                                return;
                            }
                        }
                    }
                    break;
                case 8:
                    for (Product product : LibrarySystem.productsList) {
                        if (product instanceof Book) {
                            if (product.getId() == id) {
                                System.out.print("Nhập ngôn ngữ mới: ");
                                String newLanguage = sc.nextLine();
                                ((Book) product).setLanguage(newLanguage);
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