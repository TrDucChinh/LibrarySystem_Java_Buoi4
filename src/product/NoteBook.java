package product;

public class NoteBook extends Product {
    private String numberOfPage;
    private String type;
    private String colorOfCover;
    private String paperType;
    private String size;

    public NoteBook(int id, String name, String price, String brand, String numberOfPage, String type, String colorOfCover, String paperType, String size) {
        super(id, name, price, brand);
        this.numberOfPage = numberOfPage;
        this.type = type;
        this.colorOfCover = colorOfCover;
        this.paperType = paperType;
        this.size = size;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColorOfCover(String colorOfCover) {
        this.colorOfCover = colorOfCover;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public String getType() {
        return type;
    }

    public String getColorOfCover() {
        return colorOfCover;
    }

    public String getPaperType() {
        return paperType;
    }

    public String getSize() {
        return size;
    }

}
