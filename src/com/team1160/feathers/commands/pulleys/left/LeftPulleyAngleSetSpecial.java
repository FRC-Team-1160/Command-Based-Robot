package com.team1160.feathers.commands.pulleys.left;

import com.team1160.feathers.SI;
import com.team1160.feathers.commands.CommandBase;
import edu.wpi.first.wpilibj.Gyro;

public class LeftPulleyAngleSetSpecial extends CommandBase{
    
        Gyro gyro;
    SI si;
    
    public LeftPulleyAngleSetSpecial(){
        requires(rightPulley);
    }

    protected void initialize() {
        
    }


    protected void execute() {
        leftPulley.setAngle(leftPulley.meth.calcServoFromAngle(true, 45, si.getLeftl(), gyro.getAngle()));
        leftPulley.joyVelocity();
    }


    protected boolean isFinished() {
        return false;
    }


    protected void end() {

    }


    protected void interrupted() {

    }
}