import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Test1
{
	public static final int SECONDS = 1000; //measured in milliseconds
	public static void keyControl(String a)
	{
		switch(a.toLowerCase())
		{
			case "down": DOWNKey(); break;
		}
	}
	private static void keyDOWN()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void keyUP()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_UP);
			rbt.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void keyRIGHT()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_RIGHT);
			rbt.keyRelease(KeyEvent.VK_RIGHT);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void keyLEFT()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_LEFT);
			rbt.keyRelease(KeyEvent.VK_LEFT);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key1()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_1);
			rbt.keyRelease(KeyEvent.VK_1);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key2()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_2);
			rbt.keyRelease(KeyEvent.VK_2);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key3()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_3);
			rbt.keyRelease(KeyEvent.VK_3);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key4()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_4);
			rbt.keyRelease(KeyEvent.VK_4);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key5()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_5);
			rbt.keyRelease(KeyEvent.VK_5);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key6()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_6);
			rbt.keyRelease(KeyEvent.VK_6);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key7()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_7);
			rbt.keyRelease(KeyEvent.VK_7);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key8()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_8);
			rbt.keyRelease(KeyEvent.VK_8);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key9()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_9);
			rbt.keyRelease(KeyEvent.VK_9);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key0()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_0);
			rbt.keyRelease(KeyEvent.VK_0);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	private static void key[replace]()
	{
		try
		{
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_[replace]);
			rbt.keyRelease(KeyEvent.VK_[replace]);
			Thread.sleep(SECONDS);
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}	
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	
	
	
	
	
	
	
}
