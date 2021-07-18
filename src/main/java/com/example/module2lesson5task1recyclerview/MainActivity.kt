package com.example.module2lesson5task1recyclerview
/*
ДЗ. Задание 1. Легкое
Написать список новостей, в котором есть картинка, заголовок, текст. Количество новостей –
15 шт (можно дублирующиеся). Если текст слишком длинный, он обрезается.
 */

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLOG","News N app started")

        var newsItems = getNewsItems()
        rvNews.adapter=NewsAdapter(this,newsItems)
        rvNews.layoutManager=LinearLayoutManager(this)

    }

    fun getNewsItems():ArrayList<NewsItem>{
        var newsItems=ArrayList<NewsItem>()

        //news 1
        newsItems.add(NewsItem(
            "British retailers recall cat food over 130 cat fatalities",
            "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                    "\n" +
                    "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
            BitmapFactory.decodeResource(resources,R.drawable.cat1)
        ))
        //news 2
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
            BitmapFactory.decodeResource(resources,R.drawable.cat2)
        ))

        //news 3
        newsItems.add(NewsItem(
            "‘Cat curfew’: Outrage over Australian plans to keep cats at home 24/7",
            "Cat owners in Australia’s city of Knox, in the eastern suburbs of Melbourne, are unhappy about a new law that will require them to keep their pets at home all day.\n" +
                    "\n" +
                    "From October 1, domestic cats will be subject to a “24-hour cat curfew”. This means they won’t be allowed to wander freely, even outside their own homes.\n" +
                    "\n" +
                    "Knox City Council Mayor Cr Lisa Cooper said the curfew is designed to protect cats and local wildlife.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "“Much like the rules for dogs and other pets, cats won’t be allowed to roam freely from their owners’ property.\n"+
                    "When allowed to roam, cats are at a much higher risk of illness and injury. Keeping cats within their owners’ property also protects wildlife and prevents them from causing a nuisance for neighbours and their pets,” Ms Cooper said in a statement.\n" +
                    "\n" +
                    "Nearly 85 per cent of people surveyed by the Domestic Animal Management Plan 2017-2021 supported the curfew, the council said.",
            BitmapFactory.decodeResource(resources,R.drawable.cat3)
        ))

        //news 4
        newsItems.add(NewsItem(
            "Six-week-old kitten discovered in car chassis",
            "A six-week-old kitten is being cared for by the RSPCA after being found trapped inside the chassis of a car.\n" +
                    "\n" +
                    "A hairdresser called the animal charity on Monday after hearing frightened meows coming from under her car which was parked in Eaglescliife. RSPCA inspector Clare Wilson managed to pull the kitten out when the spare wheel was unscrewed.\n" +
                    "\n" +
                    "“He was hissing and spitting at me when I first rescued him but has calmed down at my home and is allowing me near him a bit more - although he is still unsure,\" she said.\n" +
                    "\n" +
                    "She's looking after Simba, as he's now been called, until he's old enough to be rehomed.\n" +
                    "\n" +
                    "It's thought he may have been sheltering in the car during the storms on Sunday",
            BitmapFactory.decodeResource(resources,R.drawable.cat4)
        ))

        //news 5
        newsItems.add(NewsItem(
            "Blue Cross pet charity closes centres shedding 66 jobs",
            "An animal rehoming charity has closed four of its centres, shedding 66 jobs in the process.\n" +
                    "\n" +
                    "Blue Cross centres in Cambridge, Lewknor in Oxfordshire, and Torbay and Tiverton in Devon closed on Wednesday.\n" +
                    "\n" +
                    "Thousands had signed petitions set up by volunteers and supporters to try to lobby for the shelters to remain open.\n" +
                    "\n" +
                    "However, the charity said the closures reflected \"changes beyond our control in the last year\" and would save Blue Cross £1m per year.\n" +
                    "\n" +
                    "The animal welfare charity, which has been working throughout the UK since it was founded in 1897, said following \"in-depth consultations\" with staff it was putting in place \"a new structure to improve services and reach even more pets in need\".",
            BitmapFactory.decodeResource(resources,R.drawable.cat5)
        ))

        //news 1
        newsItems.add(NewsItem(
            "British retailers recall cat food over 130 cat fatalities",
            "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                    "\n" +
                    "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
            BitmapFactory.decodeResource(resources,R.drawable.cat1)
        ))
        //news 2
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
            BitmapFactory.decodeResource(resources,R.drawable.cat2)
        ))

        //news 3
        newsItems.add(NewsItem(
            "‘Cat curfew’: Outrage over Australian plans to keep cats at home 24/7",
            "Cat owners in Australia’s city of Knox, in the eastern suburbs of Melbourne, are unhappy about a new law that will require them to keep their pets at home all day.\n" +
                    "\n" +
                    "From October 1, domestic cats will be subject to a “24-hour cat curfew”. This means they won’t be allowed to wander freely, even outside their own homes.\n" +
                    "\n" +
                    "Knox City Council Mayor Cr Lisa Cooper said the curfew is designed to protect cats and local wildlife.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "“Much like the rules for dogs and other pets, cats won’t be allowed to roam freely from their owners’ property.\n"+
                    "When allowed to roam, cats are at a much higher risk of illness and injury. Keeping cats within their owners’ property also protects wildlife and prevents them from causing a nuisance for neighbours and their pets,” Ms Cooper said in a statement.\n" +
                    "\n" +
                    "Nearly 85 per cent of people surveyed by the Domestic Animal Management Plan 2017-2021 supported the curfew, the council said.",
            BitmapFactory.decodeResource(resources,R.drawable.cat3)
        ))

        //news 4
        newsItems.add(NewsItem(
            "Six-week-old kitten discovered in car chassis",
            "A six-week-old kitten is being cared for by the RSPCA after being found trapped inside the chassis of a car.\n" +
                    "\n" +
                    "A hairdresser called the animal charity on Monday after hearing frightened meows coming from under her car which was parked in Eaglescliife. RSPCA inspector Clare Wilson managed to pull the kitten out when the spare wheel was unscrewed.\n" +
                    "\n" +
                    "“He was hissing and spitting at me when I first rescued him but has calmed down at my home and is allowing me near him a bit more - although he is still unsure,\" she said.\n" +
                    "\n" +
                    "She's looking after Simba, as he's now been called, until he's old enough to be rehomed.\n" +
                    "\n" +
                    "It's thought he may have been sheltering in the car during the storms on Sunday",
            BitmapFactory.decodeResource(resources,R.drawable.cat4)
        ))

        //news 5
        newsItems.add(NewsItem(
            "Blue Cross pet charity closes centres shedding 66 jobs",
            "An animal rehoming charity has closed four of its centres, shedding 66 jobs in the process.\n" +
                    "\n" +
                    "Blue Cross centres in Cambridge, Lewknor in Oxfordshire, and Torbay and Tiverton in Devon closed on Wednesday.\n" +
                    "\n" +
                    "Thousands had signed petitions set up by volunteers and supporters to try to lobby for the shelters to remain open.\n" +
                    "\n" +
                    "However, the charity said the closures reflected \"changes beyond our control in the last year\" and would save Blue Cross £1m per year.\n" +
                    "\n" +
                    "The animal welfare charity, which has been working throughout the UK since it was founded in 1897, said following \"in-depth consultations\" with staff it was putting in place \"a new structure to improve services and reach even more pets in need\".",
            BitmapFactory.decodeResource(resources,R.drawable.cat5)
        ))

        //news 1
        newsItems.add(NewsItem(
            "British retailers recall cat food over 130 cat fatalities",
            "Retailers including supermarket Sainsbury’s and pet store Pets at Home are recalling some dry cat food after a series of cat deaths.\n" +
                    "\n" +
                    "Owners are being advised by the Food Standards Agency (FSA) and Defra against giving certain products to cats after 150 cases of feline pancytopenia were seen since April.",
            BitmapFactory.decodeResource(resources,R.drawable.cat1)
        ))
        //news 2
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
            BitmapFactory.decodeResource(resources,R.drawable.cat2)
        ))

        //news 3
        newsItems.add(NewsItem(
            "‘Cat curfew’: Outrage over Australian plans to keep cats at home 24/7",
            "Cat owners in Australia’s city of Knox, in the eastern suburbs of Melbourne, are unhappy about a new law that will require them to keep their pets at home all day.\n" +
                    "\n" +
                    "From October 1, domestic cats will be subject to a “24-hour cat curfew”. This means they won’t be allowed to wander freely, even outside their own homes.\n" +
                    "\n" +
                    "Knox City Council Mayor Cr Lisa Cooper said the curfew is designed to protect cats and local wildlife.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "“Much like the rules for dogs and other pets, cats won’t be allowed to roam freely from their owners’ property.\n"+
                    "When allowed to roam, cats are at a much higher risk of illness and injury. Keeping cats within their owners’ property also protects wildlife and prevents them from causing a nuisance for neighbours and their pets,” Ms Cooper said in a statement.\n" +
                    "\n" +
                    "Nearly 85 per cent of people surveyed by the Domestic Animal Management Plan 2017-2021 supported the curfew, the council said.",
            BitmapFactory.decodeResource(resources,R.drawable.cat3)
        ))

        //news 4
        newsItems.add(NewsItem(
            "Six-week-old kitten discovered in car chassis",
            "A six-week-old kitten is being cared for by the RSPCA after being found trapped inside the chassis of a car.\n" +
                    "\n" +
                    "A hairdresser called the animal charity on Monday after hearing frightened meows coming from under her car which was parked in Eaglescliife. RSPCA inspector Clare Wilson managed to pull the kitten out when the spare wheel was unscrewed.\n" +
                    "\n" +
                    "“He was hissing and spitting at me when I first rescued him but has calmed down at my home and is allowing me near him a bit more - although he is still unsure,\" she said.\n" +
                    "\n" +
                    "She's looking after Simba, as he's now been called, until he's old enough to be rehomed.\n" +
                    "\n" +
                    "It's thought he may have been sheltering in the car during the storms on Sunday",
            BitmapFactory.decodeResource(resources,R.drawable.cat4)
        ))

        //news 5
        newsItems.add(NewsItem(
            "Blue Cross pet charity closes centres shedding 66 jobs",
            "An animal rehoming charity has closed four of its centres, shedding 66 jobs in the process.\n" +
                    "\n" +
                    "Blue Cross centres in Cambridge, Lewknor in Oxfordshire, and Torbay and Tiverton in Devon closed on Wednesday.\n" +
                    "\n" +
                    "Thousands had signed petitions set up by volunteers and supporters to try to lobby for the shelters to remain open.\n" +
                    "\n" +
                    "However, the charity said the closures reflected \"changes beyond our control in the last year\" and would save Blue Cross £1m per year.\n" +
                    "\n" +
                    "The animal welfare charity, which has been working throughout the UK since it was founded in 1897, said following \"in-depth consultations\" with staff it was putting in place \"a new structure to improve services and reach even more pets in need\".",
            BitmapFactory.decodeResource(resources,R.drawable.cat5)
        ))

        return newsItems
    }


}