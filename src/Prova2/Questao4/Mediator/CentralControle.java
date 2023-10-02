package Prova2.Questao4.Mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralControle implements IMediator{
    private List<PainelControle> painelControleList = new ArrayList<>();

    @Override
    public void registrarPainelControle(PainelControle painelControle) {
        painelControleList.add(painelControle);
    }

    @Override
    public void ajustarTemperatura(PainelControle painelControle) {
        for(PainelControle outroPainelControle : painelControleList) {
            if(!outroPainelControle.equals(painelControle)) {
                outroPainelControle.receberAjusteTemperatura();
            }
        }
    }

    @Override
    public void ajustarIluminacao(PainelControle painelControle) {
        for(PainelControle outroPainelControle : painelControleList) {
            if(!outroPainelControle.equals(painelControle)) {
                outroPainelControle.receberAjusteIluminacao();
            }
        }
    }
}
