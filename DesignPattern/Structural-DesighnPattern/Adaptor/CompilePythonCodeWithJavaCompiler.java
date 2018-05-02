package Adaptor;

/**
 * This is the adaptor class which allows the user to compile Python code with
 * java compiler.
 * 
 * @author raviranjan
 *
 */
public class CompilePythonCodeWithJavaCompiler implements JavaCompiler {

	private JavaCompiler javaCompiler;

	public CompilePythonCodeWithJavaCompiler(JavaCompiler javaCompiler) {
		this.javaCompiler = javaCompiler;
	}

	@Override
	public void compileJAVASourceCode() {
		System.out.println("compiling python source code with java compiler...!");
		javaCompiler.compileJAVASourceCode();
	}
}
