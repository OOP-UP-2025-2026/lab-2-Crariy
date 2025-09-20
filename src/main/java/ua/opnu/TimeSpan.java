package ua.opnu;


public class TimeSpan {
    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        if(hours < 0 || (minutes < 0 || minutes > 59)) {
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if(hours < 0 || (minutes < 0 || minutes > 59)) {
            return;
        }
        this.hours += hours;
        this.minutes += minutes;
        if(this.minutes > 59) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        if(timespan.getHours() < 0 || (timespan.getMinutes() < 0 || timespan.getMinutes() > 59)) {
            return;
        }
        this.hours += timespan.getHours();
        this.minutes += timespan.getMinutes();
        if(minutes > 59) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    double getTotalHours() {
        return this.hours + (double) this.minutes / 60;
    }

    int getTotalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    void subtract(TimeSpan span) {
        if(this.getTotalMinutes() < span.getTotalMinutes()) {
            return;
        }
        this.hours -= span.getHours();
        this.minutes -= span.getMinutes();
        if(minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }
    }

    void scale(int factor) {
        if(factor <= 0) {
            return;
        }
        this.hours *= factor;
        this.minutes *= factor;
        if(this.minutes >= 60) {
            do {
                this.minutes -= 60;
                this.hours++;
            } while (this.minutes >= 60);
        }
    }
}
