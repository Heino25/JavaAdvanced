package Lesson5.NestedClassExamples.com;

public class Television extends ElectronicDevice {

    @Override
    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    @Override
    public void turnOff() {
        System.out.println("TV yurned off.");}
    
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
    
    public void initializeScreen() {
        System.out.println("TV turned on");
    }
}