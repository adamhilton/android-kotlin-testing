package net.adamhilton.daggerkotlinexampleapp.injection.module

import dagger.Binds
import dagger.Module
import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import net.adamhilton.daggerkotlinexampleapp.data.remote.MockDataService

@Module
abstract class MockDataModule {
    @Binds
    abstract fun bindDataService(dataService: MockDataService) : DataService
}
