import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.squaresofnumbers.sqrservices.SQRService;

public class SQRServiceTest {
    @Test
    public void ShouldCalcExact() {

        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.calcSqr(100, 500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcMinExact() {

        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqr(0, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcNullExact() {

        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcNegativeNumb() {

        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(-100, -200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcMaxExact() {

        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqr(100, 2147483647);

        Assertions.assertEquals(expected, actual);
    }
}
