// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;

public class RobotContainer {

    private final CommandXboxController m_driverController =
        new CommandXboxController(OperatorConstants.kDriverControllerPort);
    private final DriveSubsystem m_robotDrive = new DriveSubsystem();
    public RobotContainer() {
        m_robotDrive.setDefaultCommand(new TankDrive(
            () -> -m_driverController.getLeftY(),
            () -> -m_driverController.getRightY(),
            m_robotDrive
        ));
    }
}
