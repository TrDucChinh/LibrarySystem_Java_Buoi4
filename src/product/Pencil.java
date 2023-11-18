package product;

public class Pencil extends Product {
    private String color;
    private String material;
    private String hardness;

    public Pencil(int id, String name, String price, String brand, String color, String material, String hardness) {
        super(id, name, price, brand);
        this.color = color;
        this.material = material;
        this.hardness = hardness;
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

    public void setHardness(String hardness) {
        this.hardness = hardness;
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

    public String getHardness() {
        return hardness;
    }
}
