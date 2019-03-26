package com.io.huriyeedu.edebiyatromanozetleri

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var romanDonemleri =arrayOf("Tanzimat Dönemi Eserleri","Servet-i Fünun Dönemi Eserleri","Milli Edebiyat Dönemi Eserleri")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var romanlarDonemleriAdapter=ArrayAdapter<String>(this, R.layout.donemler, R.id.tvDonemAdi, romanDonemleri)

        listRomanDonemleri.adapter=romanlarDonemleriAdapter

        listRomanDonemleri.setOnItemClickListener { parent, view, position, id ->

            if (position==0)

            {
            var intent=Intent(this@MainActivity, TanzimatRomanlari::class.java)
            startActivity(intent)
            }

            if (position==1)

            {
                var intent=Intent(this@MainActivity, ServetiRomanlari::class.java)
                startActivity(intent)
            }

            if (position==2)

            {
                var intent=Intent(this@MainActivity, MilliRomanlari::class.java)
                startActivity(intent)
            }
        }
    }
}
