package us.deans.javastuff.operations.op05_TimeOps;

import us.deans.javastuff.base.BaseOperation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OP05_TimeOperations extends BaseOperation {

    @Override
    public void start() {
        super.start();
    }

    public String findDay(String input) {

        String[] dmy = input.split(" ");
        int m = Integer.parseInt(dmy[0]);
        int d = Integer.parseInt(dmy[1]);
        int y = Integer.parseInt(dmy[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(y,m-1,d);

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date date = calendar.getTime();
        String dateAsString = df.format(date);

        System.out.println(calendar.getTime());
        System.out.println(dateAsString);

        String[] days = new String[] {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        return days[calendar.get(Calendar.DAY_OF_WEEK) -1];
    }

}
