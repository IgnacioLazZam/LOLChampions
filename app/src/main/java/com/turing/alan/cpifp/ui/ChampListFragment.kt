package com.turing.alan.cpifp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampListBinding


class ChampListFragment : Fragment() {

    private lateinit var binding: FragmentChampListBinding
    private val repository: ChampionsRepository = InMemoryChampionsRepository.getInstance()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChampListBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ChampListAdapter(::toChampDetail)
        val rv = binding.champsList
        rv.adapter = adapter
        val champions = repository.getChampions()
        (rv.adapter as ChampListAdapter).submitList(champions)

    }


    private fun toChampDetail(champ: Champion) {
        val action = ChampListFragmentDirections.actionChampListFragmentToChampDetailFragment(champ.id)
        findNavController().navigate(action)
    }


}