/*package com.example.main_page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SCROLL_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<Post> data = new ArrayList<>();
        data.add(new Post("Marshmallow", "http://i.imgur.com/mVpDmzc.jpg", "Android 6rtsflkfjglksjgklfjglkfsdjlkdfjgklfdjgldfkjgdoligujetlgjfdlgjglktjegkljdfgjdg6666666666666"));
        data.add(new Post("Lollipop", "http://i.imgur.com/kyVfpYh.png", "Android 55555555555555"));

        MyAdapter adapter = new MyAdapter(this, data);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}*/
