package com.example.task_053

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class CurrencyAdapter {
//}

class CurrencyAdapter : RecyclerView.Adapter<CurrencyAdapter.ViewHolder>() {

    private var currencyList = emptyList<Currency>()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(currency: Currency) {
            val imageCurrencyIV: ImageView = itemView.findViewById(R.id.imageCurrencyIV)
            val codeCurrencyTV: TextView = itemView.findViewById(R.id.codeCurrencyTV)
            val valueCurrencyTV: TextView = itemView.findViewById(R.id.valueCurrencyTV)

            imageCurrencyIV.setImageResource(currency.image)
            codeCurrencyTV.text = currency.code
            valueCurrencyTV.text = currency.value.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.currency_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currencyList[position])
    }

    override fun getItemCount(): Int = currencyList.size

    fun setData(currencyList: List<Currency>) {
        this.currencyList = currencyList
        notifyDataSetChanged()
    }
}