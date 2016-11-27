package net.adamhilton.androidkotlintesting.ui.main

import net.adamhilton.androidkotlintesting.data.remote.DataService
import javax.inject.Inject

class MainPresenter @Inject constructor(private val view: MainScreenContract.View, private val dataService: DataService)
    : MainScreenContract.Presenter {

    override fun getData() {
        view.showData(dataService.getData())
    }
}