package com.example.hana

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.hana.data.Account
import com.example.hana.data.Transaction
import com.example.hana.databinding.ActivityHistoryBinding
import com.example.hana.databinding.ActivityMainBinding
import com.example.hana.ui.adaptor.AccountListAdapter
import com.example.hana.ui.adaptor.TransactionListAdapter

class HistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        var transactionList: MutableList<Transaction> = mutableListOf()
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))
        transactionList.add(Transaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "-3,500원", "잔액 2,996,230원"))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = TransactionListAdapter(transactionList)
    }

}