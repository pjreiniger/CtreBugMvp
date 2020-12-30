package frc.robot;

import static org.junit.Assert.assertEquals;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.unmanaged.Unmanaged;

import org.junit.Test;

import edu.wpi.first.hal.HAL;

public class BasicSRXTest {

    @Test
    public void initializeTalonSRXTest()
    {
        WPI_TalonSRX talon = new WPI_TalonSRX(2);
    }
    
    
    @Test
    public void testSet() throws InterruptedException {

        HAL.initialize(0, 0);

        WPI_TalonSRX talon = new WPI_TalonSRX(3);
        talon.set(.5);

        assertEquals(0.5, talon.get(), 1e-2);
        
        for(int i = 0; i < 5; ++i)
        {
            talon.set(0.5);

            Unmanaged.feedEnable(100);
            
            Thread.sleep(100); // 10ms doesn't work
            
            System.out.println("Loop: " + i + " -> " + talon.get() + ", " + talon.getMotorOutputPercent());
        }


        assertEquals(0.5, talon.getMotorOutputPercent(), 1e-2);
    }
    
}
