package lucas.oliveira.apkfilme.activities

import lucas.oliveira.apkfilme.data.MovieApi
import lucas.oliveira.apkfilme.interfaces.MovieInterfaceKey
import lucas.oliveira.apkfilme.data.Movie
import lucas.oliveira.apkfilme.data.MovieTrack
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

 fun getMovie(callback: (List<Movie>) -> Unit) {

    val api = MovieApi.retrofit.create(MovieInterfaceKey::class.java)
    api.movieList().enqueue(object : Callback<MovieTrack> {
        override fun onFailure(call: Call<MovieTrack>, t: Throwable) {
        }

        override fun onResponse(call: Call<MovieTrack>, response: Response<MovieTrack>) {
            return callback(response.body()!!.movies)
        }
    })
}
