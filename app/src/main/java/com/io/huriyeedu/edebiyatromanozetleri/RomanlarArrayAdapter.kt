package com.io.huriyeedu.edebiyatromanozetleri

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.romanlar.view.*

/**
 * Created by apple on 7.03.2019.
 */
class RomanlarArrayAdapter(var gelenContext: Context?, resource: Int, textViewResourceId: Int, var milliRomanlar: Array<String>, var milliYazarlar: Array<String>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, milliRomanlar) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var inflater=LayoutInflater.from(gelenContext)
        var tek_satir_view=inflater.inflate(R.layout.romanlar, parent, false)

        var romanAdi=tek_satir_view.tvRomanAdi
        var romanYazari=tek_satir_view.tvYazarAdi

        romanAdi.setText(milliRomanlar[position])
        romanYazari.setText(milliYazarlar[position])



        return tek_satir_view
    }


}