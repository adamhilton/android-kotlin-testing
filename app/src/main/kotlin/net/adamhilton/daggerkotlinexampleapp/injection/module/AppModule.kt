package net.adamhilton.daggerkotlinexampleapp.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import net.adamhilton.daggerkotlinexampleapp.App
import net.adamhilton.daggerkotlinexampleapp.injection.qualifier.AppContext
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerApplication

@Module
class AppModule(private val application: App) {

    @Provides
    @PerApplication
    @AppContext
    internal fun provideAppContext(): Context {
        return application
    }
}
