package net.adamhilton.daggerkotlinexampleapp.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import net.adamhilton.daggerkotlinexampleapp.App
import net.adamhilton.daggerkotlinexampleapp.R

class MainActivity : AppCompatActivity(), MainScreenContract.View {

    lateinit private var presenter: MainScreenContract.Presenter

    @BindView(R.id.data)
    lateinit var data: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        presenter = MainPresenter(this, (application as App).DataService)
    }

    @OnClick(R.id.get_data_button)
    fun getDataButtonClicked() {
        presenter.getData()
    }

    override fun showData(data: String) {
        this.data.text = data
    }
}