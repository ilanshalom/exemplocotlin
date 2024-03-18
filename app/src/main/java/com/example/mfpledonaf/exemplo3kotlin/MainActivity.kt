package com.example.mfpledonaf.exemplo3kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mfpledonaf.exemplo3kotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirCad(v: View?) {
        val intent = Intent(applicationContext, Cadastro::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {   // identificamos a Activity da qual retornou
            if (resultCode == 10) { // somente se clicou no botão OK  (Cancelar não faz nada)
                val params = data!!.extras
                if (params != null) {  // se existem parâmetros
                    val txtnome = findViewById<View>(R.id.textView) as TextView
                    val txtrgm = findViewById<View>(R.id.textView2) as TextView
                    txtnome.text = params.getString("cpf")
                    txtrgm.text = params.getString("nome")
                }
            }
        }
    }
}