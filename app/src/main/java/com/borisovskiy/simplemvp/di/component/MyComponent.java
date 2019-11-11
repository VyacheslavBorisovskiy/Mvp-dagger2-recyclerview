package com.borisovskiy.simplemvp.di.component;

import android.app.Application;

import com.borisovskiy.simplemvp.App;
import com.borisovskiy.simplemvp.di.modules.MainActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        MainActivityModule.class})
public interface MyComponent extends AndroidInjector<DaggerApplication> {

    void inject(App app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        MyComponent build();
    }
}
