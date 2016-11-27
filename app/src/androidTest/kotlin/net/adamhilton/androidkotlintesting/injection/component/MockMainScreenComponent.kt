package net.adamhilton.androidkotlintesting.injection.component

import dagger.Component
import net.adamhilton.androidkotlintesting.injection.module.MainScreenModule
import net.adamhilton.androidkotlintesting.injection.scope.PerActivity
import net.adamhilton.androidkotlintesting.ui.main.MainActivityTests

@PerActivity
@Component(dependencies = arrayOf(MockAppComponent::class, MainScreenModule::class))
interface MockMainScreenComponent {
    fun inject(test: MainActivityTests)
}
