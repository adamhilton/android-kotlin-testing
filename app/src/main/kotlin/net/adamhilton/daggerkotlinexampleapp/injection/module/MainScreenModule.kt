package net.adamhilton.daggerkotlinexampleapp.injection.module

import dagger.Module
import dagger.Provides
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerActivity
import net.adamhilton.daggerkotlinexampleapp.ui.main.MainScreenContract

@Module
class MainScreenModule(private val view: MainScreenContract.View) {
    @Provides
    @PerActivity
    internal fun provideMainScreenView(): MainScreenContract.View {
        return view
    }
}

