class switchs {
	
	int amp =0;
	String colors;
	String purpose;
	int s;
	switchs(int d,int a,String c,String p)
	{	s=d;
	        colors = c;
		amp =a;
		purpose = p;
	}
	public void state()
	{
		if(s==0)
		{System.out.println("Switch is in off state");
		fail();
		}
		else
		{System.out.println("Switch is in on state");
		explain();
		}
	} 
	
	public void explain()
	{
		System.out.println("Color of switch : "+colors);
		System.out.println("purpose of switch : "+purpose);
		System.out.println("Current : "+amp);
	}
	public void fail()
	{
		System.out.println("Switch is faulted");
	}
  }
