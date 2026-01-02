package imtahan1;

import java.util.Date;

public class OnlineCourse extends Course{
    private String platform;
    private Integer duration;

    public OnlineCourse(String courseName, String instructor, Double credits, String platform, Integer duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }


    public void printInfo(){
        System.out.println("kursun adi :"+getCourseName());
        System.out.println("muellim :"+getInstructor());
        System.out.println("kursun qiymeti"+getCredits());
        System.out.println("platform :"+platform);
        System.out.println("muddet:"+duration);
    }
    public void hasCertificate(Integer time ){
        if(time==duration){
            System.out.println("you have a certificate form this lesson");
        }
        else {
            System.out.println("kursu bitirmemisiniz");
        }
    }
}
