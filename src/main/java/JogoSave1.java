public class JogoSave1 implements JogoSave {

    private JogoSave1() {};
    private static JogoSave1 instance = new JogoSave1();
    public static JogoSave1 getInstance() {
        return instance;
    }
    
    public String getNumeroSave() {
        return "Save1 selecionado com sucesso";
    }
    
}

