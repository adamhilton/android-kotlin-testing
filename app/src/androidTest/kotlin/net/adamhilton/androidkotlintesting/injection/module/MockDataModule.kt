package net.adamhilton.androidkotlintesting.injection.module

import dagger.Binds
import dagger.Module
import net.adamhilton.androidkotlintesting.data.remote.DataService
import net.adamhilton.androidkotlintesting.data.remote.MockDataService

@Module
abstract class MockDataModule {
    @Binds
    abstract fun bindDataService(dataService: MockDataService) : DataService
}
