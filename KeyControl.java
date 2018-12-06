import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyControl
{	
	public static final int SHORT_PAUSE = 15; //measured in milliseconds
	public static final int MEDIUM_PAUSE = 50;
	public static final int LONG_PAUSE = 1000;
	
	public static void main(String[] args)
	{
		KeyControl("Windows");
		KeyControl("notepad");
		KeyControl("Enter");
		try
		{
		Thread.sleep(LONG_PAUSE);
		}
		catch (InterruptedException ex)
		{
			
		}
		KeyControl("Hello out there!");
	}
	public static void KeyControl(char a)
	{
		try
		{
			Robot rbt = new Robot();
			switch(a)
				{
					case 'a': rbt.keyPress(KeyEvent.VK_A); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_A); break;
					case 'b': rbt.keyPress(KeyEvent.VK_B); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_B); break;
					case 'c': rbt.keyPress(KeyEvent.VK_C); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_C); break;
					case 'd': rbt.keyPress(KeyEvent.VK_D); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_D); break;
					case 'e': rbt.keyPress(KeyEvent.VK_E); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_E); break;
					case 'f': rbt.keyPress(KeyEvent.VK_F); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F); break;
					case 'g': rbt.keyPress(KeyEvent.VK_G); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_G); break;
					case 'h': rbt.keyPress(KeyEvent.VK_H); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_H); break;
					case 'i': rbt.keyPress(KeyEvent.VK_I); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_I); break;
					case 'j': rbt.keyPress(KeyEvent.VK_J); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_J); break;
					case 'k': rbt.keyPress(KeyEvent.VK_K); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_K); break;
					case 'l': rbt.keyPress(KeyEvent.VK_L); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_L); break;
					case 'm': rbt.keyPress(KeyEvent.VK_M); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_M); break;
					case 'n': rbt.keyPress(KeyEvent.VK_N); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_N); break;
					case 'o': rbt.keyPress(KeyEvent.VK_O); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_O); break;
					case 'p': rbt.keyPress(KeyEvent.VK_P); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_P); break;
					case 'q': rbt.keyPress(KeyEvent.VK_Q); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Q); break;
					case 'r': rbt.keyPress(KeyEvent.VK_R); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_R); break;
					case 's': rbt.keyPress(KeyEvent.VK_S); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_S); break;
					case 't': rbt.keyPress(KeyEvent.VK_T); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_T); break;
					case 'u': rbt.keyPress(KeyEvent.VK_U); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_U); break;
					case 'v': rbt.keyPress(KeyEvent.VK_V); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_V); break;
					case 'w': rbt.keyPress(KeyEvent.VK_W); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_W); break;
					case 'x': rbt.keyPress(KeyEvent.VK_X); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_X); break;
					case 'y': rbt.keyPress(KeyEvent.VK_Y); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Y); break;
					case 'z': rbt.keyPress(KeyEvent.VK_Z); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Z); break;
					case '0': rbt.keyPress(KeyEvent.VK_0); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_0); break;
					case '1': rbt.keyPress(KeyEvent.VK_1); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_1); break;
					case '2': rbt.keyPress(KeyEvent.VK_2); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_2); break;
					case '3': rbt.keyPress(KeyEvent.VK_3); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_3); break;
					case '4': rbt.keyPress(KeyEvent.VK_4); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_4); break;
					case '5': rbt.keyPress(KeyEvent.VK_5); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_5); break;
					case '6': rbt.keyPress(KeyEvent.VK_6); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_6); break;
					case '7': rbt.keyPress(KeyEvent.VK_7); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_7); break;
					case '8': rbt.keyPress(KeyEvent.VK_8); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_8); break;
					case '9': rbt.keyPress(KeyEvent.VK_9); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_9); break;
					case '-': rbt.keyPress(KeyEvent.VK_MINUS); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_MINUS); break;
					case '=': rbt.keyPress(KeyEvent.VK_EQUALS); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_EQUALS); break;
					case '[': rbt.keyPress(KeyEvent.VK_OPEN_BRACKET); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_OPEN_BRACKET); break;
					case ']': rbt.keyPress(KeyEvent.VK_CLOSE_BRACKET); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_CLOSE_BRACKET); break;
					case ';': rbt.keyPress(KeyEvent.VK_SEMICOLON); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_SEMICOLON); break;
					case '\'': rbt.keyPress(KeyEvent.VK_QUOTE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_QUOTE); break;
					case ',': rbt.keyPress(KeyEvent.VK_COMMA); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_COMMA); break;
					case '.': rbt.keyPress(KeyEvent.VK_PERIOD); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_PERIOD); break;
					case '/': rbt.keyPress(KeyEvent.VK_SLASH); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_SLASH); break;
					case '\\': rbt.keyPress(KeyEvent.VK_BACK_SLASH); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_BACK_SLASH); break;
					case '`': rbt.keyPress(KeyEvent.VK_DEAD_ACUTE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_DEAD_ACUTE); break;
					case ' ': rbt.keyPress(KeyEvent.VK_SPACE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_SPACE); break;
					default: rbt.keyPress(KeyEvent.VK_SHIFT); break;
				}
				switch(a)
					{
						case 'A': rbt.keyPress(KeyEvent.VK_A); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_A); break;
						case 'B': rbt.keyPress(KeyEvent.VK_B); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_B); break;
						case 'C': rbt.keyPress(KeyEvent.VK_C); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_C); break;
						case 'D': rbt.keyPress(KeyEvent.VK_D); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_D); break;
						case 'E': rbt.keyPress(KeyEvent.VK_E); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_E); break;
						case 'F': rbt.keyPress(KeyEvent.VK_F); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F); break;
						case 'G': rbt.keyPress(KeyEvent.VK_G); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_G); break;
						case 'H': rbt.keyPress(KeyEvent.VK_H); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_H); break;
						case 'I': rbt.keyPress(KeyEvent.VK_I); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_I); break;
						case 'J': rbt.keyPress(KeyEvent.VK_J); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_J); break;
						case 'K': rbt.keyPress(KeyEvent.VK_K); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_K); break;
						case 'L': rbt.keyPress(KeyEvent.VK_L); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_L); break;
						case 'M': rbt.keyPress(KeyEvent.VK_M); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_M); break;
						case 'N': rbt.keyPress(KeyEvent.VK_N); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_N); break;
						case 'O': rbt.keyPress(KeyEvent.VK_O); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_O); break;
						case 'P': rbt.keyPress(KeyEvent.VK_P); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_P); break;
						case 'Q': rbt.keyPress(KeyEvent.VK_Q); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Q); break;
						case 'R': rbt.keyPress(KeyEvent.VK_R); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_R); break;
						case 'S': rbt.keyPress(KeyEvent.VK_S); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_S); break;
						case 'T': rbt.keyPress(KeyEvent.VK_T); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_T); break;
						case 'U': rbt.keyPress(KeyEvent.VK_U); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_U); break;
						case 'V': rbt.keyPress(KeyEvent.VK_V); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_V); break;
						case 'W': rbt.keyPress(KeyEvent.VK_W); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_W); break;
						case 'X': rbt.keyPress(KeyEvent.VK_X); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_X); break;
						case 'Y': rbt.keyPress(KeyEvent.VK_Y); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Y); break;
						case 'Z': rbt.keyPress(KeyEvent.VK_Z); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_Z); break;
						case ')': rbt.keyPress(KeyEvent.VK_0); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_0); break;
						case '!': rbt.keyPress(KeyEvent.VK_1); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_1); break;
						case '@': rbt.keyPress(KeyEvent.VK_2); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_2); break;
						case '#': rbt.keyPress(KeyEvent.VK_3); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_3); break;
						case '$': rbt.keyPress(KeyEvent.VK_4); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_4); break;
						case '%': rbt.keyPress(KeyEvent.VK_5); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_5); break;
						case '^': rbt.keyPress(KeyEvent.VK_6); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_6); break;
						case '&': rbt.keyPress(KeyEvent.VK_7); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_7); break;
						case '*': rbt.keyPress(KeyEvent.VK_8); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_8); break;
						case '_': rbt.keyPress(KeyEvent.VK_9); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_9); break;
						case '+': rbt.keyPress(KeyEvent.VK_MINUS); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_MINUS); break;
						case '=': rbt.keyPress(KeyEvent.VK_EQUALS); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_EQUALS); break;
						case '{': rbt.keyPress(KeyEvent.VK_OPEN_BRACKET); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_OPEN_BRACKET); break;
						case '}': rbt.keyPress(KeyEvent.VK_CLOSE_BRACKET); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_CLOSE_BRACKET); break;
						case ':': rbt.keyPress(KeyEvent.VK_SEMICOLON); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_SEMICOLON); break;
						case '"': rbt.keyPress(KeyEvent.VK_QUOTE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_QUOTE); break;
						case '<': rbt.keyPress(KeyEvent.VK_COMMA); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_COMMA); break;
						case '>': rbt.keyPress(KeyEvent.VK_PERIOD); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_PERIOD); break;
						case '?': rbt.keyPress(KeyEvent.VK_SLASH); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_SLASH); break;
						case '|': rbt.keyPress(KeyEvent.VK_BACK_SLASH); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_BACK_SLASH); break;
						case '~': rbt.keyPress(KeyEvent.VK_DEAD_ACUTE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_DEAD_ACUTE); break;
						default: break;
					}
				rbt.keyRelease(KeyEvent.VK_SHIFT);
				Thread.sleep(MEDIUM_PAUSE);
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
	public static void KeyControl(String a)
	{
		boolean isPresent = true;
		try
		{
			Robot rbt = new Robot();
			if (a.length() == 1)
				KeyControl(a.charAt(0));
			else if (a.length() == 0);
			else
			{
				switch(a.toLowerCase())
				{
				case "windows": rbt.keyPress(KeyEvent.VK_WINDOWS); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_WINDOWS); break;
				case "esc": // extra cases
				case "escape": rbt.keyPress(KeyEvent.VK_ESCAPE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_ESCAPE); break;
				case "delete": rbt.keyPress(KeyEvent.VK_DELETE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_DELETE); break;
				case "enter": rbt.keyPress(KeyEvent.VK_ENTER); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_ENTER); break;
				case "backspace": //extra cases
				case "back_space": rbt.keyPress(KeyEvent.VK_BACK_SPACE); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_BACK_SPACE); break;
				case "f1": rbt.keyPress(KeyEvent.VK_F1); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F1); break;
				case "f2": rbt.keyPress(KeyEvent.VK_F2); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F2); break;
				case "f3": rbt.keyPress(KeyEvent.VK_F3); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F3); break;
				case "f4": rbt.keyPress(KeyEvent.VK_F4); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F4); break;
				case "f5": rbt.keyPress(KeyEvent.VK_F5); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F5); break;
				case "f6": rbt.keyPress(KeyEvent.VK_F6); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F6); break;
				case "f7": rbt.keyPress(KeyEvent.VK_F7); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F7); break;
				case "f8": rbt.keyPress(KeyEvent.VK_F8); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F8); break;
				case "f9": rbt.keyPress(KeyEvent.VK_F9); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F9); break;
				case "f10": rbt.keyPress(KeyEvent.VK_F10); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F10); break;
				case "f11": rbt.keyPress(KeyEvent.VK_F11); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F11); break;
				case "f12": rbt.keyPress(KeyEvent.VK_F12); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_F12); break;
				case "capslock": // extra case
				case "caps_lock": rbt.keyPress(KeyEvent.VK_CAPS_LOCK); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_CAPS_LOCK); break;
				case "insert": rbt.keyPress(KeyEvent.VK_INSERT); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_INSERT); break;
				case "print_screen": case "prt_sc": case "prtsc": //extra cases
				case "printscreen": rbt.keyPress(KeyEvent.VK_PRINTSCREEN); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_PRINTSCREEN); break;
				case "tab": rbt.keyPress(KeyEvent.VK_TAB); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_TAB); break;
				case "home": rbt.keyPress(KeyEvent.VK_HOME); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_HOME); break;
				case "pageup": case "pgup": case "pg_up": //extra cases
				case "page_up": rbt.keyPress(KeyEvent.VK_PAGE_UP); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_PAGE_UP); break;
				case "pagedown": case "pgdown": case "pg_down": //extra cases
				case "page_down": rbt.keyPress(KeyEvent.VK_PAGE_DOWN); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_PAGE_DOWN); break;
				case "end": rbt.keyPress(KeyEvent.VK_END); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_END); break;
				case "uparrow": case "up_arrow": case "arrowup": case "arrow_up": //extra cases
				case "up": rbt.keyPress(KeyEvent.VK_UP); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_UP); break;
				case "downarrow": case "down_arrow": case "arrowdown": case "arrow_down": //extra cases
				case "down": rbt.keyPress(KeyEvent.VK_DOWN); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_DOWN); break;
				case "leftarrow": case "left_arrow": case "arrowleft": case "arrow_left": //extra cases
				case "left": rbt.keyPress(KeyEvent.VK_LEFT); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_LEFT); break;
				case "rightarrow": case "right_arrow": case "arrowright": case "arrow_right": //extra cases
				case "right": rbt.keyPress(KeyEvent.VK_RIGHT); Thread.sleep(SHORT_PAUSE); rbt.keyRelease(KeyEvent.VK_RIGHT); break;
				case "holdctrl": case "holdcontrol": case "hold_control": //extra cases
				case "hold_ctrl": rbt.keyPress(KeyEvent.VK_CONTROL); Thread.sleep(SHORT_PAUSE); break;
				case "holdshift": //extra cases
				case "hold_shift": rbt.keyPress(KeyEvent.VK_SHIFT); Thread.sleep(SHORT_PAUSE); break;
				case "holdalt": //extra cases
				case "hold_alt": rbt.keyPress(KeyEvent.VK_ALT); Thread.sleep(SHORT_PAUSE); break;
				case "releasectrl": case "releasecontrol": case "release_control": //extra cases
				case "release_ctrl": rbt.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(SHORT_PAUSE); break;
				case "releaseshift": //extra cases
				case "release_shift": rbt.keyRelease(KeyEvent.VK_SHIFT); Thread.sleep(SHORT_PAUSE); break;
				case "releasealt": //extra cases
				case "release_alt": rbt.keyRelease(KeyEvent.VK_ALT); Thread.sleep(SHORT_PAUSE); break;
				default: isPresent = false;
				}
				if(!isPresent)
					KeyControl(a.toCharArray());
			}
			Thread.sleep(MEDIUM_PAUSE);
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
	public static void KeyControl(char[] a)
	{
		for(int i = 0 ; i < a.length; i++)
		{
			KeyControl(a[i]);
		}
	}
}