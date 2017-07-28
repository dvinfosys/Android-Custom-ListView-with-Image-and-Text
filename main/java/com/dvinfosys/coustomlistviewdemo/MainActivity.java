package com.dvinfosys.coustomlistviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] itemname={"One","Two","Three","Four","Five","Six"};
    Integer[] imgid={R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LIst list1=new LIst(this,itemname,imgid);
        list= (ListView) findViewById(R.id.list);
        list.setAdapter(list1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String Selecteditem=itemname[i];
                Toast.makeText(getApplicationContext(),Selecteditem,Toast.LENGTH_LONG).show();
            }
        });
    }
}
