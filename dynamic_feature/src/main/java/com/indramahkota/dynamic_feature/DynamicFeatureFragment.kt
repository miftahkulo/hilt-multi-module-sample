package com.indramahkota.dynamic_feature

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.indramahkota.common.base.BaseBindingFragment
import com.indramahkota.dynamic_feature.databinding.FragmentDynamicFeatureBinding

class DynamicFeatureFragment : BaseBindingFragment() {
    private var _binding: FragmentDynamicFeatureBinding? = null
    private val binding get() = _binding!!

    /*@Inject
    lateinit var repository: SampleRepository*/

    override fun bindFragment(inflater: LayoutInflater, container: ViewGroup?): View {
        _binding = FragmentDynamicFeatureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setupUI(view: View, savedInstanceState: Bundle?) {
        //Log.d("LOGGING", "Dynamic Feature: ${repository.getMessage()}")
    }

    override fun unbindFragment() {
        _binding = null
    }
}