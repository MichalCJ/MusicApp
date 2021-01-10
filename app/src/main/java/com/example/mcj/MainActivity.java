package com.example.mcj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Album> albums;
    private ListView mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList = findViewById(R.id.mainList);

        albums = new ArrayList<>();

        albums.add(new Album(this, "Nirvana", "Smells Like Teen Spirit", R.drawable.nirvana, R.raw.nirvanasong));
        albums.add(new Album(this, "The Offspring", "You are Gonna Go Far Kid", R.drawable.offsprings, R.raw.theoffspringsong));
        albums.add(new Album(this, "Rammstein", "Mutter", R.drawable.rammstein, R.raw.rammsteinsong));
        albums.add(new Album(this, "Zywiolak", "Swidryga i Midryga", R.drawable.zywiolak, R.raw.zywiolaksong ));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        mainList.setAdapter(adapter);
    }
}