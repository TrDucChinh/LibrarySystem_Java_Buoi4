public class ShowProduct {
    // ShowBook
    private void showTitleBookList() {
        System.out.printf("%-6s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Tên Sách", "Giá", "Thương Hiệu", "Thể Loại", "Tác Giả", "Nhà Xuất Bản", "Ngày Xuất Bản", "Ngôn Ngữ");
    }

    private void showOneBook(Product product) {
        System.out.printf("%-6d%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", product.getId(), product.getName(), product.getPrice(), product.getBrand(), ((Book) product).getGenre(), ((Book) product).getAuthor(), ((Book) product).getPublisher(), ((Book) product).getPublishDate(), ((Book) product).getLanguage());
    }

    public void showAllBook(String name) {
        this.showTitleBookList();
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Book) {
                if (CheckProduct.compareName(product, name)) {
                    this.showOneBook(product);
                }
            }
        }
    }

    //ShowPen
    public void showTitlePenList() {
        System.out.printf("%-6s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Tên Bút", "Giá Bán", "Thương Hiệu", "Màu Bút", "Chất Liệu", "Loại Mực", "Độ Mịn");
    }

    public void showOnePen(Product product) {
        System.out.printf("%-6d%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", product.getId(), product.getName(), product.getPrice(), product.getBrand(), ((Pen) product).getColor(), ((Pen) product).getMaterial(), ((Pen) product).getInkColor(), ((Pen) product).getSmoothly());
    }

    public void showAllPen(String query) {
        this.showTitlePenList();
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Pen && CheckProduct.compareName(product, query)) {
                this.showOnePen(product);
            }
        }
    }

    //ShowPencil
    public void showTitlePencilList(){
        System.out.printf("%-6s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Tên Bút Chì", "Giá Bán", "Thương Hiệu", "Màu Sắc", "Chất Liệu", "Độ Cứng");
    }

    public void showOnePencil(Product product){
        System.out.printf("%-6d%-20s%-20s%-20s%-20s%-20s%-20s\n", product.getId(), product.getName(), product.getPrice(), product.getBrand(), ((Pencil) product).getColor(), ((Pencil) product).getMaterial(), ((Pencil) product).getHardness());
    }

    public void showAllPencil(String query){
        this.showTitlePencilList();
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Pencil && CheckProduct.compareName(product, query)) {
                this.showOnePencil(product);
            }
        }
    }
    //ShowNoteBook

    public void showTitleNoteBook(){
        System.out.printf("%-6s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Tên Sách", "Giá Bán", "Thương Hiệu", "Số Trang", "Loại", "Màu Bìa", "Loại Giấy", "Kích Thước");
    }
    public void showOneNoteBook(Product product){
        System.out.printf("%-6d%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", product.getId(), product.getName(), product.getPrice(), product.getBrand(), ((NoteBook) product).getNumberOfPage(), ((NoteBook) product).getType(), ((NoteBook) product).getColorOfCover(), ((NoteBook) product).getPaperType(), ((NoteBook) product).getSize());
    }

    public void showAllNoteBook(String query){
        this.showTitleNoteBook();
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof NoteBook && CheckProduct.compareName(product, query)) {
                this.showOneNoteBook(product);
            }
        }
    }

}
