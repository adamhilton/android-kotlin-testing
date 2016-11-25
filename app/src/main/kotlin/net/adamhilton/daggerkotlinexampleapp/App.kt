package net.adamhilton.daggerkotlinexampleapp

import android.app.Application
import android.support.annotation.CallSuper
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import net.adamhilton.daggerkotlinexampleapp.injection.component.AppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.component.DaggerAppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule

open class App : Application() {

    val Instance: App
        get() = this

    val AppComponent: AppComponent
        get() = createAppComponent()

    val DataService: DataService
        get() = AppComponent.dataService()

    @CallSuper
    override fun onCreate() {
        super.onCreate()
    }

    open protected fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}

