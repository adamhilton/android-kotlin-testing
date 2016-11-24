package net.adamhilton.daggerkotlinexampleapp.ui.main

class MainScreenContract {

    interface View {
        fun  showData(data: String)
    }
    interface Presenter {
        fun getData()
    }
}
