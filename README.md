# Restaurants Hotlines

Restaurants Hotlines is an Android app that allows users to browse a list of popular restaurants, view their hotline numbers, and initiate calls with a single tap. The app supports both English and Arabic languages, includes light and dark themes, and adapts to portrait and landscape orientations for a seamless user experience.

## Features

- **Restaurant List**: Displays a curated list of restaurants with their logos, names, and hotline numbers in a RecyclerView.
- **One-Tap Calling**: Tap a restaurant card to open the phone dialer with the hotline number pre-filled using `ACTION_DIAL`.
- **Light and Dark Modes**: Supports light and dark themes for comfortable viewing in any lighting condition, powered by `AppCompatDelegate`.
- **Portrait and Landscape Support**: Adapts layouts for both orientations, ensuring a consistent UI.
- **Bilingual Support**: Fully localized in English and Arabic with right-to-left (RTL) layout support for Arabic users.
- **Exit Confirmation**: Shows a dialog when the user attempts to exit the app, enhancing the user experience.
- **Clean UI**: Uses `CardView` for elegant restaurant cards and `RecyclerView` for smooth scrolling.
