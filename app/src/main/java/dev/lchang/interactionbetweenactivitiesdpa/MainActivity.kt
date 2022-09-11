package dev.lchang.interactionbetweenactivitiesdpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMensaje: EditText = findViewById(R.id.etMessage)
        val btnEnviar: Button = findViewById(R.id.btnSend)

        btnEnviar.setOnClickListener {
            this.sendMessage(etMensaje.text.toString())
        }
    }

    private fun sendMessage(message: String){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("paramNombreCompleto",message)
        startActivity(intent)
    }


}