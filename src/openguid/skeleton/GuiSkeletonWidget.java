package openguid.skeleton;

public abstract class GuiSkeletonWidget extends GuiSkeleton
	implements IPositionnable, ISizeable
{
	private int positionX;
	private int positionY;
	
	private int width;
	private int height;
	
	public GuiSkeletonWidget(int x, int y, int width, int height)
	{
		positionX = x;
		positionY = y;
		this.width = width;
		this.height = height;
	}
	
	public GuiSkeletonWidget(int x, int y)
	{
		this(x, y, 0, 0);
	}
	
	public GuiSkeletonWidget()
	{
		this(0, 0, 0, 0);
	}
	
	@Override
	public int getWidth()
	{
		return width;
	}

	@Override
	public int getHeight()
	{
		return height;
	}

	@Override
	public void setWidth(int x)
	{
		assert(x > 0);
		width = x;
	}

	@Override
	public void setHeight(int y)
	{
		assert(y > 0);
		height = y;
	}

	@Override
	public int getPositionX()
	{
		return positionX;
	}

	@Override
	public int getPositionY()
	{
		return positionY;
	}

	@Override
	public void setPositionX(int x)
	{
		assert(x > 0);
		positionX = x;
	}

	@Override
	public void setPositionY(int y)
	{
		assert(y > 0);
		positionY = y;
	}
}
