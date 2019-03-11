package com.ayyulest.cobaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import com.hanks.htextview.base.HTextView;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCocok.setOnClickListener { randomJodoh() }
    }

    fun randomJodoh() {
        val randomCewe = Random().nextInt(5)+1
        val randomCowo = Random().nextInt(5)+1
        val drawableResCewe = when(randomCewe){
            1 ->R.drawable.cewe1
            2 ->R.drawable.cewe2
            3 ->R.drawable.cewe3
            4 ->R.drawable.cewe4
            else ->R.drawable.cewe5
        }
        val drawableResCowo = when(randomCowo){
            1 ->R.drawable.cowo1
            2 ->R.drawable.cowo2
            3 ->R.drawable.cowo3
            4 ->R.drawable.cowo4
            else ->R.drawable.cowo5
        }
        ivDadu1.setImageResource(drawableResCewe)
        ivDadu2.setImageResource(drawableResCowo)

    }
}
