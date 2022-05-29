package com.example.fragmentcommunicationuserkotlin.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentcommunicationuserkotlin.R

class SecondFragment : Fragment() {
    var txt_second: TextView? = null
    var listener: SecondListener? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_second, container, false)
        txt_second = view.findViewById(R.id.txt_second)
        val b_second = view.findViewById<Button>(R.id.b_second)
        b_second.setOnClickListener { listener!!.onSecondSend("Raxmat") }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is SecondListener) {
            context
        } else {
            throw RuntimeException(context.toString())
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    fun updateSecondtext(str: String?) {
        txt_second!!.text = str
    }
    interface SecondListener {
        fun onSecondSend(str: String?)
    }
}