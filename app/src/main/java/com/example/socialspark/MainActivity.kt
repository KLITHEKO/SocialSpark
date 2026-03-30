package com.example.socialspark

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    /*
The 'late init var' declaration in Kotlin is used to define a non-null mutable variable that will be initialized later, avoiding the need to assign it at the point of declaration (JetBrains, 2023).
It can only be used with mutable properties (var) of non-primitive types, and accessing it before initialization will throw an UninitializedPropertyAccessException (JetBrains, 2023).

Reference:
JetBrains. (2023). Late-initialized properties and variables. Retrieved from https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
*/
    private lateinit var etTimeInput: EditText
    private lateinit var btnFindSpark: Button
    private lateinit var btnReset: Button
    private lateinit var cvSuggestion: CardView
    private lateinit var tvSuggestionText: TextView
    private lateinit var tvError: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The below initializes the views that we created in the activity_main
        /*
The function 'findViewById(R.id.someView)' is used in Android to locate a view in the layout by its resource ID,
so the code can interact with that UI element programmatically (Android Developers, 2024).
It is required because views declared in XML layouts are not automatically linked to variables in code;
findViewById establishes this connection at runtime (Android Developers, 2024).

Reference:
Android Developers. (2024). findViewById. Retrieved from https://developer.android.com/reference/android/app/Activity#findViewById(int)
*/

        etTimeInput = findViewById(R.id.etTimeInput)
        btnFindSpark = findViewById(R.id.btnFindSpark)
        btnReset = findViewById(R.id.btnReset)
        cvSuggestion = findViewById(R.id.cvSuggestion)
        tvSuggestionText = findViewById(R.id.tvSuggestionText)
        tvError = findViewById(R.id.tvError)

        /*
  The 'setOnClickListener' function tells a button or view what to do when the user taps it (Android Developers, 2024).
  It connects the view to some code so that when it is clicked, the app can respond with the action we define (Android Developers, 2024).

  Reference (APA):
  Android Developers. (2024). Use common Kotlin patterns with Android – Event listeners. Retrieved from https://developer.android.com/kotlin/common-patterns#event-listeners
  */
        btnFindSpark.setOnClickListener {
            handleFindSpark()
        }

        btnReset.setOnClickListener {
            handleReset()
        }
    }

    private fun handleFindSpark() {
        // Get the text the user typed in the EditText, convert it to a string,
        // change it to all lowercase letters, and remove any extra spaces at the start or end.
        // This makes the input consistent for comparison in if statements.
        val input = etTimeInput.text.toString().lowercase().trim()

        // Reset visibility
        cvSuggestion.visibility = View.GONE
        tvError.visibility = View.GONE

        /*
         The below is the logic using if statements.
        A "when" statement could provide a more concise solution as suggested on Android studio, however,
        if-else statements were used to meet the requirements of the assignment resulting in warning displayed with
        yellow triangle for the logic

        */
        if (input == "morning") {
            showSuggestion(getString(R.string.spark_morning))
        } else if (input == "mid-morning") {
            showSuggestion(getString(R.string.spark_mid_morning))
        } else if (input == "afternoon") {
            showSuggestion(getString(R.string.spark_afternoon))
        } else if (input == "snack" || input == "afternoon snack") {
            showSuggestion(getString(R.string.spark_snack))
        } else if (input == "dinner") {
            showSuggestion(getString(R.string.spark_dinner))
        } else if (input == "night" || input == "after Dinner") {
            showSuggestion(getString(R.string.spark_night))
        } else {
            showError(getString(R.string.error_invalid_time))
        }
    }


    private fun showSuggestion(text: String) {
        tvSuggestionText.text = text
        cvSuggestion.visibility = View.VISIBLE
    }

    private fun showError(message: String) {
        tvError.text = message
        tvError.visibility = View.VISIBLE
    }

    private fun handleReset() {
        etTimeInput.text.clear()
        cvSuggestion.visibility = View.GONE
        tvError.visibility = View.GONE
    }
}
