package br.com.about.me;

public class FormatCepExemple {

    public static void main(String[] args) throws CepInvalidoException {
        try {
            String cepFormato = formatarCep("52512544528");
            System.out.println(cepFormato);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regra de negocios");
        }


    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 13) {
            throw new CepInvalidoException();


        }
        return "525.125.445-28";
    }
}

