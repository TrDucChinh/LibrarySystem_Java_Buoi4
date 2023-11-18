package showproduct;

import manage.CheckProduct;
import product.*;
import system.LibrarySystem;

public class ShowProductTable {
    public ShowProductTable(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-30s%-7s%-14s%-10s%-20s%-15s%-30s|\n","|", "Tên Sản Phẩm", "|","Giá Bán","|", "Thương Hiệu","|", "Thông Tin Thêm");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Book) {
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Thể Loại: " + ((Book) product).getGenre());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Tác Giả: " + ((Book) product).getAuthor());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Nhà Xuất Bản: " + ((Book) product).getPublisher());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Năm Xuất Bản: " + ((Book) product).getPublishDate());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Ngôn Ngữ: " + ((Book) product).getLanguage());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            } else if (product instanceof NoteBook) {
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Số Trang: " + ((NoteBook) product).getNumberOfPage());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại: " + ((NoteBook) product).getType());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Màu Bìa: " + ((NoteBook) product).getColorOfCover());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại Giấy: " + ((NoteBook) product).getPaperType());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Kích Thước: " + ((NoteBook) product).getSize());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            } else if (product instanceof Pen) {
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Màu Bút: " + ((Pen) product).getColor());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Chất Liệu: " + ((Pen) product).getMaterial());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại Mực: " + ((Pen) product).getInkColor());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Độ Mịn: " + ((Pen) product).getSmoothly());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            } else if (product instanceof Pencil) {
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Màu Sắc: " + ((Pencil) product).getColor());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Chất Liệu: " + ((Pencil) product).getMaterial());
                System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Độ Cứng: " + ((Pencil) product).getHardness());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }

    }

    public ShowProductTable(String query){
        if (CheckProduct.checkInfoQuery(query)){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-15s%-30s%-7s%-14s%-10s%-20s%-15s%-30s|\n","|", "Tên Sản Phẩm", "|","Giá Bán","|", "Thương Hiệu","|", "Thông Tin Thêm");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            for (Product product : LibrarySystem.productsList) {
                if (product instanceof Book && CheckProduct.checkInfoBook(product, query)) {
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Thể Loại: " + ((Book) product).getGenre());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Tác Giả: " + ((Book) product).getAuthor());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Nhà Xuất Bản: " + ((Book) product).getPublisher());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Năm Xuất Bản: " + ((Book) product).getPublishDate());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Ngôn Ngữ: " + ((Book) product).getLanguage());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                } else if (product instanceof NoteBook && CheckProduct.checkInfoNoteBook(product, query)) {
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Số Trang: " + ((NoteBook) product).getNumberOfPage());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại: " + ((NoteBook) product).getType());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Màu Bìa: " + ((NoteBook) product).getColorOfCover());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại Giấy: " + ((NoteBook) product).getPaperType());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Kích Thước: " + ((NoteBook) product).getSize());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                } else if (product instanceof Pen && CheckProduct.checkInfoPen(product, query)) {
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Màu Bút: " + ((Pen) product).getColor());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Chất Liệu: " + ((Pen) product).getMaterial());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Loại Mực: " + ((Pen) product).getInkColor());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Độ Mịn: " + ((Pen) product).getSmoothly());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                } else if (product instanceof Pencil && CheckProduct.checkInfoPencil(product, query)) {
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", product.getName(), "|", product.getPrice(), "|", product.getBrand(), "| -", "Màu Sắc: " + ((Pencil) product).getColor());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Chất Liệu: " + ((Pencil) product).getMaterial());
                    System.out.printf("%-2s%-43s%-2s%-19s%-2s%-28s%-4s%-41s|\n", "|", "", "|", "", "|", "", "| -", "Độ Cứng: " + ((Pencil) product).getHardness());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }
    }

}
