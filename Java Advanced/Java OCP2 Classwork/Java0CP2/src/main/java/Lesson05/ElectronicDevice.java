package Lesson5;

public abstract class ElectronicDevice {
    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
    public void seState(PowerState state){
        switch (state){
            case OFF:
                System.out.println(state.getDescription());
                break;
            case ON:
                System.out.println(state.getDescription());
            case SUSPEND:
                System.out.println(state.getDescription());
                break;
            default:
                System.out.println("There is no such state");
                break;
        }
    }
    
}
