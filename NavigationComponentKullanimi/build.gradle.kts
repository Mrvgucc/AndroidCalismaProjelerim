// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies{
        //sayfalar arasi veri transferi icin eklenmesi gerekem:
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
}