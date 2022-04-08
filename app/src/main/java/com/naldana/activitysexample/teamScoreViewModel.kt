package com.naldana.activitysexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel


class TeamScoreViewModel: ViewModel() {
    val teamA_score = MutableLiveData("0")
    val teamB_score = MutableLiveData("0")
    val winner = MutableLiveData("")

    fun select_a_winner(){
        if(teamA_score.value!! > teamB_score.value!!)
            winner.value = "TEAM A WINS"
        else if(teamA_score.value!! > teamB_score.value!!)
            winner.value = "TEAM B WINS"

    }
}