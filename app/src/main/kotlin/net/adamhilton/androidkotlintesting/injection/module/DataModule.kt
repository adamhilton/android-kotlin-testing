package net.adamhilton.androidkotlintesting.injection.module

import dagger.Binds
import dagger.Module
import net.adamhilton.androidkotlintesting.data.remote.DataService
import net.adamhilton.androidkotlintesting.data.remote.LocalDataService

@Module
abstract class DataModule {
    @Binds
    abstract fun bindDataService(dataService: LocalDataService) : DataService
}
