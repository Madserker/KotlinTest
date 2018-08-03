package com.example.shurtado.kotlintest

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log
import android.widget.*
import android.widget.ListAdapter
import com.bumptech.glide.annotation.GlideModule
import com.example.shurtado.kotlintest.Presenter.ListPresenter
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import kotlinx.android.synthetic.main.fragment_fragment1.*


class Fragment1 : Fragment(), FragmentView {

    val presenter = ListPresenter(this)

    lateinit var listView : ListView


    override fun showList(marvelList : List<MarvelCharactersDataResponse>) {
        listView = recipe_list_view
        listView.adapter = ListAdapter(activity.applicationContext,marvelList)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.doRequest()


    }
}



class ListAdapter(context : Context, list : List<MarvelCharactersDataResponse>): BaseAdapter(){

    private val mContext : Context
    private val mList : List<MarvelCharactersDataResponse>

    init{
        mContext=context
        mList = list
    }

    override fun getItem(p0: Int): Any {
        return 5
    }

    override fun getItemId(p0: Int): Long {
        return 5
    }

    override fun getCount(): Int {
        return mList.size
    }

    //Se ejecuta por cada fila de la tabla
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val textView = TextView(mContext)
        textView.text = mList[position].name
        return textView
    }


}

