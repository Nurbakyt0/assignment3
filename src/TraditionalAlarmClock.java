public class TraditionalAlarmClock {
    private int alarmHours;
    private int alarmMinutes;
    private boolean isAlarmOn;

    public void setAlarmTime(int hours, int minutes) {
        alarmHours = hours;
        alarmMinutes = minutes;
        isAlarmOn = true;
    }

    public void stopAlarm() {
        isAlarmOn = false;
        System.out.println("Alarm turned off.");
    }

    public void snooze() {
        if (isAlarmOn) {
            System.out.println("Snoozing the alarm.");
            alarmMinutes += 5;
        }
    }
}
