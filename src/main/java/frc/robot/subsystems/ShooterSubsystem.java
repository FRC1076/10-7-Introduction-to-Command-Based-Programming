package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;


public class ShooterSubsystem extends SubsystemBase {
    private final CANSparkMax m_leftShooterMotor = new CANSparkMax(6, CANSparkMax.MotorType.kBrushless);
    private final CANSparkMax m_rightShooterMotor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);

    public ShooterSubsystem(){

    }

    public void shootBall(double speed){
        m_rightShooterMotor.set(-speed);
        m_leftShooterMotor.set(-speed);
    }

    public void stop(){
        m_rightShooterMotor.set(0);
        m_leftShooterMotor.set(0);
    }
}
