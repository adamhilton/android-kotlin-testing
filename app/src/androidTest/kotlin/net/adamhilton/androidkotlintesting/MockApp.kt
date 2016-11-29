package net.adamhilton.androidkotlintesting

import net.adamhilton.androidkotlintesting.injection.component.DaggerMockAppComponent
import net.adamhilton.androidkotlintesting.injection.component.MockAppComponent

class MockApp : App() {

    override fun createAppComponent(): MockAppComponent {
        return DaggerMockAppComponent.builder().build()
    }
}

