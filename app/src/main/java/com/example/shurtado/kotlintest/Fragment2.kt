package com.example.shurtado.kotlintest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shurtado.kotlintest.api.CharactersManager
import kotlinx.android.synthetic.main.fragment_fragment2.*

class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_fragment2, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cm = CharactersManager()
        cm.doRequest()
        while (cm.MarvelList.isEmpty()) {
            textitoguapo.text = cm.MarvelList[0].name
        }


    }
}