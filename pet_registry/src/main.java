package src;
import controller.Controller;
import model.FileOperation;
import model.Repository;
import view.View;

public class main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("animals.csv");
        Repository repository = new Repository(fileOperation);
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.run();
    }
}
