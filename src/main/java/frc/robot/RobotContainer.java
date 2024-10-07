// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

    private final DriveSubsystem m_robotDrive = new DriveSubsystem();
        new CommandXboxController(OperatorConstants.kDriverControllerPort);

    public RobotContainer() {
        m_robotDrive.setDefaultCommand(new TankDrive(
        () -> -m_drivercontroller.getLeftY();
        () -> -m_drivercontroller.getRightY();
        m_robotDrive
        ));
        

    }
}
