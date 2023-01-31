package com.example.dz14month.dz14month.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz14month.databinding.FragmentCinemaBinding
import com.example.dz14month.dz14month.ui.adapters.CinemaAdapter
import com.example.dz14month.dz14month.data.model.MainModel
import com.example.dz14month.dz14month.data.repository.CinemaRepository

class CinemaFragment : Fragment() {

    private var binding: FragmentCinemaBinding? = null
    private val repo = CinemaRepository()
    private val listCat = mutableListOf<MainModel>()
    private val adapter = CinemaAdapter(listCat)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding?.rvCinema?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repo.getListOfCinemaHTTP())
        binding?.rvCinema?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}