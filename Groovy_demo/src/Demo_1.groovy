
class Demo_1 {
	static void main(String[] args) {
		def file = new File('/Users/misba.zainab/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/Groovy_demo')
		println "File? ${file.isFile()}"
		println "Directory? ${file.isDirectory()}"
	}
}