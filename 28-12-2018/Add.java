class Add<T extends Number>
{
	T x1;
	T x2;
	T y;
	
	public Add(T x1,T x2)
	{
		this.x1=x1;
		this.x2=x2;
	}
	public T sum()
	{
		y=(Integer)(x1+x2);
		return y;
	}
}