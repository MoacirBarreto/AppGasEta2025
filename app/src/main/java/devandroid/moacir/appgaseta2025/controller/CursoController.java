package devandroid.moacir.appgaseta2025.controller;

import java.util.ArrayList;
import java.util.List;
import devandroid.moacir.appgaseta2025.model.Curso;

public class CursoController {
    private List listCursos;

    public List getGetListaDeCursos() {
        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));

        return listCursos;
    }
    public ArrayList <String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getGetListaDeCursos().size(); i++) {
            Curso objeto =  (Curso) getGetListaDeCursos().get(i);
            objeto.getNomeDoCursoDesejado();
            dados.add(objeto.getNomeDoCursoDesejado());
        }
        return dados;
    }


}
