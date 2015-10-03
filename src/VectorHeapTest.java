import static org.junit.Assert.*;

import org.junit.Test;

public class VectorHeapTest {

	@Test
	public void testRemove() {
		VectorHeap<String> elementos = new VectorHeap<String>();
		String string1="ola";
		elementos.add(string1);
		if(elementos.remove().equals(string1)==false)
		{
			fail();
		}
	}

	@Test
	public void testAdd() {
		VectorHeap<String> elementos = new VectorHeap<String>();
		String string1="ola";
		elementos.add(string1);
		if(elementos.remove().equals(string1)==false)
		{
			fail();
		}
	}

	@Test
	public void testPercolateUp() {
		VectorHeap<String> elementos = new VectorHeap<String>();
		String string1="ola";
		String string2="ke";
		String string3="ase";
		elementos.add(string1);
		elementos.add(string2);
		elementos.add(string3);
		
		if(elementos.remove().equals(string1)==false)
		{
			fail();
		}
	}

}
