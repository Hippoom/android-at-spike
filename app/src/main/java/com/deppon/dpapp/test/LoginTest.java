package com.deppon.dpapp.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


public class LoginTest extends
        ActivityInstrumentationTestCase2 {
    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.deppon.ecappactivites.common.StartActivity";

    private static Class<?> launcherActivityClass;

    static {
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public LoginTest() {
        super(launcherActivityClass);
    }

    private Solo solo;

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testLogin() throws Exception {
//        enterUsername("13917777763");
//        enterPassword("mellon12");
//        uncheckRememberMe();
//        clickLoginButton();
//        waitForLogin();
//
//        assertTrue("Login failure, cannot find text ['首页']", solo.searchText("首页"));

    }

    private void waitForLogin() throws InterruptedException {
        //        solo.waitForCondition(new Condition() {
//            @Override
//            public boolean isSatisfied() {
//                return solo.searchText("首页");
//            }
//        }, 2);

        Thread.sleep(2000);
    }

    private void clickLoginButton() {
        solo.clickOnButton("登录");
    }

    private void uncheckRememberMe() {
        if (solo.isCheckBoxChecked(0)) {
            solo.clickOnCheckBox(0);
        }
    }

    private void enterPassword(String password) {
        solo.clearEditText(1);
        solo.enterText(1, password);
    }

    private void enterUsername(String username) {
        solo.clearEditText(0);
        solo.enterText(0, username);
    }

//    @Override
//    public void tearDown() throws Exception {
//        solo.finishOpenedActivities();
//    }
}