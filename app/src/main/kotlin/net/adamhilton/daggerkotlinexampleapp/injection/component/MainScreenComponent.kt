package net.adamhilton.daggerkotlinexampleapp.injection.component

import dagger.Component
import net.adamhilton.daggerkotlinexampleapp.injection.module.MainScreenModule
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerActivity
import net.adamhilton.daggerkotlinexampleapp.ui.main.MainActivity

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class, MainScreenModule::class))
interface MainScreenComponent {
    fun inject(activity: MainActivity)
}
