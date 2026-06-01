package com.example.catalogoproductos

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val correo = findViewById<EditText>(R.id.correo)
        val botonValidar = findViewById<Button>(R.id.botonValidar)

        val producto1 = findViewById<LinearLayout>(R.id.producto1)
        val producto2 = findViewById<LinearLayout>(R.id.producto2)
        val producto3 = findViewById<LinearLayout>(R.id.producto3)

        val botonFinal = findViewById<Button>(R.id.botonFinal)
        val btnCarrito = findViewById<Button>(R.id.btnCarrito)
        val btnComprar1 = findViewById<Button>(R.id.btnComprar1)
        val btnComprar2 = findViewById<Button>(R.id.btnComprar2)
        val btnComprar3 = findViewById<Button>(R.id.btnComprar3)

        botonValidar.setOnClickListener {

            val email = correo.text.toString()

            when {
                email.isEmpty() -> {
                    Toast.makeText(
                        this,
                        "El correo está vacío",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                    Toast.makeText(
                        this,
                        "Correo inválido",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                else -> {
                    Toast.makeText(
                        this,
                        "Correo válido",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        producto1.setOnClickListener {
            Toast.makeText(
                this,
                "Seleccionaste Laptop Gamer",
                Toast.LENGTH_SHORT
            ).show()
        }

        producto2.setOnClickListener {
            Toast.makeText(
                this,
                "Seleccionaste Smartphone",
                Toast.LENGTH_SHORT
            ).show()
        }

        producto3.setOnClickListener {
            Toast.makeText(
                this,
                "Seleccionaste Audífonos Bluetooth",
                Toast.LENGTH_SHORT
            ).show()
        }
        btnComprar1.setOnClickListener {

            CarritoManager.agregarProducto(
                "Laptop Gamer",
                18000
            )

            Toast.makeText(
                this,
                "Laptop agregada al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnComprar2.setOnClickListener {

            CarritoManager.agregarProducto(
                "Smartphone",
                9500
            )

            Toast.makeText(
                this,
                "Smartphone agregado al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnComprar3.setOnClickListener {

            CarritoManager.agregarProducto(
                "Audífonos Bluetooth",
                1200
            )

            Toast.makeText(
                this,
                "Audífonos agregados al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }

        botonFinal.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    MasProductosActivity::class.java
                )
            )
        }
        btnCarrito.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    CarritoActivity::class.java
                )
            )
        }
    }
}