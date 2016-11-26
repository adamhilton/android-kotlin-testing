package net.adamhilton.daggerkotlinexampleapp.ui.main

import net.adamhilton.daggerkotlinexampleapp.data.remote.DataService
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations.initMocks

class MainPresenterTests {

    @Mock
    lateinit var view: MainScreenContract.View
    @Mock
    lateinit var dataService: DataService

    lateinit var mainPresenter: MainPresenter

    @Before
    fun beforeTest() {
        initMocks(this)
        mainPresenter = MainPresenter(view, dataService)
    }

    @Test
    fun getData_whenSuccessful_callsShowDataOnView() {
        doReturn("test data").`when`(dataService).getData()
        mainPresenter.getData()
        verify(view).showData("test data")
    }
}

