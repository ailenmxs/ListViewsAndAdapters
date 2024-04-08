package co.edu.unipiloto.starbuzz;

public class Stores {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Stores[] stores = {
            new Stores("Mugs", "Customized to your liking",
                    R.drawable.mugs),
            new Stores("Ground coffee", "Freshly ground and very delicious",
                    R.drawable.coffee),
            new Stores("Candies", "Coffee-flavored chews",
                    R.drawable.candies)
    };
    private Stores(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
