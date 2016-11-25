package net.adamhilton.daggerkotlinexampleapp.ui.main

import net.adamhilton.daggerkotlinexampleapp.App
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService

class MainPresenter(private val view: MainScreenContract.View)
    : MainScreenContract.Presenter {

    private val dataService: DataService = App.DataService

    override fun getData() {
        view.showData(dataService.getData())
    }
}