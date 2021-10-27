package Lesson5.NestedClassExamples.com;

public abstract class ElectronicDevice {
    
    public void setState(PowerState state){
        switch (state){
            case OFF:
                System.out.println(state.getDescription());
                break;
            case ON:
                System.out.println(state.getDescription());
                break;
            case SUSPEND:
                System.out.println(state.getDescription());
                break;
            default:
                System.out.println("There is no such state.");
                break;
        }
    }
    public abstract void turnOn();
    
    public abstract void turnOff();
    
}
