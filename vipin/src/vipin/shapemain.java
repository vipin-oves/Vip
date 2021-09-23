package vipin;

public class shapemain {

	public static void main(String[] args) {
		rectangle r1=new rectangle();
		triangle t1=new triangle();
		cube c1=new cube();
		sphere s1=new sphere();
		r1.setValues(14,15);
		r1.getHeight();
		r1.getWidth();
		r1.Area();
		r1.Volume();
		t1.setValues(10, 20);
		t1.getBase();
		t1.getHeight();
		t1.Area();
		t1.Volume();
		c1.setValues(5, 7, 9);
		c1.getHeight();
		c1.getlength();
		c1.getwidth();
		c1.Area();
		c1.Volume();
		s1.setValues(14);
		s1.getradius();
		s1.Area();
		s1.Volume();
		t1.setValues(24, 18);
		t1.getBase();
		t1.getHeight();
		t1.Area();
		t1.Volume();
      
	}

}
