package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class DriveSubsystem extends SubsystemBase {
    
    private final WPI_TalonSRX m_leftLeader = new WPI_TalonSRX(7);
    private final WPI_TalonSRX m_leftFollower = new WPI_TalonSRX(2);
    private final WPI_TalonSRX m_rightLeader = new WPI_TalonSRX(5);
    private final WPI_TalonSRX m_rightFollower = new WPI_TalonSRX(3);

    public DriveSubsystem(){
        // Write constructor here

    }
    
    public void drive(double leftPower, double rightPower){
        // Write drive method here

    }
}
