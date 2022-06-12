package com.example.midtermhamzamushtaq11886;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Adapter extends ArrayAdapter<News> {
    private List<News.Result> results;
    private Context context;
    private ArrayList<News.Result> newslist;
    public Adapter(@NonNull Context context, int resource,List<News.Result> results ) {
    super(context, resource);
    }
    
    @NonNull
    @Override
    public View getView(int position, @Nullable View TextView, @NonNull ViewGroup parent) {
        News news = getItem(position);
        if (TextView == null) {
            TextView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item,
             parent, true);
        }
        Activity convertView = null;
        ImageView bookImage = convertView.findViewById(R.id.newspic);
        TextView heading = TextView.findViewById(R.id.heading);
        TextView description = TextView.findViewById(R.id.description);

        heading.setText(results.get(position).getHeading());
        description.setText(results.get(position).getDescription());
        bookImage.setImageResource(newslist.get(position).getUrl());
        return TextView;
    }


}

