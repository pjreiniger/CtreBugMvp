package frc.robot;

import com.ctre.phoenix.CTREJNIWrapper;

import org.junit.Test;

public class JniUnloadingCrash {

    @Test
    public void initializationTest()
    {
        System.out.println("Hello world");
        new CTREJNIWrapper();
        System.out.println("Goodbye world");
    }    
}
