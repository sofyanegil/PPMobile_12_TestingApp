package id.ac.unpas.testingapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import id.ac.unpas.testingapp.ui.theme.TestingAppTheme
import org.junit.Rule
import org.junit.Test

public class MainActivityTest {
    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun mainTest() {
        composeTestRule.setContent {
            TestingAppTheme {
                MainScreen()
            }
        }

        composeTestRule.onNodeWithText("Hello !").assertExists()
        composeTestRule.onNodeWithTag("buttonGo").assertExists()
        composeTestRule.onNodeWithTag("buttonGo").performClick()
        composeTestRule.onNodeWithText("Hello Android!").assertExists()
    }
}