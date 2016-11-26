package net.adamhilton.daggerkotlinexampleapp.injection.component

import dagger.Component
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule
import net.adamhilton.daggerkotlinexampleapp.injection.module.MockDataModule
import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerApplication

@PerApplication
@Component(modules = arrayOf(AppModule::class, MockDataModule::class))
interface MockAppComponent : AppComponent

