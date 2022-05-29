package com.example.fragmentcommunicationuserkotlin.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentcommunicationuserkotlin.Model.User
import com.example.fragmentcommunicationuserkotlin.R

class FirstFragment : Fragment() {

    var listener: FirtListener? = null
    var txt_first: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_first, container, false)
        txt_first = view.findViewById(R.id.txt_first)
        val b_first = view.findViewById<Button>(R.id.b_first)

        b_first.setOnClickListener {
            val user = User("Otabek", "Boboyev")
            listener!!.onFirstSend(user.toString())
        }
        return view
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is FirtListener) {
            context
        } else {
            throw RuntimeException(context.toString())
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    fun updateFirstText(str: String?) {
        txt_first!!.text = str
    }
    interface FirtListener {
        fun onFirstSend(str: String?)
    }

}