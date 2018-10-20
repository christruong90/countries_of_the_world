package ca.bcit.ass1.truong_chow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahmadrosid.svgloader.SvgLoader;

import java.util.List;
import java.util.Objects;

import ca.bcit.ass1.truong_chow.model.Country;

public class CountryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        Country c = (Country) Objects.requireNonNull(getIntent().getExtras()).getSerializable("country");

        // set flag
        ImageView flag = findViewById(R.id.c_flag);

        SvgLoader.pluck()
                .with(this)
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load(Objects.requireNonNull(c).getFlag(), flag);

        // set name
        TextView name = findViewById(R.id.c_name);
        String newName = "Name: " + Objects.requireNonNull(c).getName();
        name.setText(newName);

        // set capital
        TextView capital = findViewById(R.id.c_capital);
        String newCapital = "Capital: " + c.getCapital();
        capital.setText(newCapital);

        // set region
        TextView region = findViewById(R.id.c_region);
        String newRegion = "Region: " + c.getRegion();
        region.setText(newRegion);

        // set population
        TextView population = findViewById(R.id.c_population);
        String newPopulation = "Population: " + String.valueOf(c.getPopulation());
        population.setText(newPopulation);

        // set area
        TextView area = findViewById(R.id.c_area);
        String newArea = "Area: " + String.valueOf(c.getArea());
        area.setText(newArea);

        // set borders
        TextView borders = findViewById(R.id.c_borders);

        StringBuilder borderText = new StringBuilder("Borders: ");
        List<String> bordersList = c.getBorders();

        if (bordersList.size() > 0) {
            for (int i = 0; i < bordersList.size() - 2; ++i) {
                borderText.append(bordersList.get(i)).append(", ");
            }
            borderText.append(bordersList.get(bordersList.size() - 1));
        }

        borders.setText(borderText.toString());
    }
}
