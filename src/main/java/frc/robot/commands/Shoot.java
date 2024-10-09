package frc.robot.commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class Shoot extends Command {
    private final DoubleSupplier speedSupplier;
    private final ShooterSubsystem subsystem;

    
    public Shoot(DoubleSupplier _speed, ShooterSubsystem _subsystem){
        speedSupplier = _speed;
        subsystem = _subsystem;
        addRequirements(_subsystem);
    }

    @Override
    public void execute() {
        subsystem.shootBall(speedSupplier.getAsDouble());
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
