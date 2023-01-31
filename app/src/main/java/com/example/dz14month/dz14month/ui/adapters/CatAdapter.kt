package com.example.dz14month.dz14month.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz14month.dz14month.data.Interface.OnItemClickListener
import com.example.dz14month.databinding.ItemCatBinding
import com.example.dz14month.dz14month.data.model.MainModel

class CatAdapter(
    private val listCat: MutableList<MainModel>,
    private val onItemClickListener: OnItemClickListener
) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    inner class CatViewHolder(private var binding: ItemCatBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(catModel: MainModel) {
            binding.txtName.text = catModel.name
            Glide.with(binding.imageCat.context).load(catModel.image).into(binding.imageCat)
            itemView.setOnClickListener {
                onItemClickListener.onClick(catModel)
                binding.txtName.text = catModel.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(
            ItemCatBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}
