package lucas.oliveira.apkfilme.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApi {

            companion object{
                private const val BASE_URL = "https://api.themoviedb.org"
                var retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }

        }




