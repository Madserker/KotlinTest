package com.example.shurtado.kotlintest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log
import com.example.shurtado.kotlintest.Presenter.ListPresenter
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse


class Fragment1 : Fragment(), FragmentView {

    val presenter = ListPresenter(this)

    override fun showList(marvelList : List<MarvelCharactersDataResponse>) {
        Log.e("RESULT","asd")
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.doRequest()



    }


}