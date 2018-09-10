package com.curiosoapp.poketeste;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.curiosoapp.poketeste.ClassesDeActivity.PokeMain;
import com.curiosoapp.poketeste.Robots.Robot;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PokeMainTeste {
    Robot robot = new Robot();
    @Rule
    public ActivityTestRule<PokeMain> activityRule = new ActivityTestRule<>(PokeMain.class);

    @Test
    public void testeGeral(){
        robot.checaLogoTopoVisivel().checaImagemTopoVisivel();
    }

}
