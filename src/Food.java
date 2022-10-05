/*
Group 6 : Mr. John wants to create a canteen information system.
He has three types of food, i.e snacks, seafood, noodle.
Each food has different price. Help Mr. John to create the system.
- casting (diskon dibulatin ke bawah, cast ke integer)
- beberapa jenis makanan memiliki default weight, jika tidak dispesifikasikan
  akan fallback ke weight tsb.
*/

public class Food {
    public String ID;
    public String name;
    public float weight;
    public int price;

    public Food(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Food(String ID, String name, float weight, int price) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    private int stock = 10;


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void serve() {
        System.out.println("Food is served");
    }
}
