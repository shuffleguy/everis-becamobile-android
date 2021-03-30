package lucas.oliveira.apkfilme

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieTrack(
    @SerializedName("results")
    val movies: List<Movie> = mutableListOf<Movie>()
): Parcelable