package net.adamhilton.androidkotlintesting

import android.app.Application
import android.support.annotation.CallSuper
import net.adamhilton.androidkotlintesting.injection.component.AppComponent
import net.adamhilton.androidkotlintesting.injection.component.DaggerAppComponent
import net.adamhilton.androidkotlintesting.injection.module.AppModule

open class App : Application() {

    lateinit var appComponent: AppComponent

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

