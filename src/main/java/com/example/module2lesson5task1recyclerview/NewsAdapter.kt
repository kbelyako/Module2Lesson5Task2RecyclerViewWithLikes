package com.example.module2lesson5task1recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(val cotext:Context, val newsList:ArrayList<NewsItem>,val callback: NewsItemCallback):RecyclerView.Adapter <ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(cotext).inflate(R.layout.item_news,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgNewsPicture.setImageBitmap(newsList[position].picture)
        holder.sNewsTitle.text=newsList[position].title
        holder.sNewsText.text=newsList[position].text
        holder.root.setOnClickListener{ callback.onItemSelected(position)}

        holder.like.setOnClickListener{
            holder.tvLikesNum.text=(holder.tvLikesNum.text.toString().toInt()+1).toString()

        }
        holder.disLike.setOnClickListener{

            if(holder.tvLikesNum.text.toString().toInt()>=1) {
                holder.tvLikesNum.text = (holder.tvLikesNum.text.toString().toInt() - 1).toString()
            }

        }

    }

    override fun getItemCount(): Int {
        return newsList.size
    }


}



class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imgNewsPicture = itemView.ivNewsPicture
    val sNewsTitle = itemView.tvNewsTitle
    val sNewsText = itemView.tvNewsText
    val root=itemView.clNewsItemRootView
    val like=itemView.ivLike
    val disLike=itemView.ivDislike
    var tvLikesNum=itemView.tvLikesNumber
    var likesNumber:Int=0
}

interface NewsItemCallback{
    fun onItemSelected(index:Int)
}