package reflection.test;
import java.lang.reflect.Method;

public class ReflectionImpl {

	public static void main(String[] args) throws Exception{
		
		String		usePkg	=	"reflection.test";
		Class		cls		=	Class.forName(usePkg);
		PrivateDemo	demo	=	(PrivateDemo)cls.newInstance();
		
		Method		method	=	cls.getDeclaredMethod("displayMessage", null);
		method.setAccessible(true);
		method.invoke(demo, null);

	}

}
