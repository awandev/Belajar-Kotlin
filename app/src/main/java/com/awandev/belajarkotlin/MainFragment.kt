package com.awandev.belajarkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_main, container, false)

    }

//    ketika fragment sudah dipanggil dan kita ingin mengisialisasi salah saty di dalam fragment variabel yang ada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

//    kondisi ketika activity yang dibuka lalu ditutup kembali
    override fun onDestroyView() {
        super.onDestroyView()
    }
}