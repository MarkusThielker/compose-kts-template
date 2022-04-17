package dev.thielker.custom

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import dev.thielker.custom.ui.CustomApp
import dev.thielker.custom.ui.theme.CustomTheme
import timber.log.Timber

class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}

@ExperimentalMaterial3Api
class CustomActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            CustomTheme {

                CustomApp()
            }
        }
    }
}
