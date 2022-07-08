package com.test.marvelcharacters.data.entities

import androidx.room.Entity


@Entity(tableName = "characters")
data class Character(
    val id: Int ,//The unique ID of the character resource.,
    val name: String, // //The name of the character.,
    val description: String, // A short bio or description of the character.,
    val modified: String,//Date, // The date the resource was most recently modified.,
    val resourceURI: String, // The canonical URL identifier for this resource.,
    val urls: String,//Array[Url], // A set of public web site URLs for the resource.,
    val thumbnail: String,//Image, // The representative image for this character.,
    val comics: String,//ComicList, // A resource list containing comics which feature this character.,
    val stories: String,//StoryList, // A resource list of stories in which this character appears.,
    val events: String,//EventList, // A resource list of events in which this character appears.,
    val series: String,//SeriesList, // A resource list of series in which this character appears.
)