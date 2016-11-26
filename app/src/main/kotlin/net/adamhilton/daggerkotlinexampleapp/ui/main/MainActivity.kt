package net.adamhilton.daggerkotlinexampleapp.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import net.adamhilton.daggerkotlinexampleapp.App
import net.adamhilton.daggerkotlinexampleapp.R
import net.adamhilton.daggerkotlinexampleapp.injection.component.DaggerMainScreenComponent
import net.adamhilton.daggerkotlinexampleapp.injection.module.MainScreenModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreenContract.View {

    @Inject
    lateinit var presenter: MainPresenter

    @BindView(R.id.data)
    lateinit var data: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        DaggerMainScreenComponent.builder()
                .appComponent(App.appComponent)
                .mainScreenModule(MainScreenModule(this))
                .build()
                .inject(this)
    }

    @OnClick(R.id.get_data_button)
    fun getDataButtonClicked() {
        presenter.getData()
    }

    override fun showData(data: String) {
        this.data.text = data
    }
}