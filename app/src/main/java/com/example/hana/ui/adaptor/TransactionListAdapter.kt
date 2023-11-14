package com.example.hana.ui.adaptor

import android.content.Context
import android.content.Intent
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hana.HistoryActivity
import com.example.hana.R
import com.example.hana.data.Account
import com.example.hana.data.Transaction

class TransactionListAdapter(private val dataList: MutableList<Transaction>) :
    RecyclerView.Adapter<TransactionListAdapter.ViewHolder>(), TextToSpeech.OnInitListener  {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textDate : TextView = itemView.findViewById(R.id.text_date)
        val textCategory: TextView = itemView.findViewById(R.id.text_category)
        val textClient: TextView = itemView.findViewById(R.id.text_client)
        val textTransaction: TextView = itemView.findViewById(R.id.text_transaction)
        val textBalance: TextView = itemView.findViewById(R.id.text_balance)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val account = dataList[position]

        holder.textDate.text = account.date
        holder.textCategory.text = account.category
        holder.textClient.text = account.client
        holder.textTransaction.text = account.transaction
        holder.textBalance.text = account.balance
    }

    override fun onInit(p0: Int) {
    }

}