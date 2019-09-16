package com.modifiers.pack2;
import com.modifiers.pack1.*;

public class MemberLevel2 extends MemberLevel{

	public MemberLevel2(String ln, String fn, int ag, String ci) {
		super(ln, fn, ag, ci);
		
	}
	public void usingSuperClassVariables() {
	//	privateLastName = "Reagan";//доступно только в пределах  одного класса
	publicFirstName = "Ronald";
	protectedAge = 88;
	//defaultCity = "DC";//доступно в пределах одного package
		
	}
	public void usingSuperClassMethods() {
		//getPrivateLastName();//доступно только в пределах  одного клacca
		getPublicFirstName();
		getProtectedAge();
		//getDefaultCity();//доступно в пределах одного package
		
	}

}
