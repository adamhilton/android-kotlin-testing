package net.adamhilton.androidkotlintesting.injection.component

import dagger.Component
import net.adamhilton.androidkotlintesting.injection.module.MockDataModule
import net.adamhilton.androidkotlintesting.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(MockDataModule::class))
interface MockAppComponent : AppComponent

