package behavioral_test.template;

public class TemplateDemo {

    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader() {
            @Override
            protected String updateContent(String fileContent) {
                String newContent = fileContent + "\n" + "Michal will be a good programmer one day.";
                return newContent;
            }

            @Override
            protected void onError(Exception e) {
                System.out.println("FCK ERROR:");
                e.printStackTrace();
            }
        };

        fileLoader.modifyFile("src/main/java/behavioral_test/template/hey.txt");
        fileLoader.modifyFile("src/main/java/behavioral_test/template/second.txt");
    }
}
