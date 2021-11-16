package com.xworkz.dp.dao;

import com.xworkz.dp.dto.BucketDTO;

public class BucketDAO {

	private BucketDTO[] bucketDTOs = new BucketDTO[25];
	private int cap = 0;

	public BucketDTO[] getBucketDTOs() {
		return bucketDTOs;
	}
	
	public void save(BucketDTO name) {
		
		if(this.cap<bucketDTOs.length && name!=null) {
			bucketDTOs[cap++]=name;
		}
		else {
			System.err.println("either array is full or you pointing index to null");
		}
	}
	
	public void delete(int index) {
		
		if(index>=0 && index<this.bucketDTOs.length && bucketDTOs[index]!=null){
			this.bucketDTOs[index]=null;
			System.out.println("index "+index+" is deleted");
		}
		else {
			System.err.println("not able to delete entered index is already null");
		}
		
	}
	
	public void update(int no,BucketDTO update) {
		
		if(no>=0 && no<this.bucketDTOs.length) {
			this.bucketDTOs[no]=update;
		}
	}
}
