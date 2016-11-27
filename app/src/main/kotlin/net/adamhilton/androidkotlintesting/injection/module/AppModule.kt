package net.adamhilton.androidkotlintesting.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import net.adamhilton.androidkotlintesting.App
import net.adamhilton.androidkotlintesting.injection.qualifier.AppContext
import net.adamhilton.androidkotlintesting.injection.scope.PerApplication

@Module
class AppModule(private val application: App) {

    @Provides
    @PerApplication
    @AppContext
    internal fun provideAppContext(): Context {
        return application
    }
}
