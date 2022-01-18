package com.indramahkota.data

import com.indramahkota.domain.SampleRepository

/*
* This is from sample hilt multi module template
* created by Indra Mahkota
* */
class SampleRepositoryImpl : SampleRepository {
    override fun getMessage() = "Hello Dagger Hilt!"
}
