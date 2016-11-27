package net.adamhilton.androidkotlintesting

import net.adamhilton.androidkotlintesting.injection.component.DaggerMockAppComponent
import net.adamhilton.androidkotlintesting.injection.component.MockAppComponent
import net.adamhilton.androidkotlintesting.injection.module.AppModule

class MockApp : App() {

    override fun createAppComponent(): MockAppComponent {
        return DaggerMockAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}

