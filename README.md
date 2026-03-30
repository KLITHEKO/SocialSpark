**Introduction**

  
This document presents the social spark README, a mobile application designed to create meaningful social connections throughout the day. The application developed entirely on android studio with Kotlin using if statements to implement application logic and XML for the user interface design. 

**********************************************************************************************************************************************************************************************************


**How It Works**

The user types a time of day into the input field and taps the button. The app reads the input and then checks the input against a list of known values using if/else statements and displays a matching suggestion inside a card (Google Developers, 2023). If the input is not recognised, an error message is shown instead. The reset button clears the input and hides both the card and the error message.



**********************************************************************************************************************************************************************************************************

Splash Screen: 

The app launches with a minimalistic splash screen that displays just the application logo. 

Light mode

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/2bb82015-f62e-4e89-bd51-ef64d4020222" />
<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/51690859-533c-44b9-a864-dff8582fbab4" />

Dark mode variant:

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/6e265fc4-ec9e-43b5-97e1-b3bacf780dd8" />




**Visual look/design**

The users are then presented with a simple and intuitive UI that prompts an input to provide/retreive a "social spark" based on the time of day. 

The interface uses an artisan sage and clay  inspired colour palette, characterised by earthy tones that are aligned with flat material design principles. Subtle borders and soft shadows are used to create a clean and modern aesthetic.

Fonts used:
Lora (Serif) 
Roboto (sans-serif)

fonts sourced from google fonts: https://fonts.google.com/

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/ba71bb88-992f-48d8-865a-ed460e483d5e" />






**********************************************************************************************************************************************************************************************************



**Tailored Suggestions:**

Prompts are generated based on the time of day providing users with opportunities to engage in meaningful interaction across the entirety of the day.


<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/a40a447b-332d-4a6e-9384-2ee9fc28b636" />

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/33346a1a-9c5e-4873-8e50-c409fed4220a" />







**Error handling - what is it and why it's used for the application**

What it is:
Error handling stops a program from breaking when something goes wrong (GeeksforGeeks, 2024). Instead of crashing, the app shows the user a message (Reintech, 2023).

Why it's used here:
If a user types something the app does not recognise, showError() displays a message instead of crashing (Kotlin Documentation, 2024).

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/7b47bce8-dfbc-49ba-bd7c-e93d2fc83690" />









**********************************************************************************************************************************************************************************************************



**Simple Android CI utilising Github actions**

This project uses GitHub Actions to automatically test and build the Android app whenever code is pushed or a pull request is opened on the main branch. It sets up Java 17, installs the Android SDK, runs unit tests, and builds the project — ensuring the code compiles and passes tests consistently (GitHub, 2023).


***********************************************************************************************************************************************************************************************************

**References:**


References

Android Developers. (2024). findViewById. https://developer.android.com/reference/android/app/Activity#findViewById(int)

Android Developers. (2024). Use common Kotlin patterns with Android. https://developer.android.com/kotlin/common-patterns#event-listeners

GeeksforGeeks. (2024). Error handling in programming. https://www.geeksforgeeks.org/dsa/error-handling-in-programming/

GitHub. (2023). Understanding GitHub Actions. GitHub Docs. https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions

Google Developers. (2023). Write conditionals in Kotlin. Android Developers. https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals

Google Fonts. (n.d.). Google Fonts. https://fonts.google.com/


JetBrains. (2023). Late-initialized properties and variables. Kotlin Documentation. https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables

Kotlin Documentation. (2024). Functions. JetBrains. https://kotlinlang.org/docs/functions.html

Kotlin Documentation. (2024). Strings. JetBrains. https://kotlinlang.org/docs/strings.html

Reintech. (2023). Effective error handling in software development. https://reintech.io/terms/category/error-handling-techniques







<img width="451" height="644" alt="image" src="https://github.com/user-attachments/assets/dd898085-a3f3-4343-8e50-e52769fbf0fb" />
