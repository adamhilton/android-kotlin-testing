package net.adamhilton.daggerkotlinexampleapp.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import net.adamhilton.daggerkotlinexampleapp.R

class MainActivity : AppCompatActivity(), MainScreenContract.View {

    lateinit private var presenter: MainScreenContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUi()
    }

    fun initializeUi() {
        presenter = MainPresenter(this)
    }
}