package net.adamhilton.daggerkotlinexampleapp.ui.main

import net.adamhilton.daggerkotlinexampleapp.data.remote.MockDataService
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations.*

class MainPresenterTests {

    @Mock lateinit var view: MainScreenContract.View

    lateinit var mainPresenter: MainScreenContract.Presenter

    @Before
    fun beforeTest() {
        initMocks(this)
        mainPresenter = MainPresenter(view, MockDataService())
    }

    @Test
    fun getData_whenSuccessful_callsShowDataOnView() {
        mainPresenter.getData()
        verify(view).showData("Hello from MockDataService class!")
    }
}

