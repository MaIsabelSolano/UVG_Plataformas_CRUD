package com.uvg.crud

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adaptador : RecyclerView.Adapter<Adaptador.ItemsViewHolder>(){

    private var items: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent,false)
        return ItemsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}