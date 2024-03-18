package com.example.mfpledonaf.exemplo3kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mfpledonaf.exemplo3kotlin.R

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }

    fun onClickBotaoOK(v: View?) {
        val txtcpf = findViewById<View>(R.id.editText2) as EditText
        val txtnome = findViewById<View>(R.id.editText) as EditText
        val it = Intent()
        it.putExtra("cpf", txtcpf.text.toString())
        it.putExtra("nome", txtnome.text.toString())
        setResult(10, it) //classificamos o resultado como tipo 10
        finish()
    }

    fun onClickBotaoCancelar(v: View?) {
        finish()
    }
}