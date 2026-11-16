class FileManager {
    private Logger logger

    FileManager() {
        this.logger = new Logger()
    }

    def processFile(String fileName) {
        File inputFile = new File(fileName)

        if (!inputFile.exists()) {
            logger.log("Error: El fichero '${fileName}' no existe.")
            return
        }

        // 1. Lectura del fichero
        logger.log("Leyendo el fichero: ${fileName}")
        List<String> lines = inputFile.readLines()

        // 2. Transformación funcional (filtrar líneas vacías y transformar a mayúsculas)
        logger.log("Transformando el contenido del fichero: ${fileName}")
        List<String> transformedLines = lines
            .findAll { it.trim() != "" }
            .collect { it.toUpperCase() }

        // 3. Escritura en el nuevo fichero con el prefijo "copy_"
        String outputFileName = "copy_${inputFile.name}"
        File outputFile = new File(outputFileName)
        logger.log("Escribiendo el contenido transformado en: ${outputFileName}")
        outputFile.text = transformedLines.join("\n")
    }

    static void main(String[] args) {
        if (args.length == 0) {
            println("Uso: groovy FileManager.groovy <nombre_del_fichero>")
            return
        }

        FileManager fileManager = new FileManager()
        fileManager.processFile(args[0])
    }
}
