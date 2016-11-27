package net.adamhilton.androidkotlintesting.injection.module

import dagger.Module
import dagger.Provides
import net.adamhilton.androidkotlintesting.injection.scope.PerActivity
import net.adamhilton.androidkotlintesting.ui.main.MainScreenContract

@Module
class MainScreenModule(private val view: MainScreenContract.View) {
    @Provides
    @PerActivity
    internal fun provideMainScreenView(): MainScreenContract.View {
        return view
    }
}

