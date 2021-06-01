public class Aluno {
    
    private String nome;
    private int id;
    private double media;

    protected double nota1;
    protected double nota2;
    
    public void imp_nome(){
        System.out.println(nome);
    }
    public void alt_nome(String nome){
        this.nome = nome;
    }
    public void imp_id(){
        System.out.println(id);
    }  
    public void alt_id(int id){
        this.id = id;
    }
    public void retornaMedia(){
        calculaMedia(nota1, nota2);
    }  
    public void passou(){
        if (media > 7){
            System.out.println(System.lineSeparator() + true);
        }else{
            System.out.println(System.lineSeparator() + false);
        }
    }

    private void calculaMedia(double nota1,double nota2){
        media = (nota1 + nota2)/2;
        System.out.print(media);
    }
    

}
