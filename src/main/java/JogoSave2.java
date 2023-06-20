public class JogoSave2 implements JogoSave {

    private JogoSave2() {};
    private static JogoSave2 instance = new JogoSave2();
    public static JogoSave2 getInstance() {
        return instance;
    }

    public String getNumeroSave() {
        return "Save2 selecionado com sucesso";
    }

}
