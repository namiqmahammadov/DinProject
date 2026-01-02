package imtahan1;

public class WashingMachine extends  ElectronicsProduct{
    private Integer warrantyPeriod;

    public WashingMachine(Integer id, Double price, String name ,Integer warrantyPeriod) {
        super(id, price, name);
        this.warrantyPeriod=warrantyPeriod;

    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "warrantyPeriod=" + warrantyPeriod +
                '}';
    }

    public void warranty(Integer period){
        warrantyPeriod+=period;
        System.out.println(warrantyPeriod);

    }
}
