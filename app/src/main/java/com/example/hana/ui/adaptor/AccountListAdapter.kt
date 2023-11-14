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

class AccountListAdapter(private val dataList: MutableList<Account>) :
    RecyclerView.Adapter<AccountListAdapter.ViewHolder>(), TextToSpeech.OnInitListener  {



    var context: Context? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName : TextView = itemView.findViewById(R.id.text_name)
        val textNumber: TextView = itemView.findViewById(R.id.text_number)
        val textBalance: TextView = itemView.findViewById(R.id.text_balance)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context)
            .inflate(R.layout.account_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val account = dataList[position]

        holder.textName.text = account.name
        holder.textNumber.text = account.number
        holder.textBalance.text = account.balance
        holder.textBalance.setOnClickListener {
            val intent = Intent(context, HistoryActivity::class.java)
            context?.startActivity(intent)
        }
    }

    override fun onInit(p0: Int) {
    }

}