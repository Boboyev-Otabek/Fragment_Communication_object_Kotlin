package com.example.fragmentcommunicationuserkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentcommunicationuserkotlin.Fragment.FirstFragment
import com.example.fragmentcommunicationuserkotlin.Fragment.SecondFragment

class RuntimeActivity : AppCompatActivity(), FirstFragment.FirtListener, SecondFragment.SecondListener {
    lateinit var firstFragment: FirstFragment
    lateinit var secondFragment: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime)
        initViews()
    }


    fun initViews() {
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().replace(R.id.firstfragnent, firstFragment)
            .replace(R.id.secondfragment, secondFragment).commit()

    }

    override fun onFirstSend(str: String?) {
       secondFragment.updateSecondtext(str)
    }

    override fun onSecondSend(str: String?) {
        firstFragment.updateFirstText(str)
    }
}