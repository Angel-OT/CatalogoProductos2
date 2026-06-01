package com.example.catalogoproductos

object CarritoManager {

    val productos = mutableListOf<String>()

    var total = 0

    fun agregarProducto(nombre: String, precio: Int) {
        productos.add(nombre)
        total += precio
    }

    fun limpiar() {
        productos.clear()
        total = 0
    }
}