package com.devinidn.newsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.devinidn.newsapp.databinding.FragmentAllNewsBinding

class AllNewsFragment : Fragment() {

    lateinit var binding : FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)
        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

       bindNewsHeadline(binding.newsHeadline, 0)

        return binding.root
    }

}