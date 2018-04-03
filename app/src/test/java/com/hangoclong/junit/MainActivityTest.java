package com.hangoclong.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {
    private MainActivity mActivity;

    @Before
    public void setUp() {
        mActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull(mActivity);
    }

    @Test
    public void checkPrimeNumber() {
        assertTrue(mActivity.isPrime(7));
    }

    @Test
    public void checkEmailFormat() {
        assertTrue(mActivity.isEmail("hangoclong@gmail.com"));
    }

    @Test
    public void divisionTwoNumber() throws ArithmeticException {
        assertNotNull(mActivity.divisionTwoNumber(1, 1));
    }
}
