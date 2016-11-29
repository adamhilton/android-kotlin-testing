package net.adamhilton.androidkotlintesting.data.remote

import net.adamhilton.androidkotlintesting.injection.scope.PerApplication
import javax.inject.Inject

@PerApplication
class MockDataService @Inject constructor(): DataService {

    companion object {
        @JvmStatic val MockResponse = "Hello from MockDataService class!"
    }

    override fun getData(): String {
        return MockResponse
    }
}
