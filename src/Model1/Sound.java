package Model1;

interface Sound {
	public void crying();
}

class Cat implements Sound {
	public void crying() {
		System.out.println("�߿�");
	}
}

class Dog implements Sound {
	public void crying() {
		System.out.println("�۸�");
	}
}

class Tiger implements Sound {
	public void crying() {
		System.out.println("����");
	}
}