
package com.turing.alan.cpifp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.databinding.ActivityChampBinding


class TaskListAdapter(): ListAdapter<Champion, TaskListAdapter.TaskViewHolder>(TaskDiffCallback) {

    class TaskViewHolder(private val binding: ActivityChampBinding) :RecyclerView.ViewHolder(binding.root) {

        fun bind(champ:Champion) {
            binding.champTitle.text = champ.title
            binding.champName.text = champ.name
            binding.champLore.text = champ.lore

            binding.champImage.load(champ.imageUrl) {
                placeholder(R.drawable.loadinggif) // Opcional: imagen de carga
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding:ActivityChampBinding = ActivityChampBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object TaskDiffCallback: DiffUtil.ItemCallback<Champion>() {
        override fun areItemsTheSame(oldItem: Champion, newItem: Champion) = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Champion, newItem: Champion) = oldItem.name == newItem.name &&
                oldItem.title == newItem.title &&
                oldItem.lore == newItem.lore

    }

}