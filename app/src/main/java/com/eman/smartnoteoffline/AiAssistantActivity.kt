package com.eman.smartnoteoffline

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AiAssistantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_assistant)

        val etInput = findViewById<EditText>(R.id.etAIInput)
        val btnProcess = findViewById<Button>(R.id.btnProcessAI)
        val tvResult = findViewById<TextView>(R.id.tvAIResult)
        val tvBack = findViewById<TextView>(R.id.tvBackAI)

        tvBack.setOnClickListener {
            finish()
        }

        btnProcess.setOnClickListener {
            val input = etInput.text.toString().trim()

            if (input.isEmpty()) {
                Toast.makeText(
                    this,
                    "Masukkan catatan terlebih dahulu!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                tvResult.text =
                    "Model AI lokal belum dipasang. " +
                            "Fitur ringkasan otomatis akan diaktifkan " +
                            "pada tahap integrasi On-Device AI."
            }
        }
    }
}
