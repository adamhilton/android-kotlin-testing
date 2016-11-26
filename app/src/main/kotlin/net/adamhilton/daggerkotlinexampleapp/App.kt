package net.adamhilton.daggerkotlinexampleapp

import android.app.Application
import android.support.annotation.CallSuper
import net.adamhilton.daggerkotlinexampleapp.injection.component.AppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.component.DaggerAppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule

open class App : Application() {

    companion object {
        @JvmStatic lateinit var appComponent: AppComponent
    }

    @CallSuper
    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    open protected fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}

