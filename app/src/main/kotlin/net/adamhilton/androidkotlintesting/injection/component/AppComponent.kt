package net.adamhilton.androidkotlintesting.injection.component

import dagger.Component
import net.adamhilton.androidkotlintesting.data.remote.DataService
import net.adamhilton.androidkotlintesting.injection.module.DataModule
import net.adamhilton.androidkotlintesting.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(DataModule::class))
interface AppComponent {

    fun dataService(): DataService

}

