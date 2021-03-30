package lucas.oliveira.apkfilme.pullapi

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    @SerializedName("id")
    val id : String ="",

    @SerializedName("title")
    val title : String = "",

    @SerializedName("poster_path")
    val poster : String = "",//https://image.tmdb.org/t/p/w500/ + poster_path

    @SerializedName("genre")
    val genre : String = "",

    @SerializedName("movie_release_date")
    val release : String = "",

    @SerializedName("overview")
    val overview : String = "",

    @SerializedName("popularity")
    val popularity : String = "",

        ) : Parcelable


