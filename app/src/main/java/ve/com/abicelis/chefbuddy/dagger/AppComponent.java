package ve.com.abicelis.chefbuddy.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ve.com.abicelis.chefbuddy.ui.main.MainActivity;

/**
 * Created by abicelis on 5/7/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, DatabaseModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}