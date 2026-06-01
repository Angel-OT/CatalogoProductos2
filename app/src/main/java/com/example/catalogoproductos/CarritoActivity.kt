package com.example.catalogoproductos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CarritoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_carrito)

        val regresar = findViewById<Button>(R.id.btnRegresar)

        val txtProductos =
            findViewById<TextView>(R.id.txtProductos)

        val txtTotal =
            findViewById<TextView>(R.id.txtTotal)

        txtProductos.text =
            CarritoManager.productos.joinToString("\n")

        txtTotal.text =
            "Total: $${CarritoManager.total} MXN"

        regresar.setOnClickListener {
            finish()
        }
    }
}