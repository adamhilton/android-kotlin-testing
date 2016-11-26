package net.adamhilton.daggerkotlinexampleapp.ui.main

import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import javax.inject.Inject

class MainPresenter @Inject constructor(private val view: MainScreenContract.View, private val dataService: DataService)
    : MainScreenContract.Presenter {

    override fun getData() {
        view.showData(dataService.getData())
    }
}