package net.adamhilton.androidkotlintesting.injection.component

import dagger.Component
import net.adamhilton.androidkotlintesting.injection.module.AppModule
import net.adamhilton.androidkotlintesting.injection.module.MockDataModule
import net.adamhilton.androidkotlintesting.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(AppModule::class, MockDataModule::class))
interface MockAppComponent : AppComponent

