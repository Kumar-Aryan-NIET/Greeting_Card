package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

// The onCreate() function is
//  the entry point to this Android app and calls other functions to build the user interface.
//  In Kotlin programs, the main() function is the entry point/starting point of execution.
//  In Android apps, the onCreate() function fills that role.

// The setContent() function within the onCreate() function
//  is used to define your layout through composable functions.
//  All functions marked with the @Composable annotation can be called
//   from the setContent() function or from other Composable functions.
//  The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

// This Composable function takes some input and generates what's shown on the screen.
// You add the @Composable annotation before the function.
// @Composable function names are capitalized.
// @Composable functions can't return anything.
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    // To set a different background color for your introduction,
    // you'll need to surround your text with a Surface.
    // A Surface is a container that represents a section of UI where you can alter the appearance,
    // such as the background color or border.

    // To surround the text with a Surface, highlight the line of text, press (Alt+Enter for Windows or Option+Enter on Mac), and then select Surround with widget.
    // Choose Surround with Container.
    // The default container it will give you is Box
    // but you can change this to another container type.

    // add a color parameter, set it to Color.
    // Surface(color = Color)

    // When you type Color you may notice that it is red, which means Android Studio is not able to resolve this.
    // To solve this scroll to the top of the file where it says import and press the three buttons.
    // Add " import androidx.compose.ui.graphics.Color "

    // Notice that the Color that you typed in the Surface parentheses has switched from being red to being underlined in red.
    // To fix that, add a period(".") after it. You will see a pop-up showing different color options.
    // Choose a color for your surface
    // Notice the updated preview.
    Surface(color = Color.Cyan) {
        Text(
            text = "Warm Welcome to Mr. $name!",
            // A Modifier is used to augment or decorate a composable.
            // One modifier you can use is the padding modifier,
            //  which adds space around the element (in this case, adding space around the text).
            //  This is accomplished by using the Modifier.padding() function.
            modifier = modifier.padding(24.dp)
            // Every composable should have an optional parameter of the type Modifier
        )
    }
}

// To enable a preview of a composable,
//  annotated with @Composable and @Preview
@Preview(showBackground = true) // tells Android Studio that this composable should be shown in the design view of this file.
// The @Preview annotation takes in a parameter called showBackground.
// If showBackground is set to true, it will add a background to your composable preview.
// By default uses a light theme

@Composable

// The GreetingPreview() function
//  is a cool feature that lets you see what your composable looks like
//   without having to build your entire app.
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Kumar Aryan")
    }
}