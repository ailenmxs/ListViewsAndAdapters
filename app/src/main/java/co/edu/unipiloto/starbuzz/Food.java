package co.edu.unipiloto.starbuzz;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] foods = {
            new Food("Sandwich", "With ham, cheese and vegetables. Delicious!",
                    R.drawable.sandwich),
            new Food("Bread", "Fresh, crispy and soft",
                    R.drawable.bread),
            new Food("Donuts", "Chocolate, strawberry or blackberry",
                    R.drawable.donuts)
    };
    private Food(String name, String description, int imageResourceId){
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

