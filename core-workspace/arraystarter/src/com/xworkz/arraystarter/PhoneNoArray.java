package com.xworkz.arraystarter;

/*int len=phoneNo.length;
System.out.println("Length of an array "+len);
for(int no=0;no<len;no++) {
	System.out.println(no);
	long pNo=phoneNo[no];
	System.out.println(pNo);
}*/

/*for(long adhar:adharNo) {
System.out.println(adhar);
}*/

public class PhoneNoArray {

	public static void main(String[] args) {

		long gomtesh = 8792577108l;
		long abhi = 7276975930l;
		long shivsai = 8095916132l;
		long rakesh = 9036162108l;
		long kiran = 8762630259l;
		long basavraj = 8050688125l;
		long harshita = 8660400865l;
		long vandu = 8139966651l;

		long[] phoneNo = { gomtesh, abhi, shivsai, rakesh, kiran, basavraj, harshita, vandu, 7406161807l, 9538380646l,
				9611818215l, };
		System.out.println("Adhar No");
		System.out.println("Gomtesh " + phoneNo[0]);
		System.out.println("abhi " + phoneNo[1]);
		System.out.println("shivsai " + phoneNo[2]);
		System.out.println("rakesh " + phoneNo[3]);
		System.out.println("kiran " + phoneNo[4]);
		System.out.println("basavraj  " + phoneNo[5]);
		System.out.println("harshita " + phoneNo[6]);
		System.out.println("vandu  " + phoneNo[7]);

		phoneNo[1] = 1234567890L;
		System.out.println("Gomtesh changed no is " + phoneNo[1]);

		phoneNo[3] = 1212121212l;
		System.out.println("rakesh changed no is s" + phoneNo[3]);

		long index = phoneNo[8];
		long index1 = phoneNo[9];
		long index2 = phoneNo[10];
		System.out.println("index8 " + index);
		System.out.println("index9 " + index1);
		System.out.println("index10 " + index2);

		// Adhar no
		long gomteshAdharNo = 209470519540l;
		long abhiAdharNo = 554803810828l;
		long shivsaiAdharNo = 262146442086l;
		long rakeshAdharNo = 211452709955l;
		long kiranAdharNo = 784398521012l;
		long basavrajAdharNo = 819280864572l;
		long harshitaAdharNo = 111122223333l;
		long vanduAdharNo = 444477779999l;

		long[] adharNo = { gomteshAdharNo, abhiAdharNo, shivsaiAdharNo, rakeshAdharNo, kiranAdharNo, basavrajAdharNo,
				harshitaAdharNo, vanduAdharNo, 555566662222l, 000077771111l, 111122223333l };
		System.out.println("Gomtesh Adhar no  " + adharNo[0]);
		System.out.println("abhi Adhar no   " + adharNo[1]);
		System.out.println("shivsai Adhar no   " + adharNo[2]);
		System.out.println("rakesh Adhar no   " + adharNo[3]);
		System.out.println("kiran Adhar no   " + adharNo[4]);
		System.out.println("basavraj Adhar no    " + adharNo[5]);
		System.out.println("harshita Adhar no   " + adharNo[6]);
		System.out.println("vandu Adhar no    " + adharNo[7]);

		long adharIndex = adharNo[8];
		long adharIndex1 = adharNo[9];
		long adharIndex2 = adharNo[10];
		System.out.println("adhar index8 " + adharIndex);
		System.out.println("adhar index9 " + adharIndex1);
		System.out.println("adhar index10 " + adharIndex2);

		// Bank Account
		long bankAcc1 = 1111555588887777L;
		long bankAcc2 = 8888666633330000L;
		long bankAcc3 = 5555444466662222L;
		long bankAcc4 = 3333111122227777L;
		long bankAcc5 = 9999666600008888L;
		long bankAcc6 = 3333444411116666L;
		long bankAcc7 = 1111222233334444L;
		long bankAcc8 = 1111111111111111L;
		long bankAcc9 = 1111222233334444L;

		long[] bankAccountNo = { bankAcc1, bankAcc2, bankAcc3, bankAcc4, bankAcc5, bankAcc6, bankAcc7, bankAcc8,
				bankAcc9 };

		for (int accNo = 0; accNo < bankAccountNo.length; accNo++) {
			System.out.println("Bank Acc No. " + bankAccountNo[accNo]);
		}

		// PinCode

		int pincode1 = 111155;
		int pincode2 = 888866;
		int pincode3 = 555544;
		int pincode4 = 333311;
		int pincode5 = 999966;
		int pincode6 = 333344;
		int pincode7 = 111122;
		int pincode8 = 111111;
		int pincode9 = 111122;
		int pincode10 = 591214;
		int[] pinCode = { pincode1, pincode2, pincode3, pincode4, pincode5, pincode6, pincode7, pincode8, pincode9,
				pincode10 };

		for (int pin = 0; pin < pinCode.length; pin++) {
			System.out.println("Pin Code " + pinCode[pin]);
		}

		// Order ID
		int orderId1 = 111155;
		int orderId2 = 888866;
		int orderId3 = 555544;
		int orderId4 = 333311;
		int orderId5 = 999966;
		int orderId6 = 333344;
		int orderId7 = 111122;
		int orderId8 = 111111;
		int orderId9 = 111122;
		int orderId10 = 591214;

		int[] orderId = { orderId1, orderId2, orderId3, orderId4, orderId5, orderId6, orderId7, orderId8, orderId9,
				orderId10 };

		for (int id = 0; id < orderId.length; id++) {
			System.out.println("Order Id" + orderId[id]);
		}

		// Marks Card No.
		int marksCard1 = 11;
		int marksCard2 = 22;
		int marksCard3 = 33;
		int marksCard4 = 44;
		int marksCard5 = 55;
		int marksCard6 = 66;
		int marksCard7 = 77;
		int marksCard8 = 88;
		int marksCard9 = 99;
		int marksCard10 = 111;

		int[] marksCard = { marksCard1, marksCard2, marksCard3, marksCard4, marksCard5, marksCard6, marksCard7,
				marksCard8, marksCard9, marksCard10 };

		for (int Mcard = 0; Mcard < marksCard.length; Mcard++) {
			System.out.println("Marks Card No. " + marksCard[Mcard]);
		}

		// Roll No

		int rollNo1 = 20;
		int rollNo2 = 21;
		int rollNo3 = 22;
		int rollNo4 = 23;
		int rollNo5 = 24;
		int rollNo6 = 25;
		int rollNo7 = 26;
		int rollNo8 = 27;
		int rollNo9 = 28;
		int rollNo10 = 11;

		int[] rollNo = { rollNo1, rollNo2, rollNo3, rollNo4, rollNo5, rollNo6, rollNo7, rollNo8, rollNo9, rollNo10 };

		for (int rollno = 0; rollno < rollNo.length; rollno++) {
			System.out.println("Roll No " + rollNo[rollno]);
		}

		// Otp

		int otp1 = 201144;
		int otp2 = 215544;
		int otp3 = 227799;
		int otp4 = 233333;
		int otp5 = 247777;
		int otp6 = 258899;
		int otp7 = 262233;
		int otp8 = 274455;
		int otp9 = 287789;
		int otp10 = 112233;

		int[] OTP = { otp1, otp2, otp3, otp4, otp5, otp6, otp7, otp8, otp9, otp10 };

		for (int otp = 0; otp < OTP.length; otp++) {
			System.out.println("Roll No " + OTP[otp]);
		}

		// Application
		String ver1 = "1.2.v1122";
		String ver2 = "1.2.v1232.f";
		String ver3 = "1.2.v121.";
		String ver4 = "1.2.g12.t5.";
		String ver5 = "1.2.v12q2.e4";
		String ver6 = "1.2.v1.21f.e.0";
		String ver7 = "1.2.v1232.w213g";
		String ver8 = "1.2.v12.dr.5yr56.h";
		String ver9 = "1.2.v123g2.H";
		String ver10 = "1.2.v12.3v2.";

		String version[] = { ver1, ver2, ver3, ver4, ver5, ver6, ver7, ver8, ver9, ver10 };

		for (String ver : version) {
			System.out.println("Application version " + ver);
		}

		// IP Adress

		String ip1 = "192.158.1.38";
		String ip2 = "111.232.6.87";
		String ip3 = "222.333.5.44";
		String ip4 = "888.666.1.99";
		String ip5 = "111.222.3.44";
		String ip6 = "444.555.6.77";
		String ip7 = "777.888.9.01";
		String ip8 = "009.888.7.66";
		String ip9 = "666.555.4.33";
		String ip10 = "333.222.1.99";

		String ip[] = { ip1, ip2, ip3, ip4, ip5, ip6, ip7, ip8, ip9, ip10 };

		for (String IP : ip) {
			System.out.println(IP);
		}

		// Form No
		int formNo1 = 1;
		int formNo2 = 2;
		int formNo3 = 3;
		int formNo4 = 4;
		int formNo5 = 5;
		int formNo6 = 6;
		int formNo7 = 7;
		int formNo8 = 8;
		int formNo9 = 9;
		int formNo10 = 10;

		int formNo[] = { formNo1, formNo2, formNo3, formNo4, formNo5, formNo6, formNo7, formNo8, formNo9, formNo10 };

		for (int FormNo = 0; FormNo < formNo.length; FormNo++) {
			System.out.println("form No " + formNo[FormNo]);
		}

		// IMEI No
		long imei1 = 111155558888777712L;
		long imei2 = 8888666633330000L;
		long imei3 = 3333111122227777L;
		long imei4 = 3333444411116666L;
		long imei5 = 1111222233334444L;
		long imei6 = 1111222233334444L;
		long imei7 = 86604008651122334L;
		long imei8 = 81399666511212121L;
		long imei9 = 1111222233334111111L;
		long imei10 = 1111222233334444555L;

		long IMEI[] = { imei1, imei2, imei3, imei4, imei5, imei6, imei7, imei8, imei9, imei10 };

		for (long imei = 0; imei < IMEI.length; imei++) {
			System.out.println("IMEI NO " + imei);
		}
	}
}
