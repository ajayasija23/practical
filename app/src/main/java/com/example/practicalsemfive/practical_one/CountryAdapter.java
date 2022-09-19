package com.example.practicalsemfive.practical_one;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.practicalsemfive.R;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryData> {


	public CountryAdapter(@NonNull Context context, ArrayList<CountryData> arrayList) {
		super(context, 0, arrayList);
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

		View root = convertView;

		if (root == null) {
			root = LayoutInflater.from(getContext()).inflate(R.layout.item_country, parent, false);
		}

		CountryData country = getItem(position);

		ImageView numbersImage = root.findViewById(R.id.image);
		numbersImage.setImageResource(country.getImage());

		// then according to the position of the view assign the desired TextView 1 for the same
		TextView tvName = root.findViewById(R.id.tvName);
		tvName.setText(country.getName());


		return root;
	}
}
