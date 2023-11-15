package com.example.hana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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

        transactionList.add(createTransaction("09.07(목) 11:57:13", "타행이체(카카오뱅크)", "유정훈", "+ 610,000원", "잔액 1,209,630원"))
        transactionList.add(createTransaction("09.07(목) 19:16:41", "체크카드", "쓰리POPARENA", "- 10,000원", "잔액 1,199,630원"))
        transactionList.add(createTransaction("09.07(목) 19:24:49", "체크카드", "지에스리테일(GS2", "- 6,000원", "잔액 1,193,630원"))
        transactionList.add(createTransaction("09.07(목) 21:23:23", "체크카드", "미니스톱범박타운", "- 2,900원", "잔액 1,190,730원"))
        transactionList.add(createTransaction("09.08(금) 12:15:41", "타행이체(카카오뱅크)", "유정훈", "+ 1,809,000원", "잔액 2,999,730원"))

        transactionList.add(createTransaction("09.08(금) 12:15:43", "", "", "- 3,000,000원", "잔액 2,999,730원"))

        transactionList.add(createTransaction("09.08(금) 17:42:46", "체크카드", "감성커피부천범박", "- 3,500원", "잔액 2,996,230원"))
        transactionList.add(createTransaction("09.08(금) 17:52:46", "타행이체(카카오뱅크)", "임세혁", "+ 750,000원", "잔액 3,746,230원"))
        transactionList.add(createTransaction("09.08(금) 18:34:36", "당행송금", "임세혁", "- 1,500,000원", "잔액 2,246,230원"))
        transactionList.add(createTransaction("09.08(금) 19:43:33", "체크카드", "미니스톱범박타운", "- 1,900원", "잔액 2,244,330원"))
        transactionList.add(createTransaction("09.08(금) 21:03:10", "타행송금(신한은행)", "김민철", "- 1,170,000원", "잔액 1,074,330원"))
        transactionList.add(createTransaction("09.08(금) 21:05:21", "체크카드", "제노PC방", "- 5,000원", "잔액 1,069,330원"))
        transactionList.add(createTransaction("09.09(토) 06:15:43", "타행이체(카카오뱅크)", "유정훈", "+ 80,000원", "잔액 1,149,330원"))
        transactionList.add(createTransaction("09.09(토) 06:19:16", "타행이체(카카오뱅크)", "유정훈", "+ 100,000원", "잔액 1,249,330원"))
        transactionList.add(createTransaction("09.09(토) 12:19:16", "체크카드", "제노PC방", "- 2,000원", "잔액 1,247,330원"))
        transactionList.add(createTransaction("09.10(일) 07:00:14", "대체", "카카오페이", "- 10,000원", "잔액 1,237,330원"))
        transactionList.add(createTransaction("09.10(일) 15:52:51", "체크카드", "박가네들깨칼국수", "- 19,000원", "잔액 1,218,330원"))
        transactionList.add(createTransaction("09.10(일) 19:32:37", "체크카드", "㈜뉴스마트파킹", "- 4,600원", "잔액 1,213,730원"))
        transactionList.add(createTransaction("09.10(일) 21:35:27", "체크카드", "(유)아이러브떡볶", "- 57,400원", "잔액 1,156,330원"))
        transactionList.add(createTransaction("09.11(월) 01:40:40", "체크카드", "씨유(CU)신정파인", "- 8,600원", "잔액 1,147,730원"))
        transactionList.add(createTransaction("09.11(월) 07:04:31", "보험료", "메리츠001건", "- 189,590원", "잔액 958,140원"))
        transactionList.add(createTransaction("09.11(월) 10:18:31", "체크카드", "Wavve(자동)_페이", "- 10,900원", "잔액 947,240원"))
        transactionList.add(createTransaction("09.11(월) 20:11:21", "체크카드", "㈜우아한형제들", "- 15,700원", "잔액 931,540원"))
        transactionList.add(createTransaction("09.12(화) 10:54:31", "체크카드", "메가엠지씨커피오", "- 6,000원", "잔액 925,540원"))
        transactionList.add(createTransaction("09.12(화) 14:29:46", "대체", "카카오페이", "- 10,000원", "잔액 915,540원"))
        transactionList.add(createTransaction("09.13(수) 08:45:08", "체크카드", "㈜우아한형제들", "- 25,500원", "잔액 890,040원"))
        transactionList.add(createTransaction("09.13(수) 16:45:10", "체크카드", "미니스톱범박타운", "- 3,800원", "잔액 886,240원"))
        transactionList.add(createTransaction("09.13(수) 18:29:24", "체크카드", "미니스톱범박타운", "- 2,100원", "잔액 884,140원"))
        transactionList.add(createTransaction("09.14(목) 15:18:13", "체크카드", "쓰리POPARENA", "- 5,000원", "잔액 879,140원"))
        transactionList.add(createTransaction("09.14(목) 16:43:22", "체크카드", "지에스리테일(GS2", "- 2,150원", "잔액 876,990원"))
        transactionList.add(createTransaction("09.14(목) 19:29:32", "체크카드", "㈜우아한형제들", "- 22,900원", "잔액 854,090원"))
        transactionList.add(createTransaction("09.15(금) 02:46:45", "대체", "PAYCO결제 : ( N H N페이코-오픈뱅킹)", "- 11,000원", "잔액 843,090원"))
        transactionList.add(createTransaction("09.15(금) 04:42:33", "통신요금", "LGU56188954", "- 20,900원", "잔액 822,190원"))
        transactionList.add(createTransaction("09.15(금) 07:11:21", "보험료", "메리츠002건", "- 26,580원", "잔액 795,610원"))
        transactionList.add(createTransaction("09.15(금) 13:56:17", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 791,810원"))
        transactionList.add(createTransaction("09.15(금) 15:06:48", "체크카드", "피시매니아", "- 5,000원", "잔액 786,810원"))
        transactionList.add(createTransaction("09.15(금) 17:12:12", "체크카드", "메가엠지씨커피오", "- 6,000원", "잔액 780,810원"))
        transactionList.add(createTransaction("09.16(토) 07:12:06", "", "(예금이자 223 소득세 30 지방소득세 0)", "+ 193원", "잔액 781,003원"))
        transactionList.add(createTransaction("09.16(토) 10:11:35", "대체", "카카오페이", "- 10,000원", "잔액 771,003원"))
        transactionList.add(createTransaction("09.17(일) 00:14:03", "체크카드", "㈜우아한형제들", "- 23,500원", "잔액 747,503원"))
        transactionList.add(createTransaction("09.18(월) 20:55:57", "타행송금(신한은행)", "김민철", "- 150,000원", "잔액 597,503원"))
        transactionList.add(createTransaction("09.18(월) 21:23:51", "체크카드", "㈜우아한형제들_T", "- 17,600원", "잔액 579,903원"))
        transactionList.add(createTransaction("09.19(화) 02:19:10", "대체", "한전(임채빈)", "- 113,590원", "잔액 466,313원"))
        transactionList.add(createTransaction("09.19(화) 11:20:50", "타행이체(카카오뱅크)", "유정훈", "+ 50,000원", "잔액 516,313원"))
        transactionList.add(createTransaction("09.19(화) 14:08:31", "대체", "임세혁", "+ 500,000원", "잔액 1,016,313원"))
        transactionList.add(createTransaction("09.19(화) 14:16:50", "타행송금(신한은행)", "김성호", "- 577,500원", "잔액 438,813원"))
        transactionList.add(createTransaction("09.19(화) 16:18:48", "체크카드", "메가엠지씨커피오", "- 3,000원", "잔액 435,813원"))
        transactionList.add(createTransaction("09.19(화) 21:53:52", "체크카드", "씨유(CU)신정파인", "- 6,800원", "잔액 429,013원"))
        transactionList.add(createTransaction("09.20(수) 07:21:11", "통신요금", "KT4911895409", "- 149,140원", "잔액 279,873원"))
        transactionList.add(createTransaction("09.21(목) 16:22:46", "체크카드", "미가김밥", "- 6,000원", "잔액 273,873원"))
        transactionList.add(createTransaction("09.22(금) 20:26:29", "대체", "카카오페이", "- 10,000원", "잔액 263,873원"))
        transactionList.add(createTransaction("09.22(금) 20:32:28", "대체", "PAYCO결제 : ( N H N페이코-오픈뱅킹)", "- 11,000원", "잔액 252,873원"))
        transactionList.add(createTransaction("09.23(토) 15:23:26", "대체", "카카오페이", "- 10,000원", "잔액 242,873원"))
        transactionList.add(createTransaction("09.23(토) 15:40:55", "대체", "카카오페이", "- 80,000원", "잔액 162,872원"))
        transactionList.add(createTransaction("09.23(토) 16:19:55", "체크카드", "㈜옥길충전소현", "- 50,000원", "잔액 112,873원"))
        transactionList.add(createTransaction("09.23(토) 16:21:40", "체크카드", "㈜옥길충전소현", "- 50,000원", "잔액 62,873원"))
        transactionList.add(createTransaction("09.23(토) 16:23:11", "체크카드", "㈜옥길충전소현", "+ 50,000원", "잔액 112,873원"))
        transactionList.add(createTransaction("09.23(토) 16:25:17", "체크카드", "㈜옥길충전소현", "- 4,000원", "잔액 108,873원"))
        transactionList.add(createTransaction("09.23(토) 16:38:13", "대체", "카카오페이", "- 14,485원", "잔액 94,388원"))
        transactionList.add(createTransaction("09.24(일) 02:42:56", "체크카드", "지에스리테일(GS2", "- 7,400원", "잔액 86,988원"))
        transactionList.add(createTransaction("09.24(일) 12:22:46", "체크카드", "㈜우아한형제들_T", "- 32,400원", "잔액 54,588원"))
        transactionList.add(createTransaction("09.25(월) 05:46:15", "대체", "카카오페이", "- 10,000원", "잔액 44,588원"))
        transactionList.add(createTransaction("09.25(월) 14:11:58", "보험료", "라이나09046", "- 39,350원", "잔액 5,238원"))
        transactionList.add(createTransaction("09.25(월) 19:10:28", "체크카드", "세븐일레븐범박타", "- 2,900원", "잔액 2,338원"))
        transactionList.add(createTransaction("09.25(월) 21:56:21", "타행이체(카카오뱅크)", "유정훈", "+ 5,000원", "잔액 7,338원"))
        transactionList.add(createTransaction("09.30(토) 20:48:24", "체크카드", "더벤티전주휴먼시", "- 2,800원", "잔액 4,538원"))
        transactionList.add(createTransaction("10.04(수) 05:22:17", "하나카드", "하나카드", "- 3,300원", "잔액 1,238원"))
        transactionList.add(createTransaction("10.06(금) 21:00:33", "대체", "유정훈", "+ 1,800,000원", "잔액 2,401,238원"))

        transactionList.add(createTransaction("10.06(금) 21:03:48", "", "", "- 3,200,000원", "잔액 2,401,238원"))

        transactionList.add(createTransaction("10.06(금) 21:01:59", "타행이체(카카오뱅크)", "유정훈", "+ 1,350,000원", "잔액 3,151,238원"))
        transactionList.add(createTransaction("10.06(금) 21:03:45", "대체", "유정훈", "+ 54,500원", "잔액 3,205,738원"))
        transactionList.add(createTransaction("10.06(금) 22:21:55", "당행송금", "임세혁", "- 750,000원", "잔액 2,455,738원"))
        transactionList.add(createTransaction("10.06(금) 22:24:27", "타행송금(신한은행)", "김민철", "- 450,000원", "잔액 2,005,738원"))
        transactionList.add(createTransaction("10.07(토) 01:03:51", "대체", "카카오페이", "- 31,494원", "잔액 1,974,244원"))
        transactionList.add(createTransaction("10.07(토) 13:02:26", "체크카드", "㈜우아한형제들_T", "- 25,800원", "잔액 1,948,444원"))
        transactionList.add(createTransaction("10.07(토) 15:22:16", "대체", "카카오페이", "- 30,000원", "잔액 1,918,444원"))
        transactionList.add(createTransaction("10.07(토) 17:36:41", "대체", "에스엠하이플러스 주", "- 50,000원", "잔액 1,868,444원"))
        transactionList.add(createTransaction("10.07(토) 17:37:24", "대체", "카카오페이", "- 10,000원", "잔액 1,858,444원"))
        transactionList.add(createTransaction("10.07(토) 17:42:53", "체크카드", "KH직영오산주유소", "- 20,000원", "잔액 1,838,444원"))
        transactionList.add(createTransaction("10.07(토) 18:11:23", "체크카드", "우리유통주식회사", "- 20,000원", "잔액 1,818,444원"))
        transactionList.add(createTransaction("10.07(토) 21:27:44", "체크카드", "일층집", "- 42,300원", "잔액 1,776,144원"))
        transactionList.add(createTransaction("10.07(토) 21:45:31", "체크카드", "전주시시설관리공", "- 1,800원", "잔액 1,774,344원"))
        transactionList.add(createTransaction("10.08(일) 13:38:12", "체크카드", "한옥마을주유소", "- 80,000원", "잔액 1,694,344원"))
        transactionList.add(createTransaction("10.08(일) 15:41:33", "체크카드", "㈜라보테", "- 38,000원", "잔액 1,656,344원"))
        transactionList.add(createTransaction("10.08(일) 19:50:16", "체크카드", "아이술크림", "- 6,000원", "잔액 1,650,344원"))
        transactionList.add(createTransaction("10.08(일) 23:57:56", "체크카드", "지에스25서부스카", "- 32,300원", "잔액 1,618,044원"))
        transactionList.add(createTransaction("10.08(일) 23:58:10", "체크카드", "지에스25서부스카", "- 100원", "잔액 1,617,944원"))
        transactionList.add(createTransaction("10.08(일) 23:58:10", "체크카드", "지에스25서부스카", "- 100원", "잔액 1,617,944원"))
        transactionList.add(createTransaction("10.09(월) 19:02:15", "체크카드", "화심순두부전주점", "- 36,000원", "잔액 1,581,944원"))
        transactionList.add(createTransaction("10.09(월) 21:45:30", "체크카드", "㈜예현", "- 16,000원", "잔액 1,565,944원"))
        transactionList.add(createTransaction("10.10(화) 06:24:02", "대체", "카카오페이", "- 10,000원", "잔액 1,555,944원"))
        transactionList.add(createTransaction("10.10(화) 14:16:00", "체크카드", "트레이더스부천점", "- 7,500원", "잔액 1,548,444원"))
        transactionList.add(createTransaction("10.10(화) 14:17:25", "체크카드", "트레이더스부천점", "- 208,940원", "잔액 1,339,504원"))
        transactionList.add(createTransaction("10.11(수) 07:04:41", "보험료", "메리츠001건", "- 189,590원", "잔액 1,149,914원"))
        transactionList.add(createTransaction("10.11(수) 09:34:44", "타행이체(신한은행)", "양천구지방소득", "+ 27,290원", "잔액 1,177,204원"))
        transactionList.add(createTransaction("10.11(수) 10:16:23", "체크카드", "Wavve(자동)_페이", "- 10,900원", "잔액 1,166,304원"))
        transactionList.add(createTransaction("10.13(금) 21:02:12", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 1,162,504원"))
        transactionList.add(createTransaction("10.14(토) 13:06:12", "체크카드", "임꺽정김치찌개", "- 30,000원", "잔액 1,132,504원"))
        transactionList.add(createTransaction("10.14(토) 14:05:52", "체크카드", "메가엠지씨커피오", "- 12,000원", "잔액 1,120,504원"))
        transactionList.add(createTransaction("10.15(일) 03:05:23", "대체", "카카오페이", "- 10,000원", "잔액 1,110,504원"))
        transactionList.add(createTransaction("10.16(월) 07:01:21", "통신비", "LGU56188954", "- 20,900원", "잔액 1,089,604원"))
        transactionList.add(createTransaction("10.16(월) 07:03:45", "보험료", "메리츠002건", "- 26,580원", "잔액 1,063,024원"))
        transactionList.add(createTransaction("10.16(월) 20:48:02", "체크카드", "피자스툴오목교역", "- 9,900원", "잔액 1,053,124원"))
        transactionList.add(createTransaction("10.17(화) 16:01:07", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 1,049,324원"))
        transactionList.add(createTransaction("10.19(목) 12:16:23", "타행이체(카카오뱅크)", "인재모", "- 390,000원", "잔액 659,324원"))
        transactionList.add(createTransaction("10.19(목) 14:27:28", "대체", "카카오페이", "- 70,000원", "잔액 589,324원"))
        transactionList.add(createTransaction("10.19(목) 14:28:11", "대체", "카카오페이", "- 10,000원", "잔액 579,324원"))
        transactionList.add(createTransaction("10.19(목) 20:55:07", "체크카드", "미가김밥", "- 6,000원", "잔액 573,324원"))
        transactionList.add(createTransaction("10.19(목) 21:03:02", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 569,524원"))
        transactionList.add(createTransaction("10.20(금) 18:30:56", "체크카드", "㈜아이에스피에", "- 50,000원", "잔액 519,524원"))
        transactionList.add(createTransaction("10.21(토) 08:08:15", "대체", "카카오페이", "- 10,000원", "잔액 509,524원"))
        transactionList.add(createTransaction("10.21(토) 18:49:37", "대체", "카카오페이", "- 28,992원", "잔액 480,532원"))
        transactionList.add(createTransaction("10.22(일) 12:48:42", "체크카드", "보석비빔밥", "- 19,000원", "잔액 461,532원"))
        transactionList.add(createTransaction("10.22(일) 12:57:47", "체크카드", "컴포즈커피부천역", "- 9,600원", "잔액 451,932원"))
        transactionList.add(createTransaction("10.23(월) 05:07:32", "통신요금", "KT4911895410", "- 149,140원", "잔액 302,792원"))
        transactionList.add(createTransaction("10.23(월) 23:19:40", "체크카드", "㈜우아한형제들", "- 13,100원", "잔액 289,692원"))
        transactionList.add(createTransaction("10.23(화) 14:19:22", "대체", "카카오페이", "- 10,000원", "잔액 279,692원"))
        transactionList.add(createTransaction("10.25(수) 13:43:06", "보험료", "라이나10047", "- 39,350원", "잔액 240,342원"))
        transactionList.add(createTransaction("10.25(수) 16:54:54", "대체", "건강임세혁", "- 22,310원", "잔액 218,032원"))
        transactionList.add(createTransaction("10.25(수) 16:56:29", "대체", "한전(임채빈)", "- 69,900원", "잔액 148,132원"))
        transactionList.add(createTransaction("10.25(수) 19:21:22", "체크카드", "㈜우아한형제들_T", "- 14,500원", "잔액 133,632원"))
        transactionList.add(createTransaction("10.26(목) 16:12:11", "체크카드", "지에스리테일(GS2", "- 4,200원", "잔액 129,432원"))
        transactionList.add(createTransaction("10.27(금) 16:59:54", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 125,632원"))
        transactionList.add(createTransaction("10.28(토) 08:36:26", "대체", "카카오페이", "- 10,000원", "잔액 115,632원"))
        transactionList.add(createTransaction("10.28(토) 14:45:12", "체크카드", "메가엠지씨커피오", "- 9,900원", "잔액 105,732원"))
        transactionList.add(createTransaction("10.29(일) 14:11:13", "체크카드", "도미노피자부천옥", "- 18,000원", "잔액 87,732원"))
        transactionList.add(createTransaction("10.29(일) 14:43:07", "체크카드", "지에스25부천역곡", "- 6,900원", "잔액 80,832원"))
        transactionList.add(createTransaction("10.31(화) 15:31:26", "체크카드", "김종구부산어묵", "- 9,000원", "잔액 71,832원"))
        transactionList.add(createTransaction("10.31(화) 18:34:32", "체크카드", "지에스25(GS25)옥", "- 13,500원", "잔액 58,332원"))
        transactionList.add(createTransaction("11.01(수) 01:43:30", "체크카드", "㈜우아한형제들", "- 17,400원", "잔액 40,932원"))
        transactionList.add(createTransaction("11.01(수) 04:33:41", "하나카드", "하나카드", "- 300원", "잔액 40,632원"))
        transactionList.add(createTransaction("11.02(목) 15:57:01", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 36,832원"))
        transactionList.add(createTransaction("11.04(토) 12:32:11", "체크카드", "진미옥설렁탕", "- 20,000원", "잔액 16,832원"))
        transactionList.add(createTransaction("11.06(월) 03:11:03", "체크카드", "씨유(CU)신정파인", "- 3,800원", "잔액 13,032원"))
        transactionList.add(createTransaction("11.07(화) 17:18:41", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 9,232원"))
        transactionList.add(createTransaction("11.08(수) 21:07:20", "타행이체(카카오뱅크)", "유정훈", "+ 3,200,000원", "잔액 3,209,232원"))
        transactionList.add(createTransaction("11.08(수) 21:32:11", "", "", "- 3,200,000원", "잔액 9,232원"))
        transactionList.add(createTransaction("11.08(수) 21:47:24", "대체", "임세혁", "+ 2,450,000원", "잔액 2,459,232원"))
        transactionList.add(createTransaction("11.08(수) 21:48:11", "타행송금(신한은행)", "김민철", "- 250,000원", "잔액 2,209,232원"))
        transactionList.add(createTransaction("11.08(수) 22:10:37", "체크카드", "㈜우아한형제들", "- 17,000원", "잔액 2,192,232원"))
        transactionList.add(createTransaction("11.10(금) 12:52:30", "체크카드", "신촌신쭈꾸미부천", "- 24,000원", "잔액 2,168,232원"))
        transactionList.add(createTransaction("11.10(금) 15:55:20", "체크카드", "㈜디오티디부천", "- 70,000원", "잔액 2,098,232원"))
        transactionList.add(createTransaction("11.10(금) 16:07:14", "체크카드", "세븐일레븐범박타", "- 3,800원", "잔액 2,094,432원"))
        transactionList.add(createTransaction("11.11(토) 10:14:50", "체크카드", "Wavve(자동)_페이", "- 10,900원", "잔액 2,083,532원"))
        transactionList.add(createTransaction("11.11(토) 16:12:32", "대체", "카카오페이", "- 10,000원", "잔액 2,073,532원"))
        transactionList.add(createTransaction("11.11(토) 16:34:09", "대체", "카카오페이", "- 70,000원", "잔액 2,003,532원"))
        transactionList.add(createTransaction("11.11(토) 17:37:54", "체크카드", "STCO목동상설점", "- 228,900원", "잔액 1,774,632원"))
        transactionList.add(createTransaction("11.11(토) 19:20:01", "체크카드", "㈜커피빈코리아", "- 17,030원", "잔액 1,757,602원"))
        transactionList.add(createTransaction("11.11(토) 22:35:52", "체크카드", "모이자", "- 75,000원", "잔액 1,682,602원"))
        transactionList.add(createTransaction("11.12(일) 01:55:15", "체크카드", "지에스리테일(GS2", "- 4,000원", "잔액 1,678,602원"))
        transactionList.add(createTransaction("11.12(일) 17:05:38", "체크카드", "콩심", "- 11,000원", "잔액 1,667,602원"))
        transactionList.add(createTransaction("11.12(일) 17:55:17", "대체", "카카오페이", "- 10,000원", "잔액 1,657,602원"))
        transactionList.add(createTransaction("11.12(일) 18:21:11", "대체", "카카오페이", "- 37,886원", "잔액 1,619,716원"))
        transactionList.add(createTransaction("11.13(월) 00:02:59", "체크카드", "㈜우아한형제들", "- 22,400원", "잔액 1,597.316원"))
        transactionList.add(createTransaction("11.13(월) 04:36:21", "대체", "카카오페이", "- 175,226원", "잔액 1,422,090원"))
        transactionList.add(createTransaction("11.13(월) 07:03:45", "보험료", "메리츠001건", "- 189,590원", "잔액 1,232,500원"))

        transactionList.reverse()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = TransactionListAdapter(transactionList)
    }

    // 숫자만 추출하는 함수
    fun extractNumberFromString(s: String): Long {
        // 숫자와 쉼표만 남기고 모든 문자 제거
        val numberString = s.filter { it.isDigit() || it == ',' }
            .replace(",", "") // 쉼표 제거
        return numberString.toLongOrNull() ?: 0L // 숫자로 변환
    }

    // Transaction 객체를 생성하는 함수
    fun createTransaction(date: String, category: String, client: String, transaction: String, balance: String): Transaction {
        val currentBalance = extractNumberFromString(balance)
        val newBalance = currentBalance + 3_800_000 // 3,800,000을 더함

        // 새 잔액을 형식에 맞게 문자열로 변환
        val newBalanceString = "잔액 ${String.format("%,d", newBalance)}원"

        return Transaction(date, category, client, transaction, newBalanceString)
    }
    
}