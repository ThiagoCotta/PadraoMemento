import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private JogoSave save;
    private List<JogoSave> memento = new ArrayList<JogoSave>();

    public JogoSave getSave() {
        return this.save;
    }

    public void setSave(JogoSave save) {
        this.save = save;
        this.memento.add(this.save);
    }

    public void restauraSave(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Esse save não existe");
        }
        this.save = this.memento.get(indice);
    }

    public List<JogoSave> getSaves() {
        return this.memento;
    }
}
