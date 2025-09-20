package com.tnsif.interfacetointerface;

public class Main {

	public static void main(String[] args) {
		// Calling static methods directly from interfaces
        ParentInterface.showMessage();
        ChildInterface.showChildMessage();
	}

}
