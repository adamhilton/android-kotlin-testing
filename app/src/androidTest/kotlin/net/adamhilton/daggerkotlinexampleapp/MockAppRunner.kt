package net.adamhilton.daggerkotlinexampleapp

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner
import kotlin.reflect.jvm.jvmName

class MockAppRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(
                cl, MockApp::class.jvmName, context)
    }
}
