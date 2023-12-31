package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    /*
    * Returns true if the current word count is less than MAX_NO_OF_WORDS.
    * Updates the next word.
    */
    fun nextWord(): Boolean {
        return if (currentWordCount.value!! < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }

    private var _currentScrambledWord = MutableLiveData<String>()
    private var wordsList: MutableList<String> = mutableListOf("anh")
    private var testList: MutableList<String> = mutableListOf("anh")
    private lateinit var currentWord: String

    private val _currentWordCount = MutableLiveData(0)
    val currentWordCount: LiveData<Int>
        get() = _currentWordCount

    private val _score = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _score

    /*
    * Re-initializes the game data to restart the game.
    */
    fun reinitializeData() {
        _score.value = 0
        _currentWordCount.value = 0
        wordsList.clear()
        getNextWord()
    }


    private fun increaseScore() {
        _score.value = (_score.value)?.plus(SCORE_INCREASE)
    }



    fun isUserWordCorrect(playerWord: String): Boolean {
        if (playerWord.equals(currentWord, true)) {
            increaseScore()
            return true
        }
        return false
    }

    private fun getNextWord() {
        if(wordsList == null) {
            wordsList = mutableListOf()
        }

        currentWord = allWordsList.random()
        val tempWord = currentWord.toCharArray()
        while (String(tempWord).equals(currentWord, false)) {
            tempWord.shuffle()
        }

        Log.d("current word", currentWord)
        if (wordsList.contains(currentWord)) {
            getNextWord()
        } else {
            if(_currentScrambledWord == null) {
                _currentScrambledWord = MutableLiveData<String>()
            }
            _currentScrambledWord.value = String(tempWord)
            _currentWordCount.value = (_currentWordCount.value)?.inc()
            wordsList.add(currentWord)
        }
    }

    val currentScrambledWord: LiveData<String>
        get() = _currentScrambledWord



    init {
        Log.d("GameFragment", "GameViewModel created!")
        getNextWord()
    }
}