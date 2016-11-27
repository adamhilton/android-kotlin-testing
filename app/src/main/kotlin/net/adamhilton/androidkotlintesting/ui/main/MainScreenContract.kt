package net.adamhilton.androidkotlintesting.ui.main

class MainScreenContract {

    interface View {
        fun  showData(data: String)
    }
    interface Presenter {
        fun getData()
    }
}
