package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.CarGame;
import racingcar.domain.CarGameResult;
import racingcar.domain.RacingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRacingCarGame {
    private CarGame game;

    @BeforeEach
    public void setUp() {
        List<String> carNames = Arrays.asList("hyundai", "kia");
        this.game = new CarGame(carNames, 3);
        game.prepareCars();
    }

    @Test
    public void testGetCars() {
        List<RacingCar> cars = new ArrayList<>();
        cars.add(new RacingCar("hyundai"));
        cars.add(new RacingCar("kia"));

        assertEquals(game.getCars(), cars);
    }

    @Test
    public void testRun() {
        CarGameResult result1 = new CarGameResult(game.getCars());
        System.out.println(result1.getCars().get(0).toString());

        CarGameResult result2 = game.run();
        System.out.println(result2.getCars().get(0).toString());

        CarGameResult result3 = game.run();
        System.out.println(result3.getCars().get(0).toString());

        assertEquals(result1, result2);
        assertEquals(result2, result3);
    }

    @Test
    public void testPrintResult() {
        CarGameResult result1 = new CarGameResult(game.getCars());
        game.printResult(result1);

        CarGameResult result2 = game.run();
        game.printResult(result2);

        CarGameResult result3 = game.run();
        game.printResult(result3);
    }

    @Test
    public void testPrintWinner() {
        CarGameResult result1 = new CarGameResult(game.getCars());
        CarGameResult result2 = game.run();

        game.printWinners(result2);
    }

    @Test
    public void testGenerateRandomNumber() {
        System.out.println(CarGame.generateRandomNumber());
        System.out.println(CarGame.generateRandomNumber());
        System.out.println(CarGame.generateRandomNumber());
    }
}