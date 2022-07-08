package com.test.marvelcharacters.data.remote

import com.test.marvelcharacters.data.remote.dataclass.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    //BaseURL + key + hash
    //TODO hardcoded now
    @GET("https://gateway.marvel.com/v1/public/characters/?ts=time&apikey=e93c1fd403820117d2c613940d83c5fb&hash=a8db5d058407d1a7090e7ff96c000375")
    suspend fun getAllCharacters() : Response<CharacterResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}