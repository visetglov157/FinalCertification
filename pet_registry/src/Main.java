package pet_registry.src;
import pet_registry.src.controller.Controller;
import pet_registry.src.model.FileOperation;
import pet_registry.src.model.Repository;
import pet_registry.src.view.View;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("animals.csv");
        Repository repository = new Repository(fileOperation);
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.run();
    }
}
