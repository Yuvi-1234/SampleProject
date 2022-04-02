package org.sample;

public class HdfcBank implements RbiBank,worldBank {
      @Override
    public void savings() {
    	System.out.println("3%");
    }
     public void fixed() {
    	 System.out.println("10%");
     }
    public static void main (String args[]) {
    	HdfcBank h = new HdfcBank();
    	h.savings();
    	h.fixed();
    }
}
