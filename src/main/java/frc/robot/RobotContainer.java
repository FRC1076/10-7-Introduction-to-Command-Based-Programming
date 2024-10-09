// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.TankDrive;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class RobotContainer {

    private final DriveSubsystem m_robotDrive = new DriveSubsystem();
    private final ShooterSubsystem m_robotShoot = new ShooterSubsystem();

    private final CommandXboxController m_driverController =
        new CommandXboxController(OperatorConstants.kDriverControllerPort);

        
    public RobotContainer() {
        m_robotDrive.setDefaultCommand(new TankDrive(
            () -> -m_driverController.getLeftY(),
            () -> -m_driverController.getLeftY(),
            m_robotDrive
        ));

        m_robotShoot.setDefaultCommand(new Shoot(
            () -> 0,
            m_robotShoot
        ));

        m_driverController.a().whileTrue(new Shoot(
            () -> 0.4,
            m_robotShoot
        ));
    }
}
