package com.example.dz14month.dz14month.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz14month.databinding.FragmentLanguageBinding
import com.example.dz14month.dz14month.ui.adapters.LanguageAdapter
import com.example.dz14month.dz14month.data.model.MainModel
import com.example.dz14month.dz14month.data.repository.LanguageRepository

class LanguageFragment : Fragment() {

    private var binding: FragmentLanguageBinding? = null
    private val repo = LanguageRepository()
    private val listCat = mutableListOf<MainModel>()
    private val adapter = LanguageAdapter(listCat)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       initialize()
    }

    private fun initialize() {
        binding?.rvLanguage?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repo.getListOfLanguageHTTP())
        binding?.rvLanguage?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}