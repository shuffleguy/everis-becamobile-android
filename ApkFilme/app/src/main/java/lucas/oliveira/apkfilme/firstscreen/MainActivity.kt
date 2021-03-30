package lucas.oliveira.apkfilme.firstscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.geturl.MovieApi
import lucas.oliveira.apkfilme.geturl.MovieInterfaceKey
import lucas.oliveira.apkfilme.pullapi.Movie
import lucas.oliveira.apkfilme.pullapi.MovieTrack
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // getMovie {  }
    }
}
private fun getMovie(callback: (List<Movie>) ->  Unit{

    val api = MovieApi.retrofit.create(MovieInterfaceKey::class.java)
    api.movieList().enqueue(object : Callback<MovieTrack>{
        override fun onFailure(call: Call<MovieTrack>, t: Throwable) {
        }

        override fun onResponse(call: Call<MovieTrack>, response: Response<MovieTrack>) {
            return callback(response.body()!!.movies)
        }
    }
    )
}