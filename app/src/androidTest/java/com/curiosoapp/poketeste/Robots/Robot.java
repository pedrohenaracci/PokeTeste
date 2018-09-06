package com.curiosoapp.poketeste.Robots;

import com.curiosoapp.poketeste.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Robot {

    public Robot checaLogoTopoVisivel() {
        onView(withId(R.id.imagem_logo_pokemain))
                .check(matches(isCompletelyDisplayed()));
        return this;
    }

    public Robot checaImagemTopoVisivel() {
        onView(withId(R.id.imagem_pokemain))
                .check(matches(isCompletelyDisplayed()));
        return this;
    }


}
