public class JogoSave3 implements JogoSave {

    private JogoSave3() {};
    private static JogoSave3 instance = new JogoSave3();
    public static JogoSave3 getInstance() {
        return instance;
    }
    
    public String getNumeroSave() {
        return "Save3 selecionado com sucesso";
    }

}
