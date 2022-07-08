package com.test.marvelcharacters.data.remote.dataclass

import com.squareup.moshi.Json


data class CharacterResponse(
    @field:Json(name = "code") val code: String,
    @field:Json(name = "status") val status: String,
    @field:Json(name = "copyright") val copyright: String,
    @field:Json(name = "attributionText") val attributionText: String,
    @field:Json(name = "attributionHTML") val attributionHTML: String,
    @field:Json(name = "data") val data: Data,
    @field:Json(name = "etag") val etag: String
)


data class Data(
    @field:Json(name = "offset") val offset: String,
    @field:Json(name = "limit") val limit: String,
    @field:Json(name = "total") val total: String,
    @field:Json(name = "count") val count: String,
    @field:Json(name = "results") val results: List<Result>
)


data class Result(
    @field:Json(name = "id") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "description") val description: String,
    @field:Json(name = "code") val modified: String,
    @field:Json(name = "code") val resourceURI: String,
    @field:Json(name = "resourceURI") val urls: List<URL>,
    @field:Json(name = "thumbnail") val thumbnail: Thumbnail,
    @field:Json(name = "comics") val comics: Comics,
    @field:Json(name = "stories") val stories: Stories,
    @field:Json(name = "events") val events: Comics,
    @field:Json(name = "series") val series: Comics
)


data class Comics(
    @field:Json(name = "available") val available: String,
    @field:Json(name = "returned") val returned: String,
    @field:Json(name = "collectionURI") val collectionURI: String,
    @field:Json(name = "items") val items: List<ComicsItem>
)


data class ComicsItem(
    @field:Json(name = "resourceURI") val resourceURI: String,
    @field:Json(name = "name") val name: String
)


data class Stories(
    @field:Json(name = "available") val available: String,
    @field:Json(name = "returned") val returned: String,
    @field:Json(name = "collectionURI") val collectionURI: String,
    @field:Json(name = "items") val items: List<StoriesItem>
)


data class StoriesItem(
    @field:Json(name = "resourceURI") val resourceURI: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "type") val type: String
)


data class Thumbnail(
    @field:Json(name = "path") val path: String,
    @field:Json(name = "extension") val extension: String
)


data class URL(
    @field:Json(name = "type") val type: String,
    @field:Json(name = "url") val url: String
)
