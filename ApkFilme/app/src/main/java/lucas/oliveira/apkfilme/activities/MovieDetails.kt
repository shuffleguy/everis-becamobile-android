package lucas.oliveira.apkfilme.secondscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import kotlinx.android.synthetic.main.activity_movie_details.*
import kotlinx.android.synthetic.main.activity_movie_details.view.*
import kotlinx.android.synthetic.main.movie_card.view.*
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.data.Movie
import lucas.oliveira.apkfilme.data.MovieApi
import lucas.oliveira.apkfilme.data.MovieTrack
import lucas.oliveira.apkfilme.interfaces.MovieInterfaceKey
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieDetails : AppCompatActivity() {

    private var extras : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)


        getExtra()
        getMovieDetails()

    }



    private fun getExtra() {
        if(intent.extras != null){
            val movie = intent.getParcelableExtra("Movie")as? Movie
            extras = movie?.id
        }
    }

    fun getMovieDetails() {

        val api = MovieApi.retrofit.create(MovieInterfaceKey::class.java)
        api.movieListDetails(extras.toString()).enqueue(object : Callback<Movie> {
            override fun onFailure(call: Call<Movie>, t: Throwable) {
            }

            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {


                movie_name.text = response.body()?.title
                movie_overview.text = response.body()?.overview
                release_date.text = response.body()?.release
                popularity.text = response.body()?.popularity

                Glide.with(movie_backdrop).load("https://image.tmdb.org/t/p/w500/"+ response.body()?.backdrop).into(movie_backdrop)
//

            }
        })
    }
    }
