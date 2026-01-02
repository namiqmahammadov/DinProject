package imtahan1;

public class ElectronicsProduct {
    private  Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ElectronicsProduct(Integer id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    public void finalPrice(Integer discount){
         price= price-((price*discount)/100);
        System.out.println(price);
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
