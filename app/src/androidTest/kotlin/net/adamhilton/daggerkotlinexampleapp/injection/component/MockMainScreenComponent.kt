package net.adamhilton.daggerkotlinexampleapp.injection.component

import dagger.Component
import net.adamhilton.daggerkotlinexampleapp.injection.module.MainScreenModule
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerActivity
import net.adamhilton.daggerkotlinexampleapp.ui.main.MainActivityTests

@PerActivity
@Component(dependencies = arrayOf(MockAppComponent::class, MainScreenModule::class))
interface MockMainScreenComponent {
    fun inject(test: MainActivityTests)
}
