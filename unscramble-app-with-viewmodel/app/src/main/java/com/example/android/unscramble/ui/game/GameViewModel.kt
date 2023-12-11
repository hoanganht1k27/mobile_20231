package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    init {
        Log.d("GameFragment", "GameViewModel created!")
        getNextWord()
    }

    /*
    * Returns true if the current word count is less than MAX_NO_OF_WORDS.
    * Updates the next word.
    */
    fun nextWord(): Boolean {
        return if (currentWordCount < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }

    private var _currentScrambledWord = "test"
    private var wordsList: MutableList<String> = mutableListOf("anh")
    private var testList: MutableList<String> = mutableListOf("anh")
    private lateinit var currentWord: String
    private var _score = 0
    private var _currentWordCount = 0

    /*
    * Re-initializes the game data to restart the game.
    */
    fun reinitializeData() {
        _score = 0
        _currentWordCount = 0
        wordsList.clear()
        getNextWord()
    }

    val currentWordCount: Int
        get() = _currentWordCount


    val score: Int
        get() = _score

    private fun increaseScore() {
        _score += SCORE_INCREASE
    }



    fun isUserWordCorrect(playerWord: String): Boolean {
        println(currentWord)
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
            _currentScrambledWord = String(tempWord)
            ++_currentWordCount
            wordsList.add(currentWord)
        }
    }

    val currentScrambledWord: String
        get() = _currentScrambledWord
}