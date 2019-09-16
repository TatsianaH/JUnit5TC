package com.modifiers.pack1;

public class TestMemberLevelPack1 {

	public static void main(String[] args) {
		MemberLevel ml = new MemberLevel("Steinbeck", "John", 68, "Salinas");
//ml.privateLastName = "Abc";//доступно только в пределах одного класса
ml.publicFirstName = "Antony";
ml.protectedAge = 24;
ml.defaultCity = "San Francisco";

//ml.getPrivateLastName();//доступно только в пределах одного класса
ml.getPublicFirstName();
ml.getProtectedAge();
ml.getDefaultCity();
	
	
	}

}
