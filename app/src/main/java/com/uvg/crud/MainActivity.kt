package com.uvg.crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val adaptador = Adaptador({
        clickListener -> showItemClick(clickListener)
    })

    //private lateinit var binding: ActivityMainBinding

    lateinit var btnAgregar: Button
    //val


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAgregar = findViewById(R.id.btnAgregar)

        val items : MutableList<String> = mutableListOf()

        items.add("Prueba1")
        items.add("Prueba2")
        items.add("Prueba3")

        adaptador.setItem(items)


        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adaptador

        //agregar botones
        btnAgregar.setOnClickListener {
            items.add("Otro")
            adaptador.setItem(items)
        }
    }

    fun showItemClick(position: Int){
        val item = adaptador.getItem(position)
        Toast.makeText(this,item,Toast.LENGTH_SHORT).show()
    }

    fun Destroy(position: Int){

    }


}