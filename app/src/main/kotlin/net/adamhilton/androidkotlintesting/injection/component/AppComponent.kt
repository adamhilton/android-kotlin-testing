package net.adamhilton.androidkotlintesting.injection.component

import android.content.Context
import dagger.Component
import net.adamhilton.androidkotlintesting.data.remote.DataService
import net.adamhilton.androidkotlintesting.injection.module.AppModule
import net.adamhilton.androidkotlintesting.injection.module.DataModule
import net.adamhilton.androidkotlintesting.injection.qualifier.AppContext
import net.adamhilton.androidkotlintesting.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(AppModule::class, DataModule::class))
interface AppComponent {

    @AppContext
    fun context(): Context

    fun dataService(): DataService

}

