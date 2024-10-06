package com.turing.alan.cpifp.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.ActivityMainBinding
import java.time.Instant

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val repository:ChampionsRepository = InMemoryChampionsRepository.getInstance()

    override fun onResume() {
        super.onResume()
        val recyclerView = binding.tasksList
        (recyclerView.adapter as TaskListAdapter).submitList(repository.getChampions())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView = binding.tasksList
        recyclerView.adapter = TaskListAdapter()

        (recyclerView.adapter as TaskListAdapter).submitList(repository.getChampions())


    }
}