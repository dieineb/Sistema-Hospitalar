package controle;

import visao.JanelaPrincipal;

public class App {
public static void main(String[] args) {

    JanelaPrincipal janela = new JanelaPrincipal();
    janela.setVisible(true);

    ControlePrincipal controlePrincipal = new ControlePrincipal(janela);
    
}
    
}
