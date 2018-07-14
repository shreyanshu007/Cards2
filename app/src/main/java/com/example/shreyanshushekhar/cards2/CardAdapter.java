package com.example.shreyanshushekhar.cards2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Cards> {

    private final Context context;
    private final ArrayList<Cards> details;

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View cardView = layoutInflater.inflate(R.layout.card_view, parent, false);

        TextView title = (TextView) cardView.findViewById(R.id.title);
        TextView secondary_text = (TextView) cardView.findViewById(R.id.secondary_text);
        TextView description = (TextView) cardView.findViewById(R.id.description);

        ImageView thumbnail = (ImageView) cardView.findViewById(R.id.thumbnail);
        ImageView main_image = (ImageView) cardView.findViewById(R.id.main_image);

        Button button = (Button) cardView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getContext(), details.get(position).getBtnText(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        title.setText(details.get(position).getTitle());
        secondary_text.setText(details.get(position).getSecondary_text());
        description.setText(details.get(position).getDescription());

        thumbnail.setImageResource(R.drawable.ic_launcher_background);
        main_image.setImageResource(R.mipmap.imagea);

        return cardView;
    }

    public CardAdapter(@NonNull Context context, ArrayList<Cards> list) {
        super(context, R.layout.card_view, list);
        this.context = context;
        this.details = list;
    }
}
