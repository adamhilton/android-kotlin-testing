package net.adamhilton.daggerkotlinexampleapp

import net.adamhilton.daggerkotlinexampleapp.injection.component.DaggerMockAppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.component.MockAppComponent
import net.adamhilton.daggerkotlinexampleapp.injection.module.AppModule

class MockApp : App() {

    override fun createAppComponent(): MockAppComponent {
        return DaggerMockAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}

