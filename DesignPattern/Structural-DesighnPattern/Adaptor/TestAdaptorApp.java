package Adaptor;

public class TestAdaptorApp {

	public static void main(String[] args) {

		// create a java project and compile with java compiler.

		JavaProject javaProject = new JavaProject();
		javaProject.compile(new JavaCompiler() {

			@Override
			public void compileJAVASourceCode() {
				System.out.println(" A java compiler...");
			}

		});

		// create a pyhton project and compile with python compiler.
		PythonProject pythonProject = new PythonProject();
		pythonProject.compile(new PythonCompiler() {

			@Override
			public void compilePythonSourceCode() {
				System.out.println("A Python compiler....");
			}
		});

		// let's compile the same python project with java compiler.
		CompilePythonCodeWithJavaCompiler compilePythonCodeWithJavaCompiler = new CompilePythonCodeWithJavaCompiler(
				new JavaCompiler() {

					@Override
					public void compileJAVASourceCode() {
						System.out.println("A JAVA Compiler.... making combatible with python project...");
					}
				});
		compilePythonCodeWithJavaCompiler.compileJAVASourceCode();
	}

}
