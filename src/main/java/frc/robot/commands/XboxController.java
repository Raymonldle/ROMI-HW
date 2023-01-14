// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class XboxController extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final RomiDrivetrain m_db;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */

  public Xboxcontroller(RomiDrivetrain xboxController) {
    m_db = xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(xboxController);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //goes through arcadeDrive and calls getLeftX() and getLeftY()
    m_db.arcadeDrive(RobotContainer.m_xboxController.getLeftX(), RobotContainer.m_xboxController.getLeftY());
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
