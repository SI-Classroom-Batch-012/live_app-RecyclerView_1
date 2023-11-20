package de.syntaxinstitut.liveapprecyclerview1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import de.syntaxinstitut.liveapprecyclerview1.data.Text
import de.syntaxinstitut.liveapprecyclerview1.databinding.ListItemBinding

class Textadapter(
    val dataset: List<Text>,
) : RecyclerView.Adapter<Textadapter.TextViewHolder>() {

    inner class TextViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {

        //Item laden welches in den Viewholder gehört
        val item = dataset[position]


        //Lade die Daten des item in das Layout
        holder.binding.contentTV.text = item.content

    }
}