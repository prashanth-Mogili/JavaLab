 class WildcardAverage<T extends Number>
{
	T[] nums;
	public WildcardAverage(T[] o)
	{
		nums=o;
	}
   public double average()
   {
	   double sum=0.0;
	   for(int i=0;i<nums.length;i++)
	    sum+=nums[i].doubleValue();
	  return(sum/nums.length);
   }
   
   public boolean sameAvg(WildcardAverage<?> ob)
   {
	   if(average() == ob.average())
		   return true;
	   else
		   return false;
   }
}

