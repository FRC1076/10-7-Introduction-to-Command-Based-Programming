package frc.robot;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.DriveSubsystem;

/** Special Robot Container class designed for testing the subsystems made on 10/7 */
public class TestRobotContainer {
    private final CommandXboxController m_driverController =
        new CommandXboxController(OperatorConstants.kDriverControllerPort);
    private final DriveSubsystem m_drive = new DriveSubsystem();

    public TestRobotContainer() {
        m_driverController.leftTrigger(0.5).whileTrue(
            new StartEndCommand(
                () -> m_drive.drive(0.5,0.5),
                () -> m_drive.drive(0,0), 
                m_drive
            )
        );
        m_driverController.rightTrigger(0.5).whileTrue(
            new StartEndCommand(
                () -> m_drive.drive(-0.5,-0.5),
                () -> m_drive.drive(0,0), 
                m_drive
            )
        );
    }
}
