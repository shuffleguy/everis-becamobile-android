package lucas.oliveira.apkfilme.interfaces

import lucas.oliveira.apkfilme.data.MovieTrack
import retrofit2.Call
import retrofit2.http.GET

interface MovieInterfaceKey {
    @GET("/3/movie/popular?api_key=e2000358a201ec78fef20bdd18e77c1f")
    fun movieList() : Call<MovieTrack>
}