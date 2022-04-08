package com.naldana.activitysexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.naldana.activitysexample.databinding.FragmentTeamAFragmentBinding


class TeamAFragment : Fragment() {

    private val scoreViewModel: TeamScoreViewModel by activityViewModels()
    private lateinit var binding: FragmentTeamAFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_team_a_fragment, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = scoreViewModel
        binding.lifecycleOwner = this
        binding.add2points.setOnClickListener {
            scoreViewModel.teamA_score.setValue((scoreViewModel.teamA_score.value!!.toInt() + 2).toString())
        }
        binding.add3points.setOnClickListener {
            scoreViewModel.teamA_score.setValue((scoreViewModel.teamA_score.value!!.toInt() + 3).toString())
        }

    }
}


