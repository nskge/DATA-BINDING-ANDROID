package br.unisanta.resenhaparte1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.editTextNumber)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val res = findViewById<EditText>(R.id.editTextNumber3)

        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnSoma = findViewById<Button>(R.id.btnSoma)
        val btnMulti = findViewById<Button>(R.id.btnMulti)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val btnOhm = findViewById<Button>(R.id.btnOhm)


        btnOhm.setOnClickListener {

            val resistencia = num1.text.toString().toDoubleOrNull() ?: 0.0
            val corrente = num2.text.toString().toDoubleOrNull() ?: 0.0

            val tensao = resistencia * corrente

            res.setText(tensao.toString())
        }
        btnSoma.setOnClickListener {
            val v1 = num1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = num2.text.toString().toDoubleOrNull() ?: 0.0
            res.setText((v1 + v2).toString())
        }

        btnSub.setOnClickListener {
            val v1 = num1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = num2.text.toString().toDoubleOrNull() ?: 0.0
            res.setText((v1 - v2).toString())
        }

        btnMulti.setOnClickListener {
            val v1 = num1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = num2.text.toString().toDoubleOrNull() ?: 0.0
            res.setText((v1 * v2).toString())
        }

        btnDiv.setOnClickListener {
            val v1 = num1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = num2.text.toString().toDoubleOrNull() ?: 0.0

            if (v2 == 0.0) {
                res.setText("Não pode dividir por 0")
            } else {
                res.setText((v1 / v2).toString())
            }
        }
    }
}


