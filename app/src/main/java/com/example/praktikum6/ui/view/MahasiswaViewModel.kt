package com.example.praktikum6.ui.view

import androidx.lifecycle.ViewModel
import com.example.praktikum6.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel(){

    //request atau event
    private val _mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

    //response atau state
    val mahasiswaUiState:
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>){
        _mahasiswaStateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2],
            )
        }
    }
}