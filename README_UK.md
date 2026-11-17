# KHEOS v1.0 — стартовий Android-проєкт

Це перший **візуальний прототип** KHEOS на Kotlin + Jetpack Compose.

## Уже реалізовано
- Темний футуристичний екран у стилі JARVIS.
- Анімоване RGB-ядро.
- Перемикачі STANDARD / ULTRA / AUTO.
- Демонстраційний стан кнопки мікрофона.

## Ще НЕ реалізовано
Кнопка мікрофона поки лише перемикає напис на екрані. Реальне розпізнавання мовлення,
голосове пробудження, ШІ-діалоги, керування YouTube/музикою та автоматична реакція
AUTO на заряд батареї — наступні етапи розробки.

## Як відкрити
1. Встановіть Android Studio.
2. Розпакуйте ZIP.
3. В Android Studio оберіть **Open** та відкрийте папку `KHEOS_v1`.
4. Дочекайтеся Gradle Sync.
5. Для запуску на телефоні ввімкніть Developer options та USB debugging,
   під'єднайте телефон USB і натисніть Run.

## Як зібрати APK
В Android Studio: **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
APK зазвичай з'явиться у `app/build/outputs/apk/debug/app-debug.apk`.

Потрібні Android SDK 35 і JDK 17 (Android Studio зазвичай пропонує встановити SDK).
