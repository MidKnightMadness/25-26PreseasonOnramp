package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class H_DistanceSensorExample extends OpMode {

    Double EMPTY_INPUT_DISTANCE;
    DistanceSensor inputDistSensor;

    @Override
    public void init(){
        inputDistSensor = hardwareMap.get(DistanceSensor.class,"inputDistSensor");
    }
    @Override
    public void start(){

    }
    @Override
    public void loop(){
        telemetry.addData("Distance:",inputDistSensor.getDistance(DistanceUnit.INCH));
        telemetry.update();
        if (inputDistSensor.getDistance(DistanceUnit.INCH) < EMPTY_INPUT_DISTANCE-1){

        }
    }
}