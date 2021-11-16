package com.xworkz.dp;

import com.xworkz.dp.dto.ElevatorDTO;

public class ElevatorStarter {

	public static void main(String[] args) {
		
		ElevatorDTO eliDto= new ElevatorDTO();
		eliDto.setCompany("Mitsubishi"); //otis
		eliDto.setAcAvailable(true);
		eliDto.setFlore(9);
		eliDto.setMaxWaight(1120.50F);
		eliDto.setNoOfPeaple(8);
		eliDto.setOperatorNeeded(false);
		eliDto.setSefe(true);
	
		ElevatorDTO eliDto2=new ElevatorDTO("otis", 12, 1600.5F, false, 15, true, true);
		ElevatorDTO eliDto3=new ElevatorDTO("kone", 12, 1600.5F, false, 15, true, true);
		ElevatorDTO eliDto4=new ElevatorDTO("hitachi", 12, 1600.5F, false, 15, true, true);
		ElevatorDTO eliDto5=new ElevatorDTO("Schindler Elevators", 12, 1600.5F, false, 15, true, true);
		
		
		ElevatorDTO[] elevators=new ElevatorDTO[8];
		elevators[1]=eliDto;
		elevators[2]=eliDto2;
		elevators[3]=eliDto3;
		elevators[4]=eliDto4;
		elevators[5]=eliDto5;
		
		
		for(int no=0;no<elevators.length;no++) {
			
			ElevatorDTO ref=elevators[no];
			if(ref!=null) {
				System.out.println("elevator company : ".concat(ref.getCompany()));
				System.out.println("max no of peaple : ".concat(String.valueOf(ref.getNoOfPeaple())));
				System.out.println("Weight limit : ".concat(String.valueOf(ref.getMaxWaight())));
				System.out.println("AC is available : ".concat(String.valueOf(ref.isAcAvailable())));
				System.out.println("Operater needed : ".concat(String.valueOf(ref.isOperatorNeeded())));
				System.out.println("Company is safe : ".concat(String.valueOf(ref.isSefe())));
				System.out.println("----------------------------------------------");
			}
			else {
				System.err.println("index ".concat(String.valueOf(no)).concat(" is pointing to null"));
			}
		}
		
	}

}
