package com.example.practicalsemfive.practical_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.practicalsemfive.R;

import java.util.ArrayList;

public class PracticleOne extends AppCompatActivity {

    private ListView flagList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_one);
        flagList=(ListView) findViewById(R.id.listFlags);
        ArrayList<CountryData> countries=getCountries();
        CountryAdapter adapter=new CountryAdapter(this,countries);
        flagList.setAdapter(adapter);

        //handle click events
        flagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(PracticleOne.this, FlagActivity.class);
                intent.putExtra("flag",countries.get(i).getImage());
                startActivity(intent);
            }
        });
    }

    public ArrayList<CountryData> getCountries() {
        ArrayList<CountryData> countries=new ArrayList<CountryData>();
        CountryData country=new CountryData();
        //country one
        country.setImage(R.drawable.india);
        country.setName("India");
        countries.add(country);

//        country 2
        CountryData country1=new CountryData();
        country1.setImage(R.drawable.pakistan);
        country1.setName("Pakistan");
        countries.add(country1);

        // country 3
        CountryData country2=new CountryData();
        country2.setImage(R.drawable.united_states);
        country2.setName("United State");
        countries.add(country2);

        return countries;
    }


}