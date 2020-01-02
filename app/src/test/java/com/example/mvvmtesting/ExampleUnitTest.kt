package com.example.mvvmtesting

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.mvvmtesting.ui.main.MainViewModel
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Rule
    @JvmField
    val rule: TestRule = InstantTaskExecutorRule()

    lateinit var mainViewModel: MainViewModel

    @Before
    fun setUp() {
        mainViewModel = MainViewModel()
        mainViewModel.getData()
    }

    @Test
    fun testViewModel() {
        assertThat(mainViewModel.title.value, equalTo("Title from API"))
    }
}
