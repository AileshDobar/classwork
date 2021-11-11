class Paper {
	void reading() {
		System.out.println("For News");
	}

	void reading1() {
		System.out.println("another method");
	}
}

class TissuePaper extends Paper {
	void reading() {
		System.out.println("For Clean");
	
	super.reading();
	}
}

class Keep extends Paper {
	void reading() {
		System.out.println("For Parcel");
	}
}

class NewsPaper {
	public static void main(String[] args) {
		Paper a=new TissuePaper();
		a.reading();
//		a.reading1();
	}
}
