package schedule;

public class Course {
    private String courseName;
    private int courseNumber;

    public Course(String name, int number)
    {
        courseName = name;
        courseNumber = number;
    }
}



public class Schedule {

    public static void main(String[] args) {
        // TODO code application logic here
        Course[] ISEngReq = new Course[50];
        ISEng[0] = new Course("MTH", 1554);
        ISEng[1] = new Course("CHM", 1430);
        ISEng[2] = new Course("EGR", 1400);
        ISEng[3] = new Course("WRT", 1060);
        ISEng[4] = new Course("EGR", 1200);
        ISEng[5] = new Course("MTH", 1555);
        ISEng[6] = new Course("PHY", 1610);
        ISEng[7] = new Course("EGR", 2400);
        ISEng[8] = new Course("EGR", 2600);
        ISEng[9] = new Course("APM", 2555);
        ISEng[10] = new Course("PHY", 1620);
        ISEng[11] = new Course("EGR", 2500);
        ISEng[12] = new Course("EGR", 2800);
        ISEng[13] = new Course("APM", 2663);
        ISEng[14] = new Course("MTH", 2554);
        ISEng[15] = new Course("ISE", 3318);
        ISEng[16] = new Course("ISE", 3341);
        ISEng[17] = new Course("MSE", 0000); //Approved Math/Science Elective
        ISEng[18] = new Course("ISE", 3330);
        ISEng[19] = new Course("ISE", 4469);
        ISEng[20] = new Course("ISE", 4484);
        ISEng[21] = new Course("ECN", 1500);
        ISEng[22] = new Course("ECN", 2010);
        ISEng[23] = new Course("ECN", 2020);
        ISEng[24] = new Course("ECN", 2100);
        ISEng[25] = new Course("ISE", 4483);
        ISEng[26] = new Course("ISE", 0000); //ISE Professional Elective
        ISEng[27] = new Course("ISE", 0000); //ISE Professional Elective
        ISEng[28] = new Course("PHL", 1310);
        ISEng[29] = new Course("ISE", 4485);
        ISEng[30] = new Course("ISE", 4487);
        ISEng[31] = new Course("ISE", 4491);
        ISEng[32] = new Course("ISE", 0000); //ISE Professional Elective

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Course[] MechEngReq = new Course[50];
        MechEng[0] = new Course("EGR", 1200);
        MechEng[1] = new Course("MTH", 1554);
        MechEng[2] = new Course("CHM", 1430);
        MechEng[3] = new Course("WRT", 1060);
        MechEng[4] = new Course("MTH", 1555);
        MechEng[5] = new Course("PHY", 1610);
        MechEng[6] = new Course("EGR", 2400);
        MechEng[8] = new Course("APM", 2555); 
        MechEng[9] = new Course("PHY", 1620);
        MechEng[10] = new Course("EGR", 2500);
        MechEng[11] = new Course("MTH", 2554); 
        MechEng[12] = new Course("EGR", 2600);
        MechEng[13] = new Course("EGR", 2800);
        MechEng[14] = new Course("ME", 3200);
        MechEng[15] = new Course("ME", 3500);
        MechEng[16] = new Course("ME", 3700); 
        MechEng[17] = new Course("ME", 3250);
        MechEng[18] = new Course("ME", 3300);
        MechEng[19] = new Course("AME", 0000); //Approved Math/Science Elective
        MechEng[20] = new Course("ME", 4200);
        MechEng[21] = new Course("ME", 4500);
        MechEng[22] = new Course("ME", 0000); //ME Professional Elective
        MechEng[23] = new Course("ECN", 1500);
        MechEng[24] = new Course("ECN", 2010);
        MechEng[25] = new Course("ECN", 2020); //ISE Professional Elective
        MechEng[26] = new Course("ECN", 2100); //ISE Professional Elective
        MechEng[27] = new Course("ME", 4999);
        MechEng[28] = new Course("ME", 4998);
        MechEng[29] = new Course("ME", 4300);
        MechEng[30] = new Course("ME", 0000); //ME Professional Elective
        MechEng[31] = new Course("PHL", 1310);

    }
}