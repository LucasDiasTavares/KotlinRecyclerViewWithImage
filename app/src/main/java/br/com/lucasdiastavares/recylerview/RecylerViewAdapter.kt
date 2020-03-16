package br.com.lucasdiastavares.recylerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.lucasdiastavares.recylerview.Model.Post
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.row_list_item.view.*

class RecylerViewAdapter(context: Context): RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder>() {

    private var list: List<Post> = ArrayList()

    override fun onCreateViewHolder(root: ViewGroup, p1: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(root.context).inflate(R.layout.row_list_item, root, false))
    }

    override fun getItemCount(): Int{
        return list.size
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        viewHolder.bind(list[position])
    }

    fun submitList(postList: List<Post>){
        list = postList
    }

     class MyViewHolder(itemViewHolder: View) : RecyclerView.ViewHolder(itemViewHolder){

            fun bind(post: Post){
                val requestOptions = RequestOptions()
                requestOptions.placeholder(R.drawable.ic_launcher_foreground)
                requestOptions.error(R.drawable.ic_launcher_background)

                Glide.with(itemView.context)
                        .load(post.image)
                        .apply(requestOptions)
                        .into(itemView.circle_image_view!!)

                itemView.txt_post.text = post.title

            }
    }

}