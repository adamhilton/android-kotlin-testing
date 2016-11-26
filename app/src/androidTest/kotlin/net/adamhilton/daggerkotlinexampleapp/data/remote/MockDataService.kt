package net.adamhilton.daggerkotlinexampleapp.data.remote

import net.adamhilton.daggerkotlinexampleapp.injection.scope.PerApplication
import javax.inject.Inject

@PerApplication
class MockDataService @Inject constructor(): DataService {
    override fun getData(): String {
        return "Hello from MockDataService class!"
    }
}
