package com.example.kotlin_first.second_assignment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.kotlin_first.R

class Frgment : Fragment() {

    private lateinit var mRunnable:Runnable;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment,container,false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var text1 = view.findViewById<TextView>(R.id.text1);
        var text2 = view.findViewById<TextView>(R.id.text2);

        mRunnable = Runnable {
            text1.setText(R.string.temp_string);
        }
        Handler().postDelayed(mRunnable,2000);

    }

}