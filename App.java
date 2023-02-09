import Course.Course;

public class App {
    public static void main(String[] args) throws Exception {

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

<<<<<<< Updated upstream
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
              
=======
>>>>>>> Stashed changes
    }

}
