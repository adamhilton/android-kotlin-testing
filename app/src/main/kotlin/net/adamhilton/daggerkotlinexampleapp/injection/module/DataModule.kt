package net.adamhilton.daggerkotlinexampleapp.injection.module

import dagger.Binds
import dagger.Module
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import net.adamhilton.daggerkotlinexampleapp.data.remote.LocalDataService

@Module
abstract class DataModule {
    @Binds
    abstract fun bindDataService(dataService: LocalDataService) : DataService
}
