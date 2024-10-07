package frc.robot.commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class TankDrive extends Command {
    private final DoubleSupplier leftSpeedSupplier;
    private final DoubleSupplier rightSpeedSupplier;
    private final DriveSubsystem subsystem;
    
    public TankDrive(DoubleSupplier _left, DoubleSupplier _right, DriveSubsystem _subsystem){
        leftSpeedSupplier = _left;
        rightSpeedSupplier = _right;
        subsystem = _subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        // Write your command here
        subsystem.drive(leftSpeedSupplier.getAsDouble(),rightSpeedSupplier.getAsDouble());
        
        
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
