package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.RobotHardware;

@Autonomous(name = "GyroScope", group = "Test")

public class GyroScope extends LinearOpMode{

    RobotHardware robot = new RobotHardware();


    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        waitForStart();

        robot.motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        robot.motor1.setTargetPosition(1000);
        robot.motor2.setTargetPosition(-1000);
        robot.motor1.setPower(1);
        robot.motor2.setPower(1);
        sleep(2000);

        robot.motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        while (robot.GyroScope.getheading() > 330 || robot.GyroScope.getheading() < 9 0) {

            robot.motor1.setPower(1);
            robot.motor2.setPower(1);

        }

        robot.motor1.setPower(0);
        robot.motor2.setPower(0);

    }


}
