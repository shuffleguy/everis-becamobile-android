package lucas.oliveira.apkfilme.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.interfaces.ClickInterface
import lucas.oliveira.apkfilme.data.Movie
import lucas.oliveira.apkfilme.secondscreen.MovieDetails


class MainActivity : AppCompatActivity(), ClickInterface{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize((true))
        getMovie { movies: List<Movie> ->
            rv_list.adapter = MovieAdapter(movies)
        }

    }

    override fun clickMovies(movie: Movie) {
        var intent = Intent(this, MovieDetails::class.java )
        intent.putExtra("Movie", movie)
        startActivity(intent)
    }




}