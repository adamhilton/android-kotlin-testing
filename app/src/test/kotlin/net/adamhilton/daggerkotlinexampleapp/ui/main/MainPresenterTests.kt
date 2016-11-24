package net.adamhilton.daggerkotlinexampleapp.ui.main

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
        mainPresenter = MainPresenter(view)
    }

    @Test
    fun getData_whenSuccessful_callsShowDataOnView() {
        mainPresenter.getData()
        verify(view).showData(anyString())
    }
}

