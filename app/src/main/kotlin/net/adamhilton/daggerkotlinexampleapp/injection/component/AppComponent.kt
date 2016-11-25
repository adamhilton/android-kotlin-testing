package net.adamhilton.daggerkotlinexampleapp.injection.component

import android.content.Context
import dagger.Component
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule
import net.adamhilton.daggerkotlinexampleapp.injection.module.DataModule
import net.adamhilton.daggerkotlinexampleapp.injection.qualifier.AppContext
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(AppModule::class, DataModule::class))
interface AppComponent {

    @AppContext
    fun context(): Context

    fun dataService(): DataService

}

