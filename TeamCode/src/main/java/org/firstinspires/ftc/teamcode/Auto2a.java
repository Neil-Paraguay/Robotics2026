package org.firstinspires.ftc.teamcode;
import static com.pedropathing.api.Paths.*;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;

public class Auto2a {

    private final PoseFactory poseFactory = PoseFactory.degrees();

    private final Pose start = poseFactory.of(30.6639, 9.1951, 90);
    private final Pose path1 = poseFactory.of(35.6833, 16.8784, 56.8437);
    private final Pose point2Start = poseFactory.of(35.6833, 16.8784, 0);
    private final Pose point2 = poseFactory.of(10.2779, 10.2779, -90);
    private final Pose point2Control1 = poseFactory.of(29.9519, 41.1664, 0);
    private final Pose point3 = poseFactory.of(61.6672, 130.9831, -85.4044);
    private final Pose point3Control1 = poseFactory.of(32.0287, 54.0186, 0);
    private final Pose point3Control2 = poseFactory.of(22.2289, 99.6715, 0);
    private final Pose point3Control3 = poseFactory.of(23.5524, 111.0338, 0);
    private final Pose point3Control4 = poseFactory.of(64.6883, 103.4873, 0);
    private final Pose point4 = poseFactory.of(13.4738, 115.0481, 0);
    private final Pose point4Control1 = poseFactory.of(37.2838, 117.7213, 0);

    public Path path1() {
        return line(start, path1).tangent();
    } // shoot the balls in storage

    public Path path2() {
        return curve(point2Start, point2Control1, point2).linear(point2Start, point2); //collect more
    }

    public Path path3() {
        return curve(point2, point3Control1, point3Control2, point3Control3, point3Control4, point3).reverseTangent();
    } // go to the second spot to shoot the other side

    public Path path4() {
        return curve(point3, point4Control1, point4).constant(point4);
    } //end in the zone
}