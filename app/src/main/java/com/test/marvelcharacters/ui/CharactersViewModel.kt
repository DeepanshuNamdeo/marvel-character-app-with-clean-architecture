package com.test.marvelcharacters.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.test.marvelcharacters.data.entities.Character
import com.test.marvelcharacters.data.repository.CharacterRepository
import com.test.marvelcharacters.utils.Resource
import javax.inject.Inject

class CharactersViewModel(
    @Inject private val characterRepository: CharacterRepository
) : ViewModel(){


    val character = characterRepository.getCharacters()
}
