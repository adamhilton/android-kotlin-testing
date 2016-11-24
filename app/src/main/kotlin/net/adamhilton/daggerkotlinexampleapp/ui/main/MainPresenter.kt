package net.adamhilton.daggerkotlinexampleapp.ui.main

class MainPresenter(private val view: MainScreenContract.View)
    : MainScreenContract.Presenter {

    override fun getData() {
        view.showData("Hi there from the main presenter!")
    }
}

