public class JogoSave5 implements JogoSave {

    private JogoSave5() {};
    private static JogoSave5 instance = new JogoSave5();
    public static JogoSave5 getInstance() {
        return instance;
    }

    public String getNumeroSave() {
        return "Save5 selecionado com sucesso";
    }

}
