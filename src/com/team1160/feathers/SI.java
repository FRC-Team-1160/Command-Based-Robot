package com.team1160.feathers;

import com.team1160.feathers.api.Constants;
import com.team1160.feathers.sensors.LengthSensor;

import edu.wpi.first.wpilibj.Gyro;

public class SI {

    protected LengthSensor mid;
    protected LengthSensor left;
    protected LengthSensor right;
    protected Gyro gyro;
    protected static SI instance;

    public static SI getInstance() {
        if (instance == null) {
            instance = new SI();
        }
        return instance;
    }

    protected SI() {
        mid = new LengthSensor(Constants.MID_POT, 1, 1, 1);
        left = new LengthSensor(Constants.LEFT_POT, -.6296, -12.2, 74.12);
        right = new LengthSensor(Constants.RIGHT_POT, 1, 1, 1);

        gyro = new Gyro(Constants.GYRO);
    }

    public LengthSensor getMid() {
        return this.mid;
    }

    public LengthSensor getLeft() {
        return this.left;
    }

    public LengthSensor getRight() {
        return this.right;
    }
    
    
    public double getMidl() {
        return this.mid.getLength();
    }

    public double getLeftl() {
        return this.left.getLength();
    }

    public double getRightl() {
        return this.right.getLength();
    }
    
    // Returns the angle of the frame in radians, because thats what we need them in most the time
    
    public double getAngle() {
        return Math.toRadians(gyro.getAngle());
    }

    public double getAngleDegrees() {
        return gyro.getAngle();

    }

    public void reset() {
        gyro.reset();
    }
}
