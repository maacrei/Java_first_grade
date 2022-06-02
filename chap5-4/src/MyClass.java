class MyClass {
	private String myName = "";
	public void hello() {
		System.out.println(myName + "です。こんにちは。");
	}
	public void setMyName(String name) {
		if (myName == "") {
			myName = name;
		}
	}
	public void renameMyName(String name) {
		if (myName != "") {
			myName = name;
		}
	}
}
