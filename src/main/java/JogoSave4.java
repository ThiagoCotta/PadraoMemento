public class JogoSave4 implements JogoSave {

    private JogoSave4() {};
    private static JogoSave4 instance = new JogoSave4();
    public static JogoSave4 getInstance() {
        return instance;
    }

    public String getNumeroSave() {
        return "Save4 selecionado com sucesso";
    }

}
