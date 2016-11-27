package net.adamhilton.androidkotlintesting.injection.component

import dagger.Component
import net.adamhilton.androidkotlintesting.injection.module.MainScreenModule
import net.adamhilton.androidkotlintesting.injection.scope.PerActivity
import net.adamhilton.androidkotlintesting.ui.main.MainActivity

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class, MainScreenModule::class))
interface MainScreenComponent {
    fun inject(activity: MainActivity)
}
