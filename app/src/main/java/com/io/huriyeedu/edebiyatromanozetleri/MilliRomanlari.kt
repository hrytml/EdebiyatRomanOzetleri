package com.io.huriyeedu.edebiyatromanozetleri

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_milli_romanlari.*

class MilliRomanlari : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milli_romanlari)

        var milliRomanAdlari=resources.getStringArray(R.array.milliRomanlar)
        var milliYazarlar=resources.getStringArray(R.array.milliYazarlar)

        var myAdapter=RomanlarArrayAdapter(this, R.layout.romanlar,R.id.tvRomanAdi, milliRomanAdlari, milliYazarlar)
        //adapter için list nerde??
        listMilli.adapter=myAdapter
    }
}
