package co.edu.unipiloto.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.foods[foodId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}