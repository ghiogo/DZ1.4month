package com.example.dz14month.dz14month.ui.detailFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.dz14month.databinding.FragmentDetailCatBinding

class DetailCatFragment : Fragment() {

    private lateinit var binding: FragmentDetailCatBinding
    private val args by navArgs<DetailCatFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailCatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNav()
    }

    private fun setupNav() {
        binding.txtCatDetail.text = args.text
        binding.imageCatDetail.let {
            it.context.let { it1 ->
                Glide.with(it1).load(args.image).into(binding.imageCatDetail)
            }
        }
    }
}