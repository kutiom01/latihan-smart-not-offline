package com.eman.smartnoteoffline

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AddNoteActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        val etTitle = findViewById<EditText>(R.id.etTitle)
        val etContent = findViewById<EditText>(R.id.etContent)
        val btnSave = findViewById<Button>(R.id.btnSaveNote)
        val tvBack = findViewById<TextView>(R.id.tvBack)

        tvBack.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            val title = etTitle.text.toString().trim()
            val content = etContent.text.toString().trim()

            if (title.isEmpty() || content.isEmpty()) {
                Toast.makeText(
                    this,
                    "Judul dan isi catatan harus diisi!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Catatan berhasil dibuat!",
                    Toast.LENGTH_SHORT
                ).show()

                finish()
            }
        }
    }
}
