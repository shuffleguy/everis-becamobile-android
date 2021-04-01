package lucas.oliveira.apkfilme.secondscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import kotlinx.android.synthetic.main.activity_movie_details.*
import lucas.oliveira.apkfilme.R
import lucas.oliveira.apkfilme.data.Movie

class MovieDetails : AppCompatActivity() {

    private var extras : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)


        getExtra()
//        bindViews()
    }

    private fun getExtra() {
        if(intent.extras != null){
            val movie = intent.getParcelableExtra("Movie")as? Movie
            extras = movie?.id
        }
    }

//    private fun bindViews(extras: Bundle){
//
//
//        }


    }
