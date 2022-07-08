package com.test.marvelcharacters.data.remote

import com.test.marvelcharacters.data.remote.BaseDataSource
import com.test.marvelcharacters.data.remote.CharacterService
import javax.inject.Inject

class CharacterRemoteDataSource @Inject constructor(
    private val characterService: CharacterService
): BaseDataSource() {

    suspend fun getCharacters() = getResult { characterService.getAllCharacters() }
    suspend fun getCharacter(id: Int) = getResult { characterService.getCharacter(id) }
}