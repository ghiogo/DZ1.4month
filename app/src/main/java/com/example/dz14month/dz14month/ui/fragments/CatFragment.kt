package com.example.dz14month.dz14month.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz14month.dz14month.data.Interface.OnItemClickListener
import com.example.dz14month.databinding.FragmentCatBinding
import com.example.dz14month.dz14month.ui.adapters.CatAdapter
import com.example.dz14month.dz14month.data.model.MainModel
import com.example.dz14month.dz14month.data.repository.CatRepository

class CatFragment : Fragment(), OnItemClickListener {

    private var binding: FragmentCatBinding? = null
    private val listCat = mutableListOf<MainModel>()
    private val repo = CatRepository()
    private val adapter = CatAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clear()
        initialize()
    }

    private fun clear() {
        listCat.clear()
    }

    private fun initialize() {
        binding?.rvCat?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repo.getListOfCatHTTP())
        binding?.rvCat?.adapter = adapter
    }

    override fun onClick(model: MainModel) = with(binding) {
        val image = model.image.toString()
        val name = model.name.toString()
        findNavController().navigate(
            CatFragmentDirections.actionCatFragmentToDetailCatFragment()
                .setText(name)
                .setImage(image)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
