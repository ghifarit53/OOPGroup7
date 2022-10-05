public class Snack extends Food {
    public float weight;

    public Snack(String ID, String name, int price) {
        super(ID, name, price);
        this.weight = 0.5F;
    }

    public Snack(String ID, String name, float weight, int price) {
        super(ID, name, weight, price);
    }

    private int stock;

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void serve() {
        System.out.println(this.name + " served inside a plastic wrap");
    }
}
