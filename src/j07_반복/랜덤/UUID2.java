package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID2 {

	public static void main(String[] args) {
		
		/*
		 * 이미지 첨부 : 강아지1.jpg
		 * 저장된 이미지 : 강아지1_UUID.jpg
		 * 다운시 이미지 명 : 강아지1.jpg
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String photo;
		System.out.print("이미지 첨부 : ");
		photo = sc.next();
		int p1 = photo.indexOf(".");
		int p2 = photo.length();
//		String pho1 = photo.substring(0,p1);
//		String pho2 = photo.substring(p1,p2);
		String Upho = photo.substring(0,p1) + "_" + (UUID.randomUUID().toString()) + photo.substring(p1,p2);
//		System.out.println("저장된 이미지 : " +Upho);
		System.out.println("저장된 이미지 : " +photo.substring(0,photo.indexOf("."))+ "_" + (UUID.randomUUID().toString())+ photo.substring(photo.indexOf("."),photo.length()));
//		int p3 = Upho.lastIndexOf("_");
//		int p4 = Upho.indexOf(".");
		
		
		
		System.out.println("다운시 이미지 명 : " + Upho.substring(0,Upho.lastIndexOf("_")) + Upho.substring(Upho.indexOf("."),Upho.length()));
		
//		
//		String image;
//		String saveImage;
//		String downImage;
//		System.out.println("이미치 첨부");
//		image = sc.next();
//		saveImage = image.substring(0,image.indexOf(".")) + "_" + UUID.randomUUID().toString() + image.substring(image.indexOf(".",image.length()));
//		
//		System.out.println("저장된 이미지" + saveImage);
//		downImage = saveImage.substring(0,saveImage.lastIndexOf("_")) + saveImage.substring(saveImage.indexOf(".",saveImage.length()));
//		
//		System.out.println("다운시 이미지 : " + downImage);

	}

}
