package com.example.appleo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.ImageView;

public class MovieList extends AppCompatActivity {

    final static String TAG = "MoviesList dit: ";

    private Movies[] movies;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_list);
        Intent intent = getIntent();

        RecyclerView recyclerView =
                (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        this.movies=Movies.initMovie();
        MoviesAdapter adapter = new MoviesAdapter(movies);

        recyclerView.setAdapter(adapter);
        final Intent intentDetails = new Intent(this, Details.class);

        adapter.setListener(new MoviesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Log.i(TAG, "Clicked " + movies[position].getTitle());
                String title = movies[position].getTitle()+"    ";
                String synopsis = movies[position].getSynopsis();
                String year = new Integer(movies[position].getYear()).toString();
                String director = movies[position].getDirector();
                intentDetails.putExtra("title",title);
                intentDetails.putExtra("director",director);
                intentDetails.putExtra("year",year);
                intentDetails.putExtra("synopsis",synopsis);
                startActivity(intentDetails);

            }
        });
    }

}
