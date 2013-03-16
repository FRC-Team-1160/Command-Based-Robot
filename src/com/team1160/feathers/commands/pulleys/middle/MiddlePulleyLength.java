package com.team1160.feathers.commands.pulleys.middle;

import com.team1160.feathers.commands.CommandBase;

public class MiddlePulleyLength extends CommandBase{
    
    protected double goal;
    protected double error;
    
    public MiddlePulleyLength(double g, double e){
        this.error = e;
        this.goal = g;
        requires(middlePulley);
    }

    protected void initialize() {
        middlePulley.setTapeLength(goal, error);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
