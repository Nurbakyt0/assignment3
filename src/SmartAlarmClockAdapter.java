public class SmartAlarmClockAdapter implements AlarmClockClient {
    private TraditionalAlarmClock alarmClock;

    public SmartAlarmClockAdapter(TraditionalAlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    @Override
    public void setAlarm(int hours, int minutes) {
        // Translate the smart home system's command to set the alarm on the physical alarm clock
        alarmClock.setAlarmTime(hours, minutes);
    }

    @Override
    public void turnOff() {
        // Translate the smart home system's command to turn off the physical alarm clock
        alarmClock.stopAlarm();
    }

    @Override
    public void snooze() {
        // Translate the smart home system's command to snooze the physical alarm clock
        alarmClock.snooze();
    }
}
