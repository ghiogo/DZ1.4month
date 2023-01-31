package com.example.dz14month.dz14month.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz14month.databinding.ItemCatBinding
import com.example.dz14month.dz14month.data.model.MainModel

class CinemaAdapter(private val listCat: MutableList<MainModel>) :
    RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    inner class CinemaViewHolder(private var binding: ItemCatBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(catModel: MainModel) {
            binding.txtName.text = catModel.name
            Glide.with(binding.imageCat.context).load(catModel.image).into(binding.imageCat)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        return CinemaViewHolder(
            ItemCatBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}
