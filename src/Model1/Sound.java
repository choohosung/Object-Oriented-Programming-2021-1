package Model1;

interface Sound {
	public void crying();
}

class Cat implements Sound {
	public void crying() {
		System.out.println("具克");
	}
}

class Dog implements Sound {
	public void crying() {
		System.out.println("港港");
	}
}

class Tiger implements Sound {
	public void crying() {
		System.out.println("绢蕊");
	}
}