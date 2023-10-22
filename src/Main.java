public class Main {
    public static void main(String[] args) {
        TraditionalAlarmClock traditionalAlarmClock = new TraditionalAlarmClock();
        AlarmClockClient smartAlarmClock = new SmartAlarmClockAdapter(traditionalAlarmClock);

        // Smart home system can now interact with the traditional alarm clock
        smartAlarmClock.setAlarm(7, 30);
        smartAlarmClock.turnOff();
        smartAlarmClock.snooze();
    }
}
