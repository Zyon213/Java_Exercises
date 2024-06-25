
class err {

	static void tryMe() throws IllegalAccessException {
		System.out.println("Inside try me");
		throw new IllegalAccessException("Demo");
	}


	public static void main(String args[]) {
		try {
			tryMe();
		} catch (IllegalAccessException e) {
			System.out.println("error");
		}
	}
}