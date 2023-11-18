package showproduct;

import manage.CheckProduct;
import product.*;
import system.LibrarySystem;

public class ShowProductList extends ShowProduct {
    public ShowProductList() {
        System.out.println("------");
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Book) {
                System.out.println("Tên Sản Phẩm: " + product.getName());
                System.out.println("Giá Bán: " + product.getPrice());
                System.out.println("Thương Hiệu: " + product.getBrand());
                System.out.println("Thể Loại: " + ((Book) product).getGenre());
                System.out.println("Tác Giả: " + ((Book) product).getAuthor());
                System.out.println("Nhà Xuất Bản: " + ((Book) product).getPublisher());
                System.out.println("Năm Xuất Bản: " + ((Book) product).getPublishDate());
                System.out.println("Ngôn Ngữ: " + ((Book) product).getLanguage());
                System.out.println("------");
            } else if (product instanceof NoteBook) {
                System.out.println("Tên Sản Phẩm: " + product.getName());
                System.out.println("Giá Bán: " + product.getPrice());
                System.out.println("Thương Hiệu: " + product.getBrand());
                System.out.println("Số Trang: " + ((NoteBook) product).getNumberOfPage());
                System.out.println("Loại: " + ((NoteBook) product).getType());
                System.out.println("Màu Bìa: " + ((NoteBook) product).getColorOfCover());
                System.out.println("Loại Giấy: " + ((NoteBook) product).getPaperType());
                System.out.println("Kích Thước: " + ((NoteBook) product).getSize());
                System.out.println("------");
            } else if (product instanceof Pen) {
                System.out.println("Tên Sản Phẩm: " + product.getName());
                System.out.println("Giá Bán: " + product.getPrice());
                System.out.println("Thương Hiệu: " + product.getBrand());
                System.out.println("Màu Bút: " + ((Pen) product).getColor());
                System.out.println("Chất Liệu: " + ((Pen) product).getMaterial());
                System.out.println("Loại Mực: " + ((Pen) product).getInkColor());
                System.out.println("Độ Mịn: " + ((Pen) product).getSmoothly());
                System.out.println("------");
            } else if (product instanceof Pencil) {
                System.out.println("Tên Sản Phẩm: " + product.getName());
                System.out.println("Giá Bán: " + product.getPrice());
                System.out.println("Thương Hiệu: " + product.getBrand());
                System.out.println("Màu Sắc: " + ((Pencil) product).getColor());
                System.out.println("Chất Liệu: " + ((Pencil) product).getMaterial());
                System.out.println("Độ Cứng: " + ((Pencil) product).getHardness());
                System.out.println("------");
            }
        }
    }

    public ShowProductList(String query) {
        if (CheckProduct.checkInfoQuery(query)) {
            System.out.println("------");
            for (Product product : LibrarySystem.productsList) {
                if (product instanceof Book && CheckProduct.checkInfoBook(product, query)) {
                    System.out.println("Tên Sản Phẩm: " + product.getName());
                    System.out.println("Giá Bán: " + product.getPrice());
                    System.out.println("Thương Hiệu: " + product.getBrand());
                    System.out.println("Thể Loại: " + ((Book) product).getGenre());
                    System.out.println("Tác Giả: " + ((Book) product).getAuthor());
                    System.out.println("Nhà Xuất Bản: " + ((Book) product).getPublisher());
                    System.out.println("Năm Xuất Bản: " + ((Book) product).getPublishDate());
                    System.out.println("Ngôn Ngữ: " + ((Book) product).getLanguage());
                    System.out.println("------");
                } else if (product instanceof NoteBook && CheckProduct.checkInfoNoteBook(product, query)) {
                    System.out.println("Tên Sản Phẩm: " + product.getName());
                    System.out.println("Giá Bán: " + product.getPrice());
                    System.out.println("Thương Hiệu: " + product.getBrand());
                    System.out.println("Số Trang: " + ((NoteBook) product).getNumberOfPage());
                    System.out.println("Loại: " + ((NoteBook) product).getType());
                    System.out.println("Màu Bìa: " + ((NoteBook) product).getColorOfCover());
                    System.out.println("Loại Giấy: " + ((NoteBook) product).getPaperType());
                    System.out.println("Kích Thước: " + ((NoteBook) product).getSize());
                    System.out.println("------");
                } else if (product instanceof Pen && CheckProduct.checkInfoPen(product, query)) {
                    System.out.println("Tên Sản Phẩm: " + product.getName());
                    System.out.println("Giá Bán: " + product.getPrice());
                    System.out.println("Thương Hiệu: " + product.getBrand());
                    System.out.println("Màu Bút: " + ((Pen) product).getColor());
                    System.out.println("Chất Liệu: " + ((Pen) product).getMaterial());
                    System.out.println("Loại Mực: " + ((Pen) product).getInkColor());
                    System.out.println("Độ Mịn: " + ((Pen) product).getSmoothly());
                    System.out.println("------");
                } else if (product instanceof Pencil && CheckProduct.checkInfoPencil(product, query)) {
                    System.out.println("Tên Sản Phẩm: " + product.getName());
                    System.out.println("Giá Bán: " + product.getPrice());
                    System.out.println("Thương Hiệu: " + product.getBrand());
                    System.out.println("Màu Sắc: " + ((Pencil) product).getColor());
                    System.out.println("Chất Liệu: " + ((Pencil) product).getMaterial());
                    System.out.println("Độ Cứng: " + ((Pencil) product).getHardness());
                    System.out.println("------");
                }
            }
        } else {
            System.out.println("Không có sản phẩm này!");
        }
    }


}
