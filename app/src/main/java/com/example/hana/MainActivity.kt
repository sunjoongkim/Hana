package com.example.hana

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.hana.data.Account
import com.example.hana.databinding.ActivityMainBinding
import com.example.hana.ui.adaptor.AccountListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()

        var accountList: MutableList<Account> = mutableListOf()
        accountList.add(Account("하나신세대 저축예금", "입출금 141-002342-38421", "51,200"))
        accountList.add(Account("행복knowhow통장", "입출금 141-910364-09707", "1,032,500"))
        accountList.add(Account("하나닷컴통장", "입출금 141-223001-98871", "123,600"))
        binding.viewPager.adapter = AccountListAdapter(accountList)
        binding.viewPager.currentItem = 1
        binding.viewPager.setPageTransformer(MarginPageTransformer(100))
        binding.viewPager.offscreenPageLimit = 1
        binding.viewPager.setPadding(200, 0, 200, 0)
    }

}