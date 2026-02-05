package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
      CarService carService = context.getBean(CarService.class);

//      User user1 = new User("User1", "Lastname1", "user1@mail.ru");
//      Car car1 = new Car("car1", 1);
//      carService.addCar(car1);
//      user1.setCar(car1);
//      userService.addUser(user1);

//      User user2 = new User("User2", "Lastname2", "user2@mail.ru");
//      Car car2 = new Car("car2", 2);
//      carService.addCar(car2);
//      user2.setCar(car2);
//      userService.addUser(user2);

//      User user3 = new User("User3", "Lastname3", "user3@mail.ru");
//      Car car3 = new Car("car3", 3);
//      carService.addCar(car3);
//      user3.setCar(car3);
//      userService.addUser(user3);

//      User user4 = new User("User4", "Lastname4", "user4@mail.ru");
//      Car car4 = new Car("car4", 4);
//      carService.addCar(car4);
//      user4.setCar(car4);
//      userService.addUser(user4);

//      List<User> users = userService.printUsers();
//      List<Car> cars = carService.printCars();
//      System.out.println(users);
//      System.out.println(cars);

      System.out.println(userService.getUserByCar("car3", 3));

      context.close();
   }
}
