package com.naldana.activitysexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.naldana.activitysexample.databinding.FragmentTeamAFragmentBinding
import com.naldana.activitysexample.databinding.FragmentTeamBFragmentBinding


class TeamBFragment : Fragment() {

    private val scoreViewModel: TeamScoreViewModel by activityViewModels()
    private lateinit var binding: FragmentTeamBFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_team_b_fragment, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = scoreViewModel
        binding.lifecycleOwner = this

        binding.button2.setOnClickListener {
            scoreViewModel.teamB_score.value = (scoreViewModel.teamB_score.value!!.toInt() + 2).toString()
        }
        binding.teamb3points.setOnClickListener {
            scoreViewModel.teamB_score.value = (scoreViewModel.teamB_score.value!!.toInt() + 3).toString()
        }

    }

}