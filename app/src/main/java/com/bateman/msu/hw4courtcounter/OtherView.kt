package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel

private const val TAG = "OtherView"
class OtherView: ViewModel() {

    private var scoreTeamA = 0
    private var scoreTeamB = 0

    val getScoreA: Int
        get() = scoreTeamA

    val getScoreB: Int
        get() = scoreTeamB

    fun addToScore(team: String, amount: Int) {
        when (team) {
            "teamA" -> {
                scoreTeamA += amount
            }
            "teamB" -> {
                scoreTeamB += amount
            }
        }
    }

    fun resetAll() {
        scoreTeamA = 0
        scoreTeamB = 0
    }


}