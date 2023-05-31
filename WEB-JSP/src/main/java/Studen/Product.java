package Studen;

public class Product {
    private int id;
    private String productName;
    private double diem;
    private String imageUrl;

    public Product(int id, String productName, double diem,String imageUrl) {
        this.id = id;
        this.productName = productName;
        this.diem = diem;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
