package net.adamhilton.daggerkotlinexampleapp

import android.app.Application
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import net.adamhilton.daggerkotlinexampleapp.injection.component.AppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.component.DaggerAppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule

open class App : Application() {

    companion object {
        @JvmStatic lateinit var Instance: App
        @JvmStatic lateinit var AppComponent: AppComponent
        @JvmStatic lateinit var DataService: DataService
    }

    override fun onCreate() {
        super.onCreate()
        Instance = this
        AppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        DataService = AppComponent.dataService()
    }

}

