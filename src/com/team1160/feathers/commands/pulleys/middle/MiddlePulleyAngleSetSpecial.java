package com.team1160.feathers.commands.pulleys.middle;

import com.team1160.feathers.SI;
import com.team1160.feathers.commands.CommandBase;
import edu.wpi.first.wpilibj.Gyro;

public class MiddlePulleyAngleSetSpecial extends CommandBase{

    Gyro gyro;
    SI si;

    public MiddlePulleyAngleSetSpecial() {
        requires(middlePulley);
    }

    protected void initialize() {
    }

    protected void execute() {
        middlePulley.setAngle(middlePulley.meth.calcServoFromAngle(true, 45, si.getMidl(), gyro.getAngle()));
        middlePulley.joyVelocity();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}