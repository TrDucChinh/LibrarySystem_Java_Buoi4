public class Pen extends Product {
    private String color;
    private String material;
    private String inkColor;
    private String smoothly;

    public Pen(int id, String name, String price, String brand, String color, String material, String inkColor, String smoothly) {
        super(id, name, price, brand);
        this.color = color;
        this.material = material;
        this.inkColor = inkColor;
        this.smoothly = smoothly;
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(String price) {
        super.setPrice(price);
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setSmoothly(String smoothly) {
        this.smoothly = smoothly;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPrice() {
        return super.getPrice();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getInkColor() {
        return inkColor;
    }

    public String getSmoothly() {
        return smoothly;
    }

    //Check anything



}
