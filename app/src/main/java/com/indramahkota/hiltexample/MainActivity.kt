package com.indramahkota.hiltexample

import android.os.Bundle
import android.view.View
import com.indramahkota.common.base.BaseBindingActivity
import com.indramahkota.domain.SampleRepository
import com.indramahkota.hiltexample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseBindingActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var repository: SampleRepository

    override fun setLayout(): View {
        binding = ActivityMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        Timber.d("Sample repository address: $repository")
    }
}