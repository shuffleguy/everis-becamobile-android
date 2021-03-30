package lucas.oliveira.apkfilme.firstscreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_card.view.*
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.pullapi.Movie

class MovieAdapter (// junto na main >>>>>>>{movie : List<Movie> -> recycler cm adapter!!!!!
    private val movies : List<Movie>

        ) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        fun bindMovie(movie: Movie) {
            itemView.movie_name_card.text = movie.title
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster_card)
        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            return MovieViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.movie_card, parent, false)
            )
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            holder.bindMovie(movies.get(position))
        }

        override fun getItemCount(): Int {
            return movies.size
        }
    }



