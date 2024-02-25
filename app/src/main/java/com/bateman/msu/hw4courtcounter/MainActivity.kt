package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val otherView: OtherView by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "Got a OtherView: $otherView")

        //When application runs always get the score
        displayForTeamA(otherView.getScoreA)
        displayForTeamB(otherView.getScoreB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        otherView.addToScore("teamA", 1)
        displayForTeamA(otherView.getScoreA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        otherView.addToScore("teamA", 2)
        displayForTeamA(otherView.getScoreA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        otherView.addToScore("teamA", 3)
        displayForTeamA(otherView.getScoreA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        otherView.addToScore("teamB", 1)
        displayForTeamB(otherView.getScoreB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        otherView.addToScore("teamB", 2)
        displayForTeamB(otherView.getScoreB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        otherView.addToScore("teamB", 3)
        displayForTeamB(otherView.getScoreB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        otherView.resetAll()
        displayForTeamA(otherView.getScoreA)
        displayForTeamB(otherView.getScoreB)
    }

    /**
     * Displays the given score for Team A.
     */
    private fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    private fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}