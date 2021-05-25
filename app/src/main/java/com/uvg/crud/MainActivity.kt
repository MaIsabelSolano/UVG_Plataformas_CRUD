package com.uvg.crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adaptador = Adaptador({
        clickListener -> showItemClick(clickListener)
        //Toast.makeText(this,"Prueba", Toast.LENGTH_SHORT).show()
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items : MutableList<String> = mutableListOf()

        items.add("Prueba1")
        items.add("Prueba2")
        items.add("Prueba3")


        adaptador.setItem(items)


        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adaptador
    }

    fun showItemClick(position: Int){
        val item = adaptador.getItem(position)
        Toast.makeText(this,item,Toast.LENGTH_SHORT).show()
    }
}