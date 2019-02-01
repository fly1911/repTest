package snippet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest {
	public static void main2(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		Object eval = engine.eval("Math.floor((5/3))");
		System.out.println(Double.parseDouble(eval.toString()));

	}

	public static void main(String[] args) throws Exception {
		ScriptEngine js = new ScriptEngineManager()
				.getEngineByName("javascript");
		Bindings bindings = js.getBindings(ScriptContext.ENGINE_SCOPE);
		bindings.put("java_out", System.out);
		js.eval("var a='hello';java_out.println(a);");
		js.eval(new InputStreamReader(new FileInputStream(new File("E:\\testJava\\diylqg.js")),"utf-8"));
        js.eval("java_out.println(showParentModal(1,2))");	
        
	}
}
