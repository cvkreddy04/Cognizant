package stringmethods;

 
 
	import static org.junit.Assert.*;  
	 
	import org.junit.Test;  
	  
	public class junit {  
	  
	    @Test  
	    public void testFindMax(){  
	        assertEquals(4,junit.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,junit.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }

		private static Object findMax(int[] is) {
			// TODO Auto-generated method stub
			return null;
		}  
	}  
