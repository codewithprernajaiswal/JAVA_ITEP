interface CertificateProvider {
    void generateCertificate();
}

abstract class Course {
    private String title;
    private int duration;
    private String unit;
    private boolean started;

    public Course() {}

    public Course(String title, int duration, String unit) {
        this.title = title;
        this.duration = duration;
        this.unit = unit.toLowerCase();
        this.started = false;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getUnit() {
        return this.unit;
    }

    public boolean getStarted() {
        return this.started;
    }

    public void setStarted() {
        this.started = true;
    }

    abstract public void startCourse();
    abstract public void endCourse();

    public void courseDetail() {
        startCourse();
        endCourse();
    }
}

class VideoCourse extends Course implements CertificateProvider {
    public VideoCourse() {}

    public VideoCourse(String title, int duration, String unit) {
        super(title, duration, unit); // ✅ Fixed constructor
    }

    public void startCourse() { // ✅ Corrected method name
        setStarted();
    }

    public void endCourse() {
        if (!getStarted())
            System.out.println("Course is not started yet..");
        else {
            switch (getUnit()) {
                case "months":
                    System.out.println(getTitle() + " course will end in " + getDuration() + " months.");
                    break;
                case "years":
                    System.out.println(getTitle() + " course will end in " + getDuration() + " years.");
                    break;
                default:
                    System.out.println("Invalid Case. Use Months/Years.");
            }
        }
    }

    public void generateCertificate() {
        System.out.println("You have successfully completed the course " + getTitle());
    }
}
class LiveCourse extends Course {
    public LiveCourse(String title, int duration, String unit) {
        super(title, duration, unit);
    }

    public void startCourse() {
        setStarted();
    }

    public void endCourse() {
        if (!getStarted()) {
            System.out.println(getTitle() + " course is not started yet.");
        } else {
            switch (getUnit()) {
                case "minutes":
                    System.out.println(getTitle() + " course will end in " + getDuration() + " minutes.");
                    break;
                case "hours":
                    System.out.println(getTitle() + " course will end in " + getDuration() + " hours.");
                    break;
                default:
                    System.out.println("Invalid unit. Use Hours/Minutes.");
            }
        }
    }
}



class Test {
    public static void main(String args[]) {
        VideoCourse vc = new VideoCourse("AI-ML", 2, "months");

        Course vc_course = vc;
        CertificateProvider vc_certificate = vc;

        vc_course.courseDetail(); 
        vc_certificate.generateCertificate();
    }
}
