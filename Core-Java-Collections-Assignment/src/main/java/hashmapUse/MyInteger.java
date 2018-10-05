package hashmapUse;

public class MyInteger implements Comparable<MyInteger> {
	
	private int key;

	public MyInteger(int i) {
		key=i;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "MyInteger [key=" + key + "]";
	}

	@Override
	public int compareTo(MyInteger myInt) {
		// TODO Auto-generated method stub
		return getKey()-myInt.getKey();
	}
	
}
