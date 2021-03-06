package cse403.homesafe;

import android.os.CountDownTimer;

/**
 * A HSTimer object that represents a count down timer.
 */
public class HSTimer {

    public static final long COUNT_DOWN_INTERVAL = 1000;

    private CountDownTimer timer;

    /**
     * Constructs a new HSTimer object.
     *
     * @param estimatedTimeArrival :
     */
    public HSTimer(long estimatedTimeArrival) {
        timer = setTimer(estimatedTimeArrival);
    }

    /**
     * Starts the timer.
     *
     * @return true if timer successfully started otherwise false.
     */
    public boolean startTimer() {
        //timer.start();
        return true;
    }

    /**
     * Ends the timer.
     *
     * @return true if the timer successfully ended otherwise false.
     */
    public boolean endTimer() {
        //timer.cancel();
        return true;
    }

    // Don't need this method since we're using a count down timer?
    public boolean clearTimer() {
        return true;
    }

    /**
     * Extends the time of the timer.
     *
     * @return true if the timer has been extended otherwise false.
     */
    public boolean extendTimer() {
        return true;
    }

    /**
     * Switches tier level.
     *
     * @param tier : the tier level.
     * @return true if tier has been swtiched otherwise false.
     */
    public boolean switchTier(int tier) {
        return true;
    }

    /**
     * Set the timer to a specified time.
     *
     * @param estimatedTimeArrival : the starting time of the timer.
     * @return a CountDownTimer object set to the specified time.
     */
    private CountDownTimer setTimer(long estimatedTimeArrival) {
        CountDownTimer newTimer = new CountDownTimer(estimatedTimeArrival, COUNT_DOWN_INTERVAL) {
            @Override
            public void onTick(long millisUntilFinished) {
                //myTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                //myTextField.setText("Enter Password");
            }
        };
        return newTimer;
    }

}
