package com.example.module2lesson5task1recyclerview
/*
ДЗ. Задание 1. Легкое
Написать список новостей, в котором есть картинка, заголовок, текст. Количество новостей –
15 шт (можно дублирующиеся). Если текст слишком длинный, он обрезается.
 */

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var newsItems = getNewsItems()
        rvNews.adapter=NewsAdapter(this,newsItems)
        rvNews.layoutManager=LinearLayoutManager(this)
    }
        fun getNewsItems():ArrayList<NewsItem>{
            var newsItems=ArrayList<NewsItem>()

            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))

            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))
            newsItems.add(NewsItem(
                "British retailers recall cat food over 130 cat fatalities",
                "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                        "\n" +
                        "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
                BitmapFactory.decodeResource(resources,R.drawable.cat)
            ))

            newsItems.add(NewsItem(
                "Cat returns home after family believe they cremated him",
                "A family were shocked when the cat they believed they had cremated returned home as if nothing had happened.\n" +
                        "\n" +
                        "Frankie, a 16-year-old tabby, failed to return home in Warrington, Cheshire, on 19 May.\n" +
                        "\n" +
                        "His owners launched a search and spotted a dead cat on the M6 motorway that looked similar a few days later.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Highways England was able to retrieve the animal and gave it to the family to be cremated.\n" +
                        "\n" +
                        "But Frankie returned home a few days later.",
                BitmapFactory.decodeResource(resources,R.drawable.cat1)
            ))

            return newsItems
        }

}