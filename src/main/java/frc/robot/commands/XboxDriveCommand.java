/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * Executes the commands for xbox driver functions. 
 */
public class XboxDriveCommand extends Command {
  public XboxDriveCommand() 
  {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(RobotMap.driveTrainSubsystem);
  }

  /**
   * Called just before this Command runs the first time
   */
  @Override
  protected void initialize() 
  {
  }

  /**
   * Called repeatedly when this Command is scheduled to run | 
   * Runs the methods for xbox controllers
   */
  @Override
  protected void execute() 
  {
    RobotMap.driveTrainSubsystem.xboxArcadeDrive();
    RobotMap.manipulatorSubsystem.xboxIntakeOuttake();
    RobotMap.elevatorSubsystem.xboxElevatorControl();
    RobotMap.manipulatorSubsystem.xboxHatchControl();
    RobotMap.automatedSubsystem.xboxAutonomousControl();
    
  }

  /**
   * Make this return true when this Command no longer needs to run execute()
   */
  @Override
  protected boolean isFinished() 
  {
    return false;
  }

  /**
   * Called once after isFinished returns true
   */
  @Override
  protected void end() 
  {
  }

  /**
   * Called when another command which requires one or more of the same subsystems is scheduled to run
   */
  @Override
  protected void interrupted() 
  {
  }
}
