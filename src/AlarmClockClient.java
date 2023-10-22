public interface AlarmClockClient {
    void setAlarm(int hours, int minutes);

    void turnOff();

    void snooze();
}
