package module14.produtos.entities;

public class UserProduct extends Product{
    private String manufactureDate;

    public UserProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + manufactureDate +")";
    }

}
