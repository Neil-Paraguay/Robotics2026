package org.firstinspires.ftc.teamcode;
import static com.pedropathing.api.Paths.*;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;

public class Auto1 {
    private final PoseFactory poseFactory = PoseFactory.degrees();
    private final Pose start = poseFactory.of(59.0684, 9.4443, 90);
    private final Pose path1 = poseFactory.of(59.0439, 16.3514, 90);
    private final Pose point2 = poseFactory.of(11.9029, 10.9721, -135);
    private final Pose point2Control1 = poseFactory.of(21.0988, 35.9367, 0);
    private final Pose point3Start = poseFactory.of(11.9029, 10.9721, -90);
    private final Pose point3 = poseFactory.of(58.19, 16.0059, 90);
    private final Pose point4 = poseFactory.of(10.109, 96.1318, -82.3231);
    private final Pose point4Control1 = poseFactory.of(16.7078, 45.7804, 0);
    public Path path1() {
        return line(start, path1).linear(start, path1);
        // shoot balls during
    }

    public Path path2() {
        return curve(path1, point2Control1, point2).linear(path1, point2);
        //pick up balls
    }

    public Path path3() {
        return line(point3Start, point3).linear(point3Start, point3);
        //shoot again using maybe April tags
    }

    public Path path4() {
        return curve(point3, point4Control1, point4).reverseTangent();
        //stop everything and get to ending position
    }
}