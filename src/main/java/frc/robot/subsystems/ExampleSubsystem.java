/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {

  private final WPI_TalonSRX mTalon;

  /**
   * Creates a new ExampleSubsystem.
   */
  public ExampleSubsystem() {
    mTalon = new WPI_TalonSRX(0);

    mTalon.configMotionAcceleration(800);
    mTalon.configMotionCruiseVelocity(800);
    mTalon.config_kP(0, .01);
    mTalon.config_kF(0, .02);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void goToPosition()
  {
    mTalon.set(ControlMode.MotionMagic, 20000);
  }

  public void stop() {
    mTalon.set(0);
  }
}
