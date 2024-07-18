package hexlet.code.games;

public class IsEvenClass implements IsEvenFunction{

    @Override
    public boolean checkIsEven() {
        return number % 2 == 0;
    }
}
