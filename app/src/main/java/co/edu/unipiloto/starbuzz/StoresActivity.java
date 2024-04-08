package co.edu.unipiloto.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoresActivity extends AppCompatActivity {

    public static final String EXTRA_STORESID = "storesId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        int storesId = (Integer)getIntent().getExtras().get(EXTRA_STORESID);
        Stores stores = Stores.stores[storesId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(stores.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(stores.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(stores.getImageResourceId());
        photo.setContentDescription(stores.getName());
    }
}
