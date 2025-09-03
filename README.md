# Restaurants Hotlines

Restaurants Hotlines is an Android app that allows users to browse a list of popular restaurants, view their hotline numbers, and initiate calls with a single tap. The app supports both English and Arabic languages, includes light and dark themes, and adapts to portrait and landscape orientations for a seamless user experience.

## Features

- **Restaurant List**: Displays a curated list of restaurants with their logos, names, and hotline numbers in a RecyclerView.
- **One-Tap Calling**: Tap a restaurant card to open the phone dialer with the hotline number pre-filled using `ACTION_DIAL`.
- **Light and Dark Modes**: Supports light and dark themes for comfortable viewing in any lighting condition, powered by `AppCompatDelegate`.
- **Portrait and Landscape Support**: Adapts layouts for both orientations, using a StaggeredGridLayout in landscape mode for a better UI experience..
- **Bilingual Support**: Fully localized in English and Arabic with right-to-left (RTL) layout support for Arabic users.
- **Exit Confirmation**: Shows a dialog when the user attempts to exit the app, enhancing the user experience.
- **Clean UI**: Uses `CardView` for elegant restaurant cards and `RecyclerView` for smooth scrolling.

## Installation

### Download and Install the APK
The app is not available on the Google Play Store but can be downloaded as an APK file:

1. **Download the APK**: Get the latest version from [Restaurants Hotlines APK](https://yourwebsite.com/restaurants-hotlines.apk](https://drive.google.com/drive/folders/1z4sTxp5wBpQhSdr3j8TBth6joyoTwBEw?usp=sharing)).
2. **Enable Unknown Sources** (Android 7.1 and below):
   - Go to **Settings > Security > Enable Unknown Sources**.
3. **Install the APK** (Android 8.0+):
   - Open the downloaded APK file.
   - When prompted, allow your browser or file manager to install apps.
4. **Run the App**: Open **Restaurants Hotlines** from your app drawer and start exploring!

## Tech Stack

- **Language**: Kotlin
- **Framework**: Android SDK
- **UI Components**: RecyclerView, CardView, AppCompatDelegate (for themes), StaggeredGridLayoutManager
- **IDE**: Android Studio
- **Localization**: English and Arabic string resources with RTL support
- **Dependencies**:
  - `androidx.core:core-ktx`
  - `androidx.appcompat:appcompat`
  - `androidx.cardview:cardview`
  - `androidx.recyclerview:recyclerview`
