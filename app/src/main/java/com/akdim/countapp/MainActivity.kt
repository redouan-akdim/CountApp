package com.akdim.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.akdim.countapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val count = Counter()

    private lateinit var incrementButton: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //incrementButton = findViewById(R.id.increment_button)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        incrementButton = binding.incrementButton
        textView = binding.tv1

        //textView.setText(count.getCount())

        incrementButton.setOnClickListener{
            count.addCount()
            textView.text = count.getCount().toString()
        }
    }


   /* .incre
    count = Counter()
    display = binding.tv1   (tv1 the id I gave my textview. Yours might be different)
    btn = binding.btn1 (btn1 the id I gave my button. Yours might be different)


    btn.setOnClickListener {
        count!!.addCount()

        display?.setText(count.getCount().toString())

    }*/

}