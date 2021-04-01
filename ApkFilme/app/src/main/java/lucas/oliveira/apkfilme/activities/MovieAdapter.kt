package lucas.oliveira.apkfilme.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_card.view.*
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.data.Movie
import lucas.oliveira.apkfilme.activities.MainActivity
import lucas.oliveira.apkfilme.interfaces.ClickInterface

class MovieAdapter (
    private val movies : List<Movie>,
    private val listener: ClickInterface
        ) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(view : View, movies: List<Movie>, listener: ClickInterface) : RecyclerView.ViewHolder(view) {

        init {
            itemView.setOnClickListener {
                listener.clickMovies(movies[adapterPosition])
            }
        }

        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        fun bindMovie(movie: Movie) {
            itemView.movie_name_card.text = movie.title
            itemView.movie_vote_average.text = movie.vote_average
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster_card)

        }


    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            return MovieViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.movie_card, parent, false),movies, listener
            )

        }
        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            holder.bindMovie(movies.get(position))
        }
        override fun getItemCount(): Int {
            return movies.size
        }
    }



