
package com.eman.smartnoteoffline

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnAddNote = findViewById<Button>(R.id.btnAddNote)

        btnAddNote.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

        val btnAI = findViewById<Button>(R.id.btnAI)

        btnAI.setOnClickListener {
            val intent = Intent(this, AiAssistantActivity::class.java)
            startActivity(intent)
        }
    }
}
