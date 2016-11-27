package net.adamhilton.androidkotlintesting.data.remote

import net.adamhilton.androidkotlintesting.injection.scope.PerApplication
import javax.inject.Inject

@PerApplication
class MockDataService @Inject constructor(): DataService {
    override fun getData(): String {
        return "Hello from MockDataService class!"
    }
}
