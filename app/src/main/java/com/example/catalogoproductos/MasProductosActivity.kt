package com.example.catalogoproductos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MasProductosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mas_productos)

        val btnTeclado = findViewById<Button>(R.id.btnTeclado)
        val btnMouse = findViewById<Button>(R.id.btnMouse)
        val btnMonitor = findViewById<Button>(R.id.btnMonitor)
        val btnVerCarrito = findViewById<Button>(R.id.btnVerCarrito)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnTeclado.setOnClickListener {

            CarritoManager.agregarProducto(
                "Teclado Mecánico",
                1500
            )

            Toast.makeText(
                this,
                "Teclado agregado al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnMouse.setOnClickListener {

            CarritoManager.agregarProducto(
                "Mouse Gamer",
                800
            )

            Toast.makeText(
                this,
                "Mouse agregado al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnMonitor.setOnClickListener {

            CarritoManager.agregarProducto(
                "Monitor 24\"",
                4000
            )

            Toast.makeText(
                this,
                "Monitor agregado al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnVerCarrito.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    CarritoActivity::class.java
                )
            )
        }
        btnVerCarrito.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    CarritoActivity::class.java
                )
            )
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}