import java.util.Observable;
import java.util.Observer;
//Observer pattern example is used to create a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically
public class ObserverExample{
    public static class ClockTimerModel extends Observable{
        private int hour;
        private int minute;
        private int second;
        public ClockTimerModel(){
            hour = 0;
            minute = 0;
            second = 0;
        }//update internal time-keeping state
        public void tick(){
            second++;
            if(second == 60){
                second = 0;
                minute++;
                if(minute == 60){
                    minute = 0;
                    hour++;
                    if(hour == 24){
                        hour = 0;
                    }
                }
            }
            //notify observers of change
            setChanged();
            notifyObservers();
        }
        public int getHour(){
            return hour;
        }
        public int getMinute(){
            return minute;
        }
        public int getSecond(){
            return second;
        }
    }

    public static class DigitalClockView implements Observer{
        private ClockTimerModel model;
        public DigitalClockView(ClockTimerModel model){
            this.model = model;
        }
        public void update(Observable obs, Object obj){
            if(obs == obj) {
                ClockTimerModel model = (ClockTimerModel)obs;
                draw();
            }
        }
            
            
        
        public void draw(){
            int hour = model.getHour();
            int minute = model.getMinute();
            int second = model.getSecond();
            System.out.println("Digital Clock: " + hour + ":" + minute + ":" + second);
        }
    }
    public static void main(String[] args){
            ClockTimerModel model = new ClockTimerModel();
            DigitalClockView digitalClock = new DigitalClockView(model);
            model.addObserver(digitalClock);
            for(int i = 0; i < 1024; i++)
                model.tick();
            
            digitalClock.update(model, model);

        }
}