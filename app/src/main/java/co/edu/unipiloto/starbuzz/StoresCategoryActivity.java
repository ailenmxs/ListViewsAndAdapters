package co.edu.unipiloto.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoresCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores_category);
        ArrayAdapter<Stores> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Stores.stores);
        ListView listStores = (ListView) findViewById(R.id.list_stores);
        listStores.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listStores,
                                            View itemView,
                                            int position,
                                            long id) {
                        Intent intent = new Intent(StoresCategoryActivity.this, StoresActivity.class);
                        intent.putExtra(StoresActivity.EXTRA_STORESID, (int) id);
                        startActivity(intent);
                    }
                };
        listStores.setOnItemClickListener(itemClickListener);
    }
}