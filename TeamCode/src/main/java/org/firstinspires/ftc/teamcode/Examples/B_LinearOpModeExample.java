package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

//LinearOpMode is another format of coding java in FTC (sorta). I personally use it for autonomous programs and use OpMode for TeleOp

@Autonomous
public class B_LinearOpModeExample extends LinearOpMode { //Make sure to put "extends LinearOpMode"
    @Override
    public void runOpMode(){ // This is the function where the robot does stuff
        //Code here is for initialization
        waitForStart(); // Waits until initialization ends
        //Code here is what happens at the very beginning of run mode
        while(opModeIsActive()){ // Its like the loop function in OpMode. Repeats during run mode until program is stopped

        }
    }

    // Most of my lessons will be in OpMode. All my lessons can be adapted to LinearOpMode, so you can do so if you prefer it
}
