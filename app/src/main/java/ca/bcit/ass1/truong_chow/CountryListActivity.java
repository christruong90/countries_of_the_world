package ca.bcit.ass1.truong_chow;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

import ca.bcit.ass1.truong_chow.model.Country;

public class CountryListActivity extends ListActivity {

    ArrayList<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        countries = (ArrayList<Country>) Objects.requireNonNull(getIntent().getExtras()).getSerializable("countries");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, R.layout.region_row, R.id.region, getCountryNames(Objects.requireNonNull(countries)));

        setListAdapter(adapter);
    }

    /**
     * Retrieves country names to display in ListView.
     *
     * @return the list of country names
     */
    private String[] getCountryNames(ArrayList<Country> countries) {

        ArrayList<String> countryNames = new ArrayList<>();

        for (Country c : countries) {
            countryNames.add(c.getName());
        }

        return countryNames.toArray(new String[0]);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // get selected country
        Country selected = countries.get(position);

        Intent intent = new Intent(getBaseContext(), CountryDetailActivity.class);
        intent.putExtra("country", selected);
        startActivity(intent);
    }
}
