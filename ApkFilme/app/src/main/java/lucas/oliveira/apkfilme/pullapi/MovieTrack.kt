package lucas.oliveira.apkfilme.pullapi

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import lucas.oliveira.apkfilme.pullapi.Movie

@Parcelize
data class MovieTrack(
    @SerializedName("results")
    val movies: List<Movie> = mutableListOf<Movie>()
): Parcelable