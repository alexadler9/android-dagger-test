package com.example.android.dagger.splash

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

//Classes annotated with @ActivityScope will have a unique instance in this Component
@ActivityScope
@Subcomponent
interface SplashComponent {

    //Factory to create instances of SplashComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): SplashComponent
    }

    //Classes that can be injected by this Component
    fun inject(activity: SplashActivity)
}