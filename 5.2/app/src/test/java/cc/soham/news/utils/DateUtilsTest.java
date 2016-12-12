package cc.soham.news.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sohammondal on 26/10/16.
 */

public class DateUtilsTest {
    String correctInputDate1 = "2016-07-25T09:56:27Z";
    String correctOutputDate1 = "Mon, 25 Jul 2016 09:56";

    @Test
    public void formatNewsApiDate_correctDate_outputsCorrectDate() {
        String outputDate = DateUtils.formatNewsApiDate(correctInputDate1);
        assertEquals(outputDate, correctOutputDate1);
    }

    @Test
    public void formatNewsApiDate_nullInput_outputsNull() {
        String outputDate = DateUtils.formatNewsApiDate(null);
        assertEquals(outputDate, null);
    }
}
