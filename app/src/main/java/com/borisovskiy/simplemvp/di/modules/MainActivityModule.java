package com.borisovskiy.simplemvp.di.modules;

import com.borisovskiy.simplemvp.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {

    @ContributesAndroidInjector
    MainActivity contributesMainActivity();
}
