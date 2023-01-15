import java.io.*;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import com.google.gson.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("output.json");
//        fw.write(new Gson().toJson("Simple string"));
//        Application.launch(args);

        Shelf A = new Shelf();

        A.input("A", "A");
        A.input("B", "B");
        A.input("C", "C");

        A.search("B");
    }
}
//        @Override
//        public void start (Stage stage) throws Exception {
//            BufferedReader br = new BufferedReader(new FileReader("Book.json"));
//            Shelf _json = new Gson().fromJson(br, Shelf.class);
//            System.out.println("\nПолный список:");
//            _json.output();
//            System.out.println();
//            FileWriter fw = new FileWriter("output.json");
//            fw.write(new Gson().toJson("Simple string"));

//            // создаем список объектов
//            ObservableList<Book> people = FXCollections.observableArrayList(_json.t
//            );
//            people.addListener(new ListChangeListener<Book>() {
//                @Override
//                public void onChanged(Change<? extends Book> change) {
//                    System.out.println("Detected a change");
//                }
//            });
//            // определяем таблицу и устанавливаем данные
//            TableView<Book> table = new TableView<Book>(people);
//            table.setPrefWidth(250);
//            table.setPrefHeight(200);
//
//            // столбец для вывода имени
//            TableColumn<Book, String> nameColumn = new TableColumn<Book, String>("Name");
//            // определяем фабрику для столбца с привязкой к свойству name
//            nameColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
//            // добавляем столбец
//            table.getColumns().add(nameColumn);
//
//            // столбец для вывода возраста
//            TableColumn<Book, String> ageColumn = new TableColumn<Book, String>("Author");
//            ageColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("author_name"));
//            table.getColumns().add(ageColumn);
//            table.sort();
//            FlowPane root = new FlowPane(10, 10, table);
//
//            Scene scene = new Scene(root, 300, 250);
//
//            stage.setScene(scene);
//            stage.setTitle("TableView in JavaFX");
//            stage.show();
//            people.add(new Book("author2","book24"));
//            people.sort((o1, o2) -> o2.name.compareTo(o1.name));
//
////            fw.close();