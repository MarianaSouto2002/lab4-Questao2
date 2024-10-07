public class CafeDecorator implements Cafe{

    protected Cafe cafe;

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public double calculaCusto() {
        return 0;
    }
}
