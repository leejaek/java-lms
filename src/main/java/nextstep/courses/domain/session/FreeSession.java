package nextstep.courses.domain.session;

import nextstep.courses.constant.SessionStatus;
import nextstep.courses.constant.SessionType;
import nextstep.courses.domain.Course;
import nextstep.courses.domain.SessionImage;
import nextstep.users.domain.NsUser;

import java.time.LocalDateTime;

public class FreeSession extends Session {
    public FreeSession(Course course, SessionImage sessionImage, LocalDateTime startTime, LocalDateTime endTime, SessionStatus sessionStatus) {
        super(course, sessionImage, startTime, endTime, sessionStatus, SessionType.FREE);
    }

    public void enroll(NsUser nsUser) {
        validateEnrollSessionStatus();
        super.enrollStudent(nsUser);
    }
}