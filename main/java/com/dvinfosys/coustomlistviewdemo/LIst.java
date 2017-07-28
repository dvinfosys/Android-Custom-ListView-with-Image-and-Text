package com.dvinfosys.coustomlistviewdemo;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LIst extends ArrayAdapter<String> {



    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public LIst(Activity context, String[] itemname, Integer[] imgid) {
        super(context,R.layout.activity_list,itemname);
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       // final Integer[] selected_position = {-1};
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview=inflater.inflate(R.layout.activity_list, null,true);

        final TextView txtTitle=(TextView) rowview.findViewById(R.id.text1);
        ImageView imageview=(ImageView)rowview.findViewById(R.id.imageview1);
        TextView extratxt=(TextView) rowview.findViewById(R.id.text2);
        rowview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked : "+position, Toast.LENGTH_SHORT).show();
            }
        });
        txtTitle.setText(itemname[position]);
        imageview.setImageResource(imgid[position]);
        extratxt.setText("Description"+itemname[position]);
        return rowview;
    }
}
