package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampDetailBinding



class ChampDetailFragment : Fragment() {

    private lateinit var binding: FragmentChampDetailBinding
    private val repository: ChampionsRepository = InMemoryChampionsRepository.getInstance()
    private val args:ChampDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChampDetailBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champId = args.champId
        val champ = repository.readOne(champId)
        binding.champName.text = champ.name
        binding.champTitle.text = champ.title
        binding.champLore.text = champ.lore
        binding.champImage.load(champ.imageUrl){
            placeholder(R.drawable.loadinggif)
        }
        binding.returnBtn.setOnClickListener{findNavController().popBackStack()}


    }
}