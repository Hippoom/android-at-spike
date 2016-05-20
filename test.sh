./gradlew clean assembleDebug
adb install -r app/build/outputs/apk/app-debug.apk
adb shell am instrument -w com.deppon.dpapp.test/android.test.InstrumentationTestRunner