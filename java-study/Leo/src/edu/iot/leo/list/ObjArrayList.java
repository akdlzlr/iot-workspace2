package edu.iot.leo.list;

public class ObjArrayList<E> implements ObjList<E> {

//	琶球
	final static int INTIAL_SIZE = 10; // capacity 遂勲
	private E[] arr;
	private int size;

	
	
//	持失切
	public ObjArrayList() {
		arr = (E[])(new Object[INTIAL_SIZE]);
		size = 0;
	}

	public ObjArrayList(int length) {
		arr = (E[])(new Object [length]);
		size = 0;
	}

	
	
//	神獄虞戚漁 古辞球
	@Override
	public void add(E obj) {
		if (size == arr.length) {
			expand(); // 壕伸 溌舌
		}
		arr[size] = obj;
		size++;
	}

////////////////////////////////////////////////////////////////////////////////////////
//	猿陥稽錘 庁姥級
	@Override
	public void add(int index, E obj) { // index 是帖拭 obj 諮脊
//		昔畿什亜 紫戚綜左陥 適 井酔 森須坦軒 背醤器ぞぞぞ
		if(index>size||index<0) {
			throw new ListIndexOutOfBounceException("昔畿什 葵 : "+index);
		}
		if (size == arr.length) {
			expand(); // 壕伸 溌舌
		}

		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1]; // 据掘 赤揮 汽戚斗亜 腔形蟹澗 鋼差庚
		}

		arr[index] = obj;
		size++;
	}

	@Override
	public E remove(int index) {
//		昔畿什亜 紫戚綜左陥 適 井酔 森須坦軒 背醤器ぞぞぞ
		E obj = arr[index];
		int i;
		for (i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = null;
		size--;
		return obj;
	}
///////////////////////////////////////////////////////////////////////////////////////
	@Override
	public E get(int index) {
//		昔畿什亜 紫戚綜左陥 適 井酔 森須坦軒 背醤器ぞぞぞ
		return arr[index];
	}

	@Override
	public void set(int index, E obj) {
//		昔畿什亜 紫戚綜左陥 適 井酔 森須坦軒 背醤器ぞぞぞ
		arr[index] = obj;
	}

	@Override
	public void swap(int i1, int i2) {
//		昔畿什亜 紫戚綜左陥 適 井酔 森須坦軒 背醤器ぞぞぞ
		if(i1>size||i1<0) {
			throw new ListIndexOutOfBounceException("昔畿什1 葵 : "+i1);
		}
		if(i2>size||i2<0) {
			throw new ListIndexOutOfBounceException("昔畿什2 葵 : "+i2);
		}
		E temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;

	}

	@Override
	public int size() {
		return size;
	}

	
	
//	益撹 琶推廃 五辞球
	private void expand() {
		E[] arr2 =(E[]) (new Object[2 * arr.length]);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr = arr2;
	}
}