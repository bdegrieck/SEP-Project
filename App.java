import Course.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int courseNum = 0;
        String courseName = "";

        Course[] bioengineeringReq = new Course[50];
        bioengineeringReq[0] = new Course("APM", 2663);
        
        // Engineering Chemistry Requirements
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
        
        
        // Engineering Physics Requirements
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
        
        
        // Industrial Systems Engineering Requirements
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
              
    }

}
