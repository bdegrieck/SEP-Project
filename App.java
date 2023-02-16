import Course.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int courseNum = 0;
        String courseName = "";

        Course[] bioengineeringReq = new Course[40];
        Course[] computerengineeringReq = new Course[60];

        // bioengineering - Ben

        // math and science requirements
        bioengineeringReq[0] = new Course("MTH", 1554);
        bioengineeringReq[1] = new Course("MTH", 1555);
        bioengineeringReq[2] = new Course("APM", 2555);
        bioengineeringReq[3] = new Course("MTH", 2554);
        bioengineeringReq[4] = new Course("BIO", 1200);
        bioengineeringReq[5] = new Course("BIO", 1201);
        bioengineeringReq[6] = new Course("BIO", 2600);
        bioengineeringReq[7] = new Course("BIO", 3621);
        bioengineeringReq[8] = new Course("PHY", 1610);
        bioengineeringReq[8] = new Course("PHY", 1620);
        bioengineeringReq[9] = new Course("PHY", 3250);
        bioengineeringReq[10] = new Course("CHM", 1440);
        bioengineeringReq[11] = new Course("CHM", 1450);
        bioengineeringReq[12] = new Course("CHM", 2340);

        // Engineering Core
        bioengineeringReq[13] = new Course("EGR", 1200);
        bioengineeringReq[14] = new Course("EGR", 1400);
        bioengineeringReq[15] = new Course("EGR", 2400);
        bioengineeringReq[16] = new Course("EGR", 2500);
        bioengineeringReq[17] = new Course("EGR", 2600);
        bioengineeringReq[18] = new Course("EGR", 2800);

        // Required Professional Subjects
        bioengineeringReq[19] = new Course("BE", 3150);
        bioengineeringReq[20] = new Course("BE", 3899);
        bioengineeringReq[21] = new Course("BE", 4999);

        // Tracks

        // Track 1
        bioengineeringReq[22] = new Course("BE", 4100);
        bioengineeringReq[23] = new Course("BE", 4110);
        bioengineeringReq[24] = new Course("BE", 4120);
        bioengineeringReq[25] = new Course("PHY", 3260);

        // Track 2
        bioengineeringReq[26] = new Course("BE", 4200);
        bioengineeringReq[27] = new Course("BIO", 4412);
        bioengineeringReq[28] = new Course("CSI", 3450);
        bioengineeringReq[29] = new Course("CSI", 4780);

        // Track 3
        bioengineeringReq[30] = new Course("BE", 4300);
        bioengineeringReq[31] = new Course("BIO", 3500);
        bioengineeringReq[32] = new Course("BIO", 4550);
        bioengineeringReq[33] = new Course("ME", 3500);

        // Track 4
        bioengineeringReq[34] = new Course("BE", 4400);
        bioengineeringReq[35] = new Course("BIO", 3142);
        bioengineeringReq[36] = new Course("ME", 3250);
        bioengineeringReq[37] = new Course("ME", 4210);
        bioengineeringReq[38] = new Course("BE", 4900);
        bioengineeringReq[39] = new Course("BE", 4996);
        bioengineeringReq[40] = new Course("BE", 4998);

        // Computer Engineering - ben

        // math and science requirements
        computerengineeringReq[0] = new Course("MTH", 1554);
        computerengineeringReq[1] = new Course("MTH", 1555);
        computerengineeringReq[2] = new Course("APM", 2555);
        computerengineeringReq[3] = new Course("APM", 2663);
        computerengineeringReq[4] = new Course("CHM", 1430);
        computerengineeringReq[5] = new Course("PHY", 1610);
        computerengineeringReq[6] = new Course("PHY", 1620);

        // Electives
        computerengineeringReq[7] = new Course("APM", 3332);
        computerengineeringReq[8] = new Course("APM", 3557);
        computerengineeringReq[9] = new Course("APM", 4333);
        computerengineeringReq[10] = new Course("APM", 4334);
        computerengineeringReq[11] = new Course("APM", 4663);
        computerengineeringReq[12] = new Course("APM", 4777);
        computerengineeringReq[13] = new Course("BIO", 1200);
        computerengineeringReq[14] = new Course("CHM", 1450);
        computerengineeringReq[14] = new Course("CHM", 1480);
        computerengineeringReq[15] = new Course("MOR", 2442);
        computerengineeringReq[16] = new Course("MTH", 2554);
        computerengineeringReq[17] = new Course("MTH", 2775);
        computerengineeringReq[18] = new Course("MTH", 3552);
        computerengineeringReq[19] = new Course("PHY", 3250);
        computerengineeringReq[20] = new Course("PHY", 3260);
        computerengineeringReq[21] = new Course("PHY", 3310);
        computerengineeringReq[22] = new Course("PHY", 3660);
        computerengineeringReq[23] = new Course("PHY", 3710);

        // Engineering Core
        computerengineeringReq[24] = new Course("EGR", 1200);
        computerengineeringReq[25] = new Course("EGR", 1400);
        computerengineeringReq[26] = new Course("EGR", 2400);
        computerengineeringReq[27] = new Course("EGR", 2500);
        computerengineeringReq[28] = new Course("EGR", 2600);
        computerengineeringReq[29] = new Course("EGR", 2800);

        // Required Profession Subjects
        computerengineeringReq[30] = new Course("CSI", 2290);
        computerengineeringReq[31] = new Course("ECE", 2005);
        computerengineeringReq[32] = new Course("ECE", 2700);
        computerengineeringReq[33] = new Course("ECE", 3100);
        computerengineeringReq[34] = new Course("ECE", 3204);
        computerengineeringReq[35] = new Course("ECE", 3720);
        computerengineeringReq[36] = new Course("ECE", 4710);
        computerengineeringReq[37] = new Course("ECE", 4721);
        computerengineeringReq[38] = new Course("ECE", 4999);

        // Professional Tracks

        // Computers and Algorithms choose one
        computerengineeringReq[39] = new Course("CSI", 3610);
        computerengineeringReq[40] = new Course("CSI", 3640);
        computerengineeringReq[41] = new Course("ECE", 4772);

        // track 1
        computerengineeringReq[42] = new Course("ECE", 3300);
        computerengineeringReq[43] = new Course("ECE", 4210);
        computerengineeringReq[44] = new Course("ECE", 4230);
        computerengineeringReq[45] = new Course("ECE", 4310);

        // track 2
        computerengineeringReq[46] = new Course("ECE", 3105);
        computerengineeringReq[47] = new Course("ECE", 4130);
        computerengineeringReq[48] = new Course("ECE", 4132);
        computerengineeringReq[49] = new Course("ECE", 4135);

        // track 3
        computerengineeringReq[50] = new Course("ECE", 3600);
        computerengineeringReq[51] = new Course("ECE", 4400);
        computerengineeringReq[52] = new Course("ECE", 4415);
        computerengineeringReq[53] = new Course("ECE", 4520);

        // track 4
        computerengineeringReq[54] = new Course("CSI", 3370);
        computerengineeringReq[55] = new Course("CSI", 3450);
        computerengineeringReq[56] = new Course("CSI", 3610);
        computerengineeringReq[57] = new Course("CSI", 4240);
        computerengineeringReq[58] = new Course("CSI", 4480);
        computerengineeringReq[59] = new Course("CSI", 4500);
        computerengineeringReq[60] = new Course("CSI", 5490);

        Course[] engChemReq = new Course[100];

        engChemReq[0] = new Course("MTH", 1554);
        engChemReq[1] = new Course("MTH", 1555);
        engChemReq[2] = new Course("MTH", 2554);
        engChemReq[3] = new Course("APM", 2555);
        engChemReq[4] = new Course("PHY", 1610);
        engChemReq[5] = new Course("PHY", 1620);
        engChemReq[6] = new Course("CHM", 1440);
        // must take this one with CHM 1440
        engChemReq[8] = new Course("CHM", 1470);

        engChemReq[7] = new Course("CHM", 1450);
        // must take this one with CHM 1450
        engChemReq[9] = new Course("CHM", 1480);

        engChemReq[10] = new Course("EGR", 1200);
        engChemReq[11] = new Course("EGR", 1400);
        engChemReq[12] = new Course("EGR", 2400);
        engChemReq[13] = new Course("EGR", 2500);
        engChemReq[14] = new Course("EGR", 2600);
        engChemReq[15] = new Course("EGR", 2800);

        engChemReq[16] = new Course("CHM", 2340);
        engChemReq[17] = new Course("CHM", 2350);
        engChemReq[18] = new Course("CHM", 2370);
        engChemReq[19] = new Course("CHM", 3250);
        engChemReq[20] = new Course("CHM", 3420);
        engChemReq[21] = new Course("CHM", 3430);
        engChemReq[22] = new Course("CHM", 3480);
        engChemReq[23] = new Course("CHM", 4710);
        engChemReq[24] = new Course("ME", 3500);
        // 1 class over CHM4000
        // one of these
        engChemReq[25] = new Course("ME", 4999);
        engChemReq[26] = new Course("CHM", 4996);

        // 8 credits from these
        engChemReq[27] = new Course("ME", 4500);
        engChemReq[28] = new Course("ME", 4510);
        engChemReq[29] = new Course("ME", 4520);
        engChemReq[30] = new Course("ME", 4540);
        engChemReq[31] = new Course("ME", 4550);
        engChemReq[32] = new Course("ECE", 4400);

        Course[] engPhyReq = new Course[100];

        engPhyReq[0] = new Course("MTH", 1554);
        engPhyReq[1] = new Course("MTH", 1555);
        engPhyReq[2] = new Course("MTH", 2554);
        engPhyReq[3] = new Course("APM", 2555);
        // one of these
        engPhyReq[4] = new Course("CHM", 1430);
        engPhyReq[5] = new Course("CHM", 1440);
        // must take this one with CHM 1440
        engPhyReq[6] = new Course("CHM", 1470);

        engPhyReq[7] = new Course("PHY", 1510);
        // must take this one with PHY 1510
        engPhyReq[8] = new Course("PHY", 1100);

        engPhyReq[9] = new Course("PHY", 1520);
        // must take this one with PHY 1520
        engPhyReq[10] = new Course("PHY", 1110);

        engPhyReq[11] = new Course("PHY", 3170);
        engPhyReq[12] = new Course("PHY", 3510);
        engPhyReq[13] = new Course("PHY", 3610);
        engPhyReq[14] = new Course("PHY", 3710);

        // one of these
        engPhyReq[15] = new Course("PHY", 3310);
        engPhyReq[16] = new Course("PHY", 3660);
        engPhyReq[17] = new Course("PHY", 3810);
        engPhyReq[18] = new Course("PHY", 4720);

        engPhyReq[19] = new Course("EGR", 1200);
        engPhyReq[20] = new Course("EGR", 1400);
        engPhyReq[21] = new Course("EGR", 2400);
        engPhyReq[22] = new Course("EGR", 2500);
        engPhyReq[23] = new Course("EGR", 2600);
        engPhyReq[24] = new Course("EGR", 2800);

        engPhyReq[25] = new Course("ECE", 2005);
        engPhyReq[26] = new Course("ECE", 3100);
        engPhyReq[27] = new Course("PHY", 4995);

        // Option 1
        engPhyReq[28] = new Course("ECE", 4130);
        engPhyReq[29] = new Course("PHY", 4720);

        // one of these
        engPhyReq[30] = new Course("ECE", 4135);
        engPhyReq[31] = new Course("ECE", 4210);
        engPhyReq[32] = new Course("ECE", 4710);

        // Option 2
        engPhyReq[33] = new Course("PHY", 3660);
        engPhyReq[34] = new Course("ME", 3200);

        // one of these
        engPhyReq[35] = new Course("ME", 4210);
        engPhyReq[36] = new Course("ME", 4300);
        engPhyReq[37] = new Course("ME", 4350);
        engPhyReq[38] = new Course("ME", 4500);
        engPhyReq[39] = new Course("ME", 4550);

        // choose 8 credits from
        engPhyReq[40] = new Course("MTH", 2775);
        engPhyReq[41] = new Course("APM", 2663);
        engPhyReq[42] = new Course("PHY", 3180);
        engPhyReq[43] = new Course("PHY", 3310);
        engPhyReq[44] = new Course("PHY", 3660);
        engPhyReq[45] = new Course("PHY", 3720);
        engPhyReq[46] = new Course("PHY", 3810);
        engPhyReq[47] = new Course("PHY", 4180);
        engPhyReq[48] = new Course("PHY", 4720);
        engPhyReq[49] = new Course("PHY", 4820);
        engPhyReq[50] = new Course("ECE", 4710);
        engPhyReq[51] = new Course("ME", 3250);
        engPhyReq[52] = new Course("ME", 3500);
        // one 4000 ECE, ME, or ISE

        Course[] indSysEngReq = new Course[100];

        indSysEngReq[0] = new Course("MTH", 1554);
        indSysEngReq[1] = new Course("MTH", 1555);
        // one of these
        indSysEngReq[2] = new Course("APM", 2555);
        indSysEngReq[3] = new Course("APM", 2559);
        // must take this one with APM 2559
        indSysEngReq[4] = new Course("MTH", 2775);

        // one of these
        indSysEngReq[5] = new Course("APM", 2663);
        indSysEngReq[6] = new Course("MTH", 2554);

        indSysEngReq[7] = new Course("CHM", 1430);
        indSysEngReq[8] = new Course("PHY", 1610);
        indSysEngReq[9] = new Course("PHY", 1620);

        // one of these
        indSysEngReq[10] = new Course("APM", 2663);
        indSysEngReq[11] = new Course("APM", 3332);
        indSysEngReq[12] = new Course("APM", 3557);
        indSysEngReq[13] = new Course("APM", 4333);
        indSysEngReq[14] = new Course("APM", 4334);
        indSysEngReq[15] = new Course("APM", 4663);
        indSysEngReq[16] = new Course("APM", 4777);
        indSysEngReq[17] = new Course("BIO", 1200);
        indSysEngReq[18] = new Course("BIO", 1300);
        indSysEngReq[19] = new Course("BIO", 2100);
        indSysEngReq[20] = new Course("BIO", 2600);
        indSysEngReq[21] = new Course("BIO", 3400);
        indSysEngReq[22] = new Course("MTH", 2554);
        indSysEngReq[23] = new Course("MTH", 2775);
        indSysEngReq[24] = new Course("MTH", 3552);
        indSysEngReq[25] = new Course("PHY", 3250);
        indSysEngReq[26] = new Course("PHY", 3260);
        indSysEngReq[27] = new Course("STA", 4002);

        indSysEngReq[28] = new Course("EGR", 1200);
        indSysEngReq[29] = new Course("EGR", 1400);
        indSysEngReq[30] = new Course("EGR", 2400);
        indSysEngReq[31] = new Course("EGR", 2500);
        indSysEngReq[32] = new Course("EGR", 2600);
        indSysEngReq[33] = new Course("EGR", 2800);

        indSysEngReq[34] = new Course("ISE", 3318);
        indSysEngReq[35] = new Course("ISE", 3330);
        indSysEngReq[36] = new Course("ISE", 3341);
        indSysEngReq[37] = new Course("ISE", 4469);
        indSysEngReq[38] = new Course("ISE", 4483);
        indSysEngReq[39] = new Course("ISE", 4484);
        indSysEngReq[40] = new Course("ISE", 4485);
        indSysEngReq[41] = new Course("ISE", 4487);
        indSysEngReq[42] = new Course("ISE", 4491);

        // choose 12 credits from
        // choose at least 8 credits from
        indSysEngReq[43] = new Course("ISE", 4410);
        indSysEngReq[43] = new Course("ISE", 4421);
        indSysEngReq[44] = new Course("ISE", 4422);
        indSysEngReq[45] = new Course("ISE", 4423);
        indSysEngReq[46] = new Course("ISE", 4431);
        indSysEngReq[47] = new Course("ISE", 4434);
        indSysEngReq[48] = new Course("ISE", 4435);
        indSysEngReq[49] = new Course("ISE", 4441);
        indSysEngReq[50] = new Course("ISE", 4450);
        indSysEngReq[51] = new Course("ISE", 4455);
        indSysEngReq[52] = new Course("ISE", 4456);
        indSysEngReq[53] = new Course("ISE", 4461);
        indSysEngReq[54] = new Course("ISE", 4462);
        indSysEngReq[55] = new Course("ISE", 4463);
        indSysEngReq[56] = new Course("ISE", 4464);
        indSysEngReq[57] = new Course("ISE", 4466);
        indSysEngReq[58] = new Course("ISE", 4467);
        indSysEngReq[59] = new Course("ISE", 4480);
        indSysEngReq[60] = new Course("ISE", 4482);
        indSysEngReq[61] = new Course("ISE", 4488);
        indSysEngReq[62] = new Course("ISE", 4900);
        indSysEngReq[63] = new Course("ISE", 4700);

        indSysEngReq[64] = new Course("ISE", 4996);
        indSysEngReq[65] = new Course("ISE", 4998);
        indSysEngReq[66] = new Course("ME", 3700);
        indSysEngReq[67] = new Course("HRD", 4600);

        Course[] ISEngReq = new Course[100];
        ISEngReq[0] = new Course("MTH", 1554);
        ISEngReq[1] = new Course("CHM", 1430);
        ISEngReq[2] = new Course("EGR", 1400);
        ISEngReq[3] = new Course("WRT", 1060);
        ISEngReq[4] = new Course("EGR", 1200);
        ISEngReq[5] = new Course("MTH", 1555);
        ISEngReq[6] = new Course("PHY", 1610);
        ISEngReq[7] = new Course("EGR", 2400);
        ISEngReq[8] = new Course("EGR", 2600);
        ISEngReq[9] = new Course("APM", 2555);
        ISEngReq[10] = new Course("PHY", 1620);
        ISEngReq[11] = new Course("EGR", 2500);
        ISEngReq[12] = new Course("EGR", 2800);
        ISEngReq[13] = new Course("APM", 2663);
        ISEngReq[14] = new Course("MTH", 2554);
        ISEngReq[15] = new Course("ISE", 3318);
        ISEngReq[16] = new Course("ISE", 3341);
        ISEngReq[17] = new Course("MSE", 0000); // Approved Math/Science Elective
        ISEngReq[18] = new Course("ISE", 3330);
        ISEngReq[19] = new Course("ISE", 4469);
        ISEngReq[20] = new Course("ISE", 4484);
        ISEngReq[21] = new Course("ECN", 1500);
        ISEngReq[22] = new Course("ECN", 2010);
        ISEngReq[23] = new Course("ECN", 2020);
        ISEngReq[24] = new Course("ECN", 2100);
        ISEngReq[25] = new Course("ISE", 4483);
        ISEngReq[26] = new Course("ISE", 0000); // ISE Professional Elective
        ISEngReq[27] = new Course("ISE", 0000); // ISE Professional Elective
        ISEngReq[28] = new Course("PHL", 1310);
        ISEngReq[29] = new Course("ISE", 4485);
        ISEngReq[30] = new Course("ISE", 4487);
        ISEngReq[31] = new Course("ISE", 4491);
        ISEngReq[32] = new Course("ISE", 0000); // ISE Professional Elective

        Course[] MechEngReq = new Course[50];
        MechEngReq[0] = new Course("EGR", 1200);
        MechEngReq[1] = new Course("MTH", 1554);
        MechEngReq[2] = new Course("CHM", 1430);
        MechEngReq[3] = new Course("WRT", 1060);
        MechEngReq[4] = new Course("MTH", 1555);
        MechEngReq[5] = new Course("PHY", 1610);
        MechEngReq[6] = new Course("EGR", 2400);
        MechEngReq[8] = new Course("APM", 2555);
        MechEngReq[9] = new Course("PHY", 1620);
        MechEngReq[10] = new Course("EGR", 2500);
        MechEngReq[11] = new Course("MTH", 2554);
        MechEngReq[12] = new Course("EGR", 2600);
        MechEngReq[13] = new Course("EGR", 2800);
        MechEngReq[14] = new Course("ME", 3200);
        MechEngReq[15] = new Course("ME", 3500);
        MechEngReq[16] = new Course("ME", 3700);
        MechEngReq[17] = new Course("ME", 3250);
        MechEngReq[18] = new Course("ME", 3300);
        MechEngReq[19] = new Course("AME", 0000); // Approved Math/Science Elective
        MechEngReq[20] = new Course("ME", 4200);
        MechEngReq[21] = new Course("ME", 4500);
        MechEngReq[22] = new Course("ME", 0000); // ME Professional Elective
        MechEngReq[23] = new Course("ECN", 1500);
        MechEngReq[24] = new Course("ECN", 2010);
        MechEngReq[25] = new Course("ECN", 2020); // ISE Professional Elective
        MechEngReq[26] = new Course("ECN", 2100); // ISE Professional Elective
        MechEngReq[27] = new Course("ME", 4999);
        MechEngReq[28] = new Course("ME", 4998);
        MechEngReq[29] = new Course("ME", 4300);
        MechEngReq[30] = new Course("ME", 0000); // ME Professional Elective
        MechEngReq[31] = new Course("PHL", 1310);

        Course[] electricalReq = new Course[50];
        //Approved MTH and Science courses
        electricalReq[1] = new Course("MTH", 1554);
        electricalReq[2] = new Course("MTH", 1555);
        electricalReq[3] = new Course("APM", 2555);
        electricalReq[4] = new Course("MTH", 2554);
        electricalReq[5] = new Course("CHM", 1430);
        electricalReq[6] = new Course("PHY", 1610);
        electricalReq[7] = new Course("PHY", 1620);


        //Pick Approved MTH/Science class
        electricalReq[8] = new Course("APM", 2663);
        electricalReq[9] = new Course("APM", 3332);
        electricalReq[10] = new Course("APM", 3557);
        electricalReq[11] = new Course("APM", 4333);
        electricalReq[12] = new Course("APM", 4334);
        electricalReq[13] = new Course("APM", 4555);
        electricalReq[14] = new Course("APM", 4663);
        electricalReq[15] = new Course("APM", 4777);
        electricalReq[16] = new Course("BIO", 1200);
        electricalReq[17] = new Course("BIO", 3400);
        electricalReq[18] = new Course("BIO", 3220);
        electricalReq[19] = new Course("BIO", 4412);
        electricalReq[20] = new Course("CHM", 1450);
        electricalReq[21] = new Course("MTH", 3552);
        electricalReq[22] = new Course("PHY", 3250);
        electricalReq[23] = new Course("PHY", 3310);
        electricalReq[24] = new Course("PHY", 3610);
        electricalReq[25] = new Course("PHY", 3660);
        electricalReq[26] = new Course("PHY", 3710);
        electricalReq[27] = new Course("PHY", 4310);

        //ENG Core
        electricalReq[28] = new Course("EGR", 1200);
        electricalReq[29] = new Course("EGR", 1400);
        electricalReq[30] = new Course("EGR", 2500);
        electricalReq[31] = new Course("EGR", 2600);
        electricalReq[32] = new Course("EGR", 2800);

        //Required Professional Subjects
        electricalReq[33] = new Course("ECE", 2005);
        electricalReq[34] = new Course("ECE", 2700);
        electricalReq[35] = new Course("ECE", 3105);
        electricalReq[36] = new Course("ECE", 3204);
        electricalReq[37] = new Course("ECE", 3300);
        electricalReq[38] = new Course("ECE", 3600);
        electricalReq[39] = new Course("ECE", 4999);

        //Professional Depth Area's
        //Communications Track
        electricalReq[40] = new Course("ECE", 4210);
        electricalReq[41] = new Course("ECE", 4220);
        electricalReq[42] = new Course("ECE", 4230);

        //Computer Engineering Track
        electricalReq[43] = new Course("ECE", 3720);
        electricalReq[44] = new Course("ECE", 4710);
        electricalReq[45] = new Course("ECE", 4721);
        electricalReq[46] = new Course("ECE", 4772);

        //Control Systems Track
        electricalReq[47] = new Course("ECE", 4400);
        electricalReq[48] = new Course("ECE", 4410);
        electricalReq[49] = new Course("ECE", 4415);

        //Electromagnetics Track
        electricalReq[50] = new Course("ECE", 4305);
        electricalReq[51] = new Course("ECE", 4310);
        electricalReq[52] = new Course("ECE", 4320);

        //Electronics Track
        electricalReq[53] = new Course("ECE", 4132);
        electricalReq[54] = new Course("ECE", 4130);
        electricalReq[55] = new Course("ECE", 4135);

        //Robotics Track
        electricalReq[56] = new Course("ECE", 4500);
        electricalReq[57] = new Course("ECE", 4510);
        electricalReq[58] = new Course("ECE", 4520);
        electricalReq[59] = new Course("ECE", 4551);

        //Power Systems Track
        electricalReq[60] = new Course("ECE", 4610);
        electricalReq[61] = new Course("ECE", 4620);
        electricalReq[62] = new Course("ECE", 4630);

        Course[] computerReq = new Course[50];
        //Mathematics and Science
        computerReq[0] = new Course("MTH", 1554);
        computerReq[1] = new Course("MTH", 1555);
        computerReq[2] = new Course("MTH", 2775);
        computerReq[3] = new Course("APM", 2663);
        computerReq[4] = new Course("STA", 2226);

        //Bio and Lab
        computerReq[5] = new Course("BIO", 1200);
        computerReq[6] = new Course("BIO", 1201);

        //Chm and Lab
        computerReq[7] = new Course("CHM", 1440);
        computerReq[8] = new Course("CHM", 1470);

        //Phy and Lab
        computerReq[9] = new Course("PHY", 1510);
        computerReq[10] = new Course("PHY", 1100);

        computerReq[11] = new Course("CHM", 1430);
        computerReq[12] = new Course("PHY", 1610);
        computerReq[13] = new Course("PHY", 1620);

        //Computer Sciece Core
        computerReq[14] = new Course("CSI", 1420);
        computerReq[15] = new Course("CSI", 2300);
        computerReq[16] = new Course("CSI", 2310);
        computerReq[17] = new Course("CSI", 2470);
        computerReq[18] = new Course("CSI", 2999);

        //Professional Subjects
        computerReq[19] = new Course("CSI", 3370);
        computerReq[20] = new Course("CSI", 3430);
        computerReq[21] = new Course("CSI", 3450);
        computerReq[22] = new Course("CSI", 3610);
        computerReq[23] = new Course("CSI", 3640);
        computerReq[24] = new Course("CSI", 3450);
        computerReq[25] = new Course("CSI", 4480);
        computerReq[26] = new Course("CSI", 4500);
        computerReq[27] = new Course("CSI", 4650);
        computerReq[28] = new Course("CSI", 4999);

        //Computational Intelligence Track
        computerReq[29] = new Course("CSI", 4130);
        computerReq[30] = new Course("CSI", 4810);

        //System Administration Track
        computerReq[31] = new Course("CSI", 3660);
        computerReq[32] = new Course("CSI", 4660);

        //Bioinformatics Track
        computerReq[33] = new Course("BIO", 3400);
        computerReq[34] = new Course("CSI", 4780);

        //Cybersecurity Track
        computerReq[35] = new Course("CSI", 4460);
        computerReq[36] = new Course("CSI", 4700);
        computerReq[37] = new Course("APM", 4347);

        //Game Development Track
        computerReq[38] = new Course("CSI", 3380);
        computerReq[39] = new Course("CSI", 4380);

        //Mobile Applications Development Track
        computerReq[40] = new Course("CSI", 3150);
        computerReq[41] = new Course("CSI", 4230);

        //Web Development Track
        computerReq[42] = new Course("CSI", 3150);
        computerReq[43] = new Course("CSI", 4160);

        //Take 5 credits from the followng courses
        computerReq[44] = new Course("CSI", 2320);
        computerReq[45] = new Course("CSI", 2330);
        computerReq[46] = new Course("CSI", 2340);
        computerReq[47] = new Course("CSI", 2350);
        computerReq[48] = new Course("APM", 2555);
        computerReq[49] = new Course("APM", 3332);
        computerReq[50] = new Course("APM", 4333);
        computerReq[51] = new Course("APM", 4334);
        computerReq[52] = new Course("APM", 4663);
        computerReq[53] = new Course("APM", 4777);
        computerReq[54] = new Course("EGR", 2400);
        computerReq[55] = new Course("MTH", 3552);
        computerReq[56] = new Course("MOR", 2442);
        computerReq[57] = new Course("PHY", 1110);
        computerReq[58] = new Course("PHY", 3250);
        computerReq[59] = new Course("PHY", 3260);
        computerReq[60] = new Course("PHY", 3310);
        computerReq[61] = new Course("PHY", 3660);
        computerReq[62] = new Course("PHY", 3710);
    }
}
