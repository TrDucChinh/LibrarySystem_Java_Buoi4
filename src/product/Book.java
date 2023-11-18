package product;

public class Book extends Product {
    private String genre; // Thể Loại
    private String author; // Tác Giả
    private String publisher; // Nhà Xuất Bản
    private String publishDate; // Ngày Xuất Bản
    private String language; // Ngôn Ngữ

    public Book(int id, String name, String price, String brand, String genre, String author, String publisher, String publishDate, String language) {
        super(id, name, price, brand);
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.language = language;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setGenre(String gerne) {
        this.genre = gerne;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getLanguage() {
        return language;
    }

}
