package com.uvg.crud

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_lista.view.*

class Adaptador(private val clickListener: (Int) -> Unit) : RecyclerView.Adapter<Adaptador.ItemsViewHolder>(){

    private var items: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent,false)
        return ItemsViewHolder(view)


    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        val item= items[position]
        holder.bind(item, clickListener)
    }

    fun setItem(nuevosItems: MutableList<String>){
        this.items = nuevosItems
        notifyDataSetChanged()
    }

    fun getItem(position : Int): String {
        return items[position]
    }

    fun destroyItem(position: Int){
        items.removeAt(position)
        notifyDataSetChanged()

    }

    fun changeItem(position: Int){
        items[position] = "cambio"
        notifyDataSetChanged()
    }


    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: String, listener: (Int) -> Unit) = with(itemView) {
            txtTitulo.text = item

            setOnClickListener {
                listener(adapterPosition)

            }
        }

    }
}